package dio.com;

import java.util.HashMap;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {
        Map<String, Integer> popNordeste = new HashMap(){{
            put("PE", 9616621);
            put("AL", 3351621);
            put("CE", 9187621);
            put("RN", 3516641);
        }};
        System.out.println(popNordeste);
        }
    }

