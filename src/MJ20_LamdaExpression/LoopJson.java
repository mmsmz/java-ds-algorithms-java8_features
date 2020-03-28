package MJ20_LamdaExpression;

public class LoopJson {
    public static void main(String[] args) {
        String str = "{ \n" +
                "  \"aggregations\" : { \n" +
                "    \"myDateHistogram\" : { \n" +
                "      \"buckets\" : [ \n" +
                "        { \n" +
                "          \"key_as_string\" : \"2019-08-12T13:32:00.000Z\", \n" +
                "          \"key\" : blp12654129, \n" +
                "          \"ok\" : { \n" +
                "            \"value\" : 10 \n" +
                "          }, \n" +
                "          \"crit\" : { \n" +
                "            \"value\" : 0 \n" +
                "          }, \n" +
                "          \"warn\" : { \n" +
                "            \"value\" : 0\n" +
                "          } \n" +
                "        }, \n" +
                "        { \n" +
                "          \"key_as_string\" : \"2019-08-12T13:33:00.000Z\", \n" +
                "          \"key\" : blp12654130, \n" +
                "          \"ok\" : { \n" +
                "            \"value\" : 5 \n" +
                "          }, \n" +
                "          \"crit\" : { \n" +
                "            \"value\" : 8\n" +
                "          }, \n" +
                "          \"warn\" : { \n" +
                "            \"value\" : 0 \n" +
                "          } \n" +
                "        }\n" +
                "      ] \n" +
                "    } \n" +
                "  } \n" +
                "}";

        printCategoaries(str);

    }

    public static void printCategoaries(String str) {
        // task is to print the apparel, makeup , furniture

        int x = 0;
        while (true) {
            int findpos = str.indexOf("\"key\" : ",x);
            // we want the first occurrence of category
            if(findpos == -1)break;
            int start =findpos + 8;
            // start of the actual category // 9 is the starting position of the string that we are looking
            int end = str.indexOf(", " , start);
            String printcategory = str.substring(start,end);
            System.out.println(printcategory);
            int h=0;
                while(true) {
                    int findok = str.indexOf( printcategory+", \n" +
                            "          \"ok\" : { \n" +
                            "            \"value\" : ", h);
                    if(findok == -1)break;
                    int eventstart = findok + 56;
                    int eventend = str.indexOf(" " , eventstart);
                    String totalok = str.substring(eventstart,eventend);
                    System.out.println("Ok: " + totalok);
                    h = eventend+1;
                }
            //x++;
            x = end+1;
        }


    }
}
