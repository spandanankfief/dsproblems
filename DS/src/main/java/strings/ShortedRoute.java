package strings;

/**
 * Created by Spandana.K on 04-08-2021.
 */
public class ShortedRoute {
    public static void main(String[] args) {
        String inputRoute = "SNNNEWE";
        char[] routeArray = inputRoute.toCharArray();
        int xAxisTraverse = 0;
        int yAxisTraverse = 0;

        for (int i=0; i< routeArray.length && routeArray[i]!='\0'; i++){
            switch (routeArray[i]){
                case 'N': yAxisTraverse++;
                    break;
                case 'S': yAxisTraverse--;
                    break;
                case 'E': xAxisTraverse++;
                    break;
                case 'W': xAxisTraverse--;
                    break;
            }
        }

        System.out.println("Final X-axis displacement: "+xAxisTraverse+
                " Final Y-axis displacement: "+yAxisTraverse);

        if (xAxisTraverse>=0 && yAxisTraverse>=0){
            System.out.print("Shorted path for given path : ");
            while (xAxisTraverse > 0){
                System.out.print("E");
                xAxisTraverse--;
            }
            while (yAxisTraverse > 0){
                System.out.print("N");
                yAxisTraverse--;
            }

        }
    }
}
