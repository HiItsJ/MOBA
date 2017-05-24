/**
 * Created by alex on 5/23/17.
 */

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Zip extends Moba_Legend {

    /* name, image, xPosition, yPosition
     */

    public Zip (String fileName) {
        try {
            File pathToFile = new File(fileName);
            this.image = ImageIO.read(pathToFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        this.xPosition = 0;
        this.yPosition = 0;
        this.direction = 0;
        this.health = 100;
        this.name = "Zip";
    }

    @Override
    public void qAbility() {

    }

    @Override
    public void wAbility() {

    }

    @Override
    public void eAbility() {

    }


}
