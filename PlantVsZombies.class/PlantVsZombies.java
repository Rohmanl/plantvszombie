import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

class GameAPI{
    private ArrayList<Garden> gameElements;

    public GameAPI(){
        this.gameElements = new ArrayList<>();
    }

    public void addElement(Garden element){
        gameElements.add(element);
        System.out.println("Added: " + element.getName());
    }

    public void removeElement(Garden element){
        if (gameElements.remove(element)){
            System.out.println("Removed: " + element.getName());
        } else {
            System.out.println("Element not found: " + element.getName());
        }
    }

    public void listElements(){
        System.out.println("Current elements in the game:");
        for (Garden element : gameElements){
            System.out.println(element);
        }
    }
}

class GameWindow extends JFrame{
    private Image backgroundImage;
    public GameWindow(){
        
        setTitle("Plants vs. Zombies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());
        backgroundImage = new ImageIcon("frontyard.png").getImage();
        if(backgroundImage.getWidth(null) == -1){
            System.out.println("Background image not found: frontyard.png");
        }
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(null); 
        setContentPane(backgroundPanel);
    }

    class BackgroundPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void addImage(String imagePath, int x, int y, int width, int height){
        try{
            System.out.println("Loading image: " + imagePath);
            ImageIcon icon = new ImageIcon(imagePath);
            if (icon.getIconWidth() == -1) {
                System.out.println("Image not found: " + imagePath);
                return;
            }
            Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            JLabel label = new JLabel(new ImageIcon(scaledImage));
            label.setBounds(x, y, width, height);

            ((BackgroundPanel) getContentPane()).add(label); 
            revalidate(); 
            repaint(); 
        } catch (Exception e){
            System.out.println("Error loading image: " + imagePath + " - " + e.getMessage());
        }
    }
    public void showWindow(){
        setVisible(true);
    }
}


public class PlantVsZombies{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] yCoordinates = {100, 180, 260, 340, 420};
        int[] xCoordinates = {200, 260, 320, 380, 440, 500, 560, 620, 680};
        GameWindow window = new GameWindow();

        String sunflowerImage = "sunflower.png";
        String peashooterImage = "peashooter.png";
        String zombieImage = "zombie.png";
        String roadblockZombieImage = "roadblock_zombie.png";
        String squashImage = "squash.png";
        String chomperImage = "chomper.png";
        String newspaperZombieImage = "newspaper_zombie.png";
        String wallnutImage = "wallnut.png";
        String bucketZombieImage = "bucket_zombie.png";
        String gargantuarImage = "gargantuar.png";
        String cherryBombImage = "cherry_bomb.png";

        System.out.println("Enter the number of Sunflowers:");
        int numSunflowers = scanner.nextInt();
        for (int i = 0; i < numSunflowers; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Sunflower " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(sunflowerImage, x, y, 50, 50);
        }

        System.out.println("Enter the number of Peashooters:");
        int numPeashooters = scanner.nextInt();
        for (int i = 0; i < numPeashooters; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Peashooter " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(peashooterImage, x, y, 50, 50);
        }

        System.out.println("Enter the number of Ordinary Zombies:");
        int numOrdinaryZombies = scanner.nextInt();
        for (int i = 0; i < numOrdinaryZombies; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Ordinary Zombie " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(zombieImage, x, y, 50, 50);
        }

        System.out.println("Enter the number of Roadblock Zombies:");
        int numRoadblockZombies = scanner.nextInt();
        for (int i = 0; i < numRoadblockZombies; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Roadblock Zombie " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(roadblockZombieImage, x, y, 70, 100);
        }
        
        System.out.println("Enter the number of Squash:");
        int numSquash = scanner.nextInt();
        for (int i = 0; i < numSquash; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Squash " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(squashImage, x, y, 150, 200);
        }

        System.out.println("Enter the number of Chomper:");
        int numChomper = scanner.nextInt();
        for (int i = 0; i < numChomper; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Chomper " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(chomperImage, x, y, 140, 70);
        }

        System.out.println("Enter the number of Newspaper Zombies:");
        int numNewspaperZombie = scanner.nextInt();
        for (int i = 0; i < numNewspaperZombie; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Newspaper Zombie " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(newspaperZombieImage, x, y, 70, 90);
        }

        System.out.println("Enter the number of Wallnut:");
        int numWallnut = scanner.nextInt();
        for (int i = 0; i < numWallnut; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Wallnut " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(wallnutImage, x, y, 50, 50);
        }

        System.out.println("Enter the number of Bucket Zombies:");
        int numBucketZombie = scanner.nextInt();
        for (int i = 0; i < numBucketZombie; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Bucket Zombie " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(bucketZombieImage, x, y, 40, 70);
        }

        System.out.println("Enter the number of Gargantuar:");
        int numGargantuar = scanner.nextInt();
        for (int i = 0; i < numGargantuar; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Gargantuar " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(gargantuarImage, x, y, 150, 150);
        }

        System.out.println("Enter the number of Cherry Bomb:");
        int numCherryBomb = scanner.nextInt();
        for (int i = 0; i < numCherryBomb; i++){
            System.out.println("Enter x (200, 260, 320, 380, 440, 500, 560, 620, 680) and y (100, 180, 260, 340, 420) for Cherry Bomb " + (i + 1) + ":");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            window.addImage(cherryBombImage, x, y, 70, 70);
        }
        
        window.showWindow();
        scanner.close();
    }
}
