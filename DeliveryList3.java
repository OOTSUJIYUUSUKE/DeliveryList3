import java.time.LocalDate;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class DeliveryList3 {
    public static void main(String[] args) {
        Client client1 = new Client("鈴木一郎", LocalDate.of(2023, 3, 25), 12, 2);
        Client client2 = new Client("田中優", LocalDate.of(2023, 3, 24), 19, 1);
        Client client3 = new Client("塚田真一", LocalDate.of(2023, 3, 23), 16, 3);
        Client client4 = new Client("田丸侑太", LocalDate.of(2023, 3, 23), 18, 2);
        Client client5 = new Client("高井直喜", LocalDate.of(2023, 3, 25), 12, 5);
        Client client6 = new Client("伊東真由美", LocalDate.of(2023, 3, 24), 15, 20);
        Client client7 = new Client("今村俊介", LocalDate.of(2023, 3, 24), 20, 2);
        Client client8 = new Client("羽生結弦", LocalDate.of(2023, 3, 26), 17, 1);
        Client client9 = new Client("宮藤官九郎", LocalDate.of(2023, 3, 22), 15, 2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("新しい荷物情報です。\n顧客の名前は？");
        String name = scanner.next();
        System.out.print("配達年は？");
        int year = scanner.nextInt();
        System.out.print("配達月は？");
        int month = scanner.nextInt();
        System.out.print("配達日は？");
        int dayOfMonth = scanner.nextInt();
        System.out.print("配達時間は？");
        int deliveryTime = scanner.nextInt();
        System.out.print("配達個数は？");
        int quantity = scanner.nextInt();
        Client client10 = new Client(name, LocalDate.of(year, month, dayOfMonth), deliveryTime, quantity);

        List<Client> clientList = List.of(client1, client2, client3, client4, client5, client6, client7, client8, client9, client10);
        Comparator<Client> comparator = Comparator.comparing(Client::getDeliveryDate)
                .thenComparing(Client::getDeliveryTime)
                .thenComparing(Client::getQuantity);   //配達日時、時間、配達個数順で並び替える

        System.out.println("今月の配達予定一覧を表示します。");
        clientList.stream().sorted(comparator).forEach(client -> {
            System.out.printf("%-6s", client.getName());
            System.out.println("(配達予定：" + client.getDeliveryDate() + "の"
                    + client.getDeliveryTime() + "時  配達個数：" + client.getQuantity() + ")");
        });
        System.out.println("本日も配達よろしくお願いします。");
    }
}
