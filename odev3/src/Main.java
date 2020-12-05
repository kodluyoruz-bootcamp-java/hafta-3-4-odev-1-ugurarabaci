import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        Berlin berlin = new Berlin("Berlin", "BER", +1);
        London london = new London("London", "LON", 0);
        Moscow moscow = new Moscow("Moscow", "MOW", +3);
        NewDelhi newDelhi = new NewDelhi("NewDelhi", "DEL", +6);
        NewYork newYork = new NewYork("NewYork", "NYC", -5);

        System.out.println();
        Map<String, City> sehirKoduMapi = new HashMap<>();

        sehirKoduMapi.put(berlin.getCityCode(), berlin);
        sehirKoduMapi.put(london.getCityCode(), london);
        sehirKoduMapi.put(moscow.getCityCode(), moscow);
        sehirKoduMapi.put(newDelhi.getCityCode(), newDelhi);
        sehirKoduMapi.put(newYork.getCityCode(), newYork);


       // Set<String> keys = sehirKoduMapi.keySet();
       // Collection<City> values = sehirKoduMapi.values();

        /* for(Map.Entry<String, City> entry : sehirKoduMapi.entrySet()){

            System.out.println("value is -> " + entry.getValue());
        }


        Set<String> keys = sehirKoduMapi.keySet();
        Collection<City> values = sehirKoduMapi.values();

        List<City> cities = new ArrayList<>();
        Set<Map.Entry<String, City>> entries = sehirKoduMapi.entrySet();

        */

         List<City> cities = new ArrayList<>();
         Set<Map.Entry<String, City>> entries = sehirKoduMapi.entrySet();

       for(Map.Entry<String, City> line: entries) {
            //System.out.println("Key is -> " + line.getKey());
            //System.out.println("value is -> " + line.getValue());
            cities.add(line.getValue());
        }
        Collections.sort(cities);
       for(City c : cities){
           System.out.println(c);
       }


        System.out.println(" 3 şehir kodu seçin: (BER) / (LON) / (MOW) / (DEL) / (NYC)");

        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
    }


}