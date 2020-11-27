package Module9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JulExample {

    public static final Logger logger = Logger.getLogger(
            JulExample.class.getName());

    public static void main(String[] args) {
        logger.info("Приложение запущено");
        logger.warning("Что-то случилось");
        logger.severe("Случилось что-то очень страшное");
        try {
            Files.readAllBytes(Paths.get("/file/does/not/exist"));
        } catch (IOException ioex) {
            logger.log(Level.SEVERE, "Error message", ioex);
        }
    }
}