package corso.java.simplerest;

import java.util.Date;

public class Intro {
    public static class Requests{
        public static final String req = "VERBO path/indicativo/della/risorsa/richiesta HTTP 1.1";

        public static final String VERBO_GET = "GET";
        public static final String VERBO_POST = "POST";
        public static final String VERBO_PUT = "PUT";
        public static final String VERBO_DELETE = "DELETE";
    }
    public static class Response{
        public static class Header{
            public static final int OK = 200;
            public static final int RESOURCE_RELOCATED = 300;
            public static final int APP_ERROR = 400;
            public static final int SERVER_ERROR = 500;

            public int status;
            public String statusMessage;
            public Date Expires;
        }
        public static class Body{

        }
    }
}
