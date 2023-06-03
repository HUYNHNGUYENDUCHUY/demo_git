public class Text {

    public static void main(String[] args) {
//    long startTime = System.currentTimeMillis();
//    StringBuffer sb = new StringBuffer("java");
//    for (int i = 0 ; i <100000000;i++){
//        sb.append("Learning");
//    }
//        System.out.println("Time taken by StringBuffer"+(System.currentTimeMillis()-startTime)+"ns");
//    startTime = System.currentTimeMillis();
//    StringBuilder st = new StringBuilder("java");
//    for (int i = 0;i<10000000;i++) {
//        st.append("Learning");
//    }
//        System.out.println("Time taken by StringBuffer"+(System.currentTimeMillis()-startTime)+"ns");
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 1000000000; i++) {
            sb.append(" Learning");
        }
        System.out.println("Time taken by StringBuffer: "
                + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 1000000000; i++) {
            sb2.append(" Learning");
        }
        System.out.println("Time taken by StringBuilder: "
                + (System.currentTimeMillis() - startTime) + "ms");
    }

}
