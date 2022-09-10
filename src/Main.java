public class Main {
    public static void main(String[] args) {
        // первая задача

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.print("\n");
        int i = 10;
        while (i > 0) {
            System.out.print(i);
            i--;
        }
        System.out.println();

        // вторая задача
        int firstFriday = 3;
        int daysMonth = 31;
        for (int friday = firstFriday; friday <= daysMonth; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число, необходимо подготовкить отчет");
        }
        // третья задача
        int tekushiy = 2022;
        int nachalo = tekushiy - 200;
        int konec = tekushiy + 100;
        int shag = 79;
        int nachaloKomet = 0;
        for (int god = nachaloKomet; god<=konec; god +=shag){
            if (god >= nachalo) {
                System.out.println(god);
            }
        }
    }


}
