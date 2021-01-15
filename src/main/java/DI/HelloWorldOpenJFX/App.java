package DI.HelloWorldOpenJFX;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = "";// SystemInfo.javaVersion();
        var javafxVersion = "";// SystemInfo.javafxVersion();
       
        Path rutaFicheroFXML = Paths.get(System.getProperty("user.dir"), "src/main/java/DI/HelloWorldOpenJFX/fxml", "Main.fxml");
        Parent root = null;
    		// We need to add a try catch to avoid Exceptions if the fxml document doesn't exist.
        try {
        	// FXMLLoader join our Front View FXML document (Main.fxml) and the Control Java class (MainController.java)     	
        	root = FXMLLoader.load(getClass().getResource(rutaFicheroFXML.toString()));
    	} catch (IOException e) {
    			System.out.print("EXCEPCION: No es capaz de encontrar Main.fxml");
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    	}
            
     //   var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + "." );
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}