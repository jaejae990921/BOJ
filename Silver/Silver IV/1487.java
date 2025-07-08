import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static class Customer {
        int money;
        int delivery;

        public Customer(int money, int delivery) {
            this.money = money;
            this.delivery = delivery;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Customer> list = new ArrayList<>();
        ArrayList<Integer> priceList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int money, delivery, sum, temp;
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            money = Integer.parseInt(st.nextToken());
            delivery = Integer.parseInt(st.nextToken());

            list.add(new Customer(money, delivery));

            if (priceList.contains(money)) {
                continue;
            } else {
                priceList.add(money);
            }
        }

        for (int price : priceList) {
            sum = 0;

            for (Customer customer : list) {
                if (customer.money >= price) {
                    temp = price - customer.delivery;

                    if (temp < 0) {
                        continue;
                    } else {
                        sum += temp;
                    }
                }
            }

            if (map.containsKey(price)) {
                map.put(price, map.get(price) + sum);
            } else {
                map.put(price, sum);
            }
        }

        priceList.sort((a, b) -> {
            if (map.get(b).equals(map.get(a))) {
                return a - b;
            } else {
                return map.get(b) - map.get(a);
            }
        });

        if (map.get(priceList.get(0)) == 0) {
            sb.append("0");
        } else {
            sb.append(priceList.get(0));
        }

        System.out.println(sb);
    }
}