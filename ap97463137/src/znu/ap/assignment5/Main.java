package assignment5;

public class Main {

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();

        double max = (  Math.sqrt((-1000*-1000)+(-1000*-1000))  )/ (  -1000*Math.sin(-1000+-1000) + -1000*Math.cos(-1000+-1000)  );
        double min = (  Math.sqrt((-1000*-1000)+(-1000*-1000))  )/ (  -1000*Math.sin(-1000+-1000) + -1000*Math.cos(-1000+-1000)  );

        for(int x = -1000; x<=1000 ; x++){
            for(int y = -1000; y<=1000 ;y++){
                 if( max < ((  Math.sqrt((x*x)+(y*y))  )/ (  x*Math.sin(x+y) + y*Math.cos(x+y)  ) )){
                     max = ((  Math.sqrt((x*x)+(y*y))  )/ (  x*Math.sin(x+y) + y*Math.cos(x+y)  ));
                 }
                 if( min > ((  Math.sqrt((x*x)+(y*y))  )/ (  x*Math.sin(x+y) + y*Math.cos(x+y)  ) )){
                    min = ((  Math.sqrt((x*x)+(y*y))  )/ (  x*Math.sin(x+y) + y*Math.cos(x+y)  ) );
                }
            }
        }
        System.out.format("max = %f\n",max);
        System.out.format("min = %f\n",min);
        System.out.print("Time = ");
        System.out.println((System.currentTimeMillis() - startTime + "ms"));
    }
}
