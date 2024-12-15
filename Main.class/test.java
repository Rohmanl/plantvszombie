public class test {

    public static void main(String[] args){

    GameWindow window = new GameWindow();

    String sunflowerImagePath = "sunflower.png"; 
    String peashooterImagePath = "peashooter.png"; 
    String zombieImagePath = "zombie.png"; 
    String roadblockZombieImagePath = "roadblock_zombie.png"; 
    String squashImage = "squash.png";
    String chomperImage = "chomper.png";
    String newspaperZombieImage = "newspaper_zombie.png";
    String wallnutImage = "wallnut.png";
    String bucketZombieImage = "bucket_zombie.png";
    String gargantuarImage = "gargantuar.png";
    String cherryBombImage = "cherry_bomb.png";


    window.addImage(sunflowerImagePath, 200, 180, 50, 50);
    window.addImage(sunflowerImagePath, 200, 100, 50, 50);
    window.addImage(sunflowerImagePath, 200, 260, 50, 50);
    window.addImage(sunflowerImagePath, 200, 340, 50, 50);
    window.addImage(sunflowerImagePath, 200, 420, 50, 50);

    window.addImage(squashImage, 260, 100, 150, 200);
    window.addImage(peashooterImagePath, 260, 180, 50, 50);
    window.addImage(peashooterImagePath, 260, 260, 50, 50);
    window.addImage(peashooterImagePath, 260, 340, 50, 50);
    window.addImage(peashooterImagePath, 260, 420, 50, 50);

    window.addImage(zombieImagePath, 400, 100, 50, 50);
    window.addImage(gargantuarImage, 550, 340, 150, 150);
    window.addImage(zombieImagePath, 500, 260, 50, 50);
    window.addImage(zombieImagePath, 480, 180, 50, 50);
    window.addImage(bucketZombieImage, 430, 180, 40, 70);

    window.addImage(roadblockZombieImagePath, 600, 150, 70, 100);
    window.addImage(roadblockZombieImagePath, 460, 420, 70, 100);
    window.addImage(roadblockZombieImagePath, 700, 420, 70, 100);

    window.addImage(chomperImage, 340, 260, 140, 70);
    window.addImage(chomperImage, 340, 150, 140, 70);
    window.addImage(chomperImage, 340, 420, 140, 70);
    window.addImage(chomperImage, 230, 70, 140, 70);

    window.addImage(wallnutImage, 340, 340, 50, 50);
    window.addImage(wallnutImage, 400, 340, 50, 50);

    window.addImage(squashImage, 400, 360, 150, 200);
    window.addImage(squashImage, 460, 360, 150, 200);

    window.addImage(cherryBombImage, 500, 340, 70,70);

    window.addImage(newspaperZombieImage, 700, 80, 70, 90);

    window.showWindow();
}
}
