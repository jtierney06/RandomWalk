public class randomWalk {
    public randomWalk() {
        Rectangle rect = new Rectangle(0, 0, 300, 300);
        rect.setColor(Color.LIGHT_GRAY);
        rect.fill();

        Ellipse border = new Ellipse(50, 50, 200, 200);
        border.setColor(Color.BLUE);
        border.draw();

        Ellipse walker = new Ellipse(150, 150, 10, 10);
        walker.setColor(Color.RED);
        walker.fill();

        int steps = 0;

        while (true) {
            int deltaX = (int) (Math.random() * 21) - 10;
            int deltaY = (int) (Math.random() * 21) - 10;

            walker.translate(deltaX, deltaY);
            steps++;

            double x = walker.getX() + 5;
            double y = walker.getY() + 5;
            double distance = Math.sqrt(Math.pow(x - 150, 2) + Math.pow(y - 150, 2));

            if (distance > 100) {
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Walker escaped in " + steps + " steps.");
    }

    public static void main(String[] args) {
        new randomWalk();
    }
}
