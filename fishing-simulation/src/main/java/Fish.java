import java.util.Random;

abstract class Fish {
    int position_X, position_Y;
    int index;
    Random r = new Random();

    public int[] ChooseDirection() {
        int[] coords = {0,0};

        switch (r.nextInt(4)) {
            case 0:
                coords[0] = position_X + 1;
                coords[1] = position_Y;
                return coords ;
            case 1:
                coords[0] = position_X - 1;
                coords[1] = position_Y;
                return coords;
            case 2:
                coords[0] = position_X;
                coords[1] = position_Y - 1;
                return coords;
            case 3:
                coords[0] = position_X;
                coords[1] = position_Y + 1;
                return coords;
        }
        return coords;
    }

}