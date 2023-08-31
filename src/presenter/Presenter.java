package presenter;
import model.*;
import view.View;
public class Presenter {


    public void run(){
    showLibrary();
    }

    ManagerLibrary ml = new ManagerLibrary();
    View view = new View();

    public void showLibrary(){
      try {

            int opt = view.showMenu();

            switch (opt){
                case 1:
                    addBook();
                    break;
                case 2:
                    ledBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    view.showGraphicMessage( ml.showBooks());
                    break;
                case 5:
                    view.showGraphicMessage(ml.showBooksReturned());
                    break;
                case 6:
                    view.showGraphicMessage(ml.showBooksLed());
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
            showLibrary();
       }catch (Exception e){
           view.showGraphicMessage("Estas ingresando un parametro incorrecto");
           showLibrary();

        }

    }

    public void addBook(){
    try {
        String tittle=view.readGraphicString("Ingrese el titulo del libro");
        String author =view.readGraphicString("Ingrese el autor del libro");
        ml.addBooks(tittle,author);
        view.showGraphicMessage("Libro agregado con exito");
    }catch (Exception e){
        view.showGraphicMessage("Error, esta ingresando un parametro incorrecto");
    }

    }
    public void ledBook(){
        try {
            String tittle = view.readGraphicString("Ingrese el titulo del libro que desea llevar: \n"+ml.showBooks());
            ml.ledBook(tittle);
            view.showGraphicMessage("LIBRO PRESTADO!");
        }catch (Exception e){
            view.showGraphicMessage("Error , estas ingresando parametros incorrectos");
        }

    }
    public void returnBook(){
        try {
            String tittle = view.readGraphicString("Ingrese el titulo del libro que va a devolver: \n"+ml.showBooksLed());
            ml.returnedBooks(tittle);
            view.showGraphicMessage("Libro devuelto con exito");
        }catch (Exception e){
           view.showGraphicMessage("Error, estas ingresando un parametro incorrecto");
        }

    }

}
