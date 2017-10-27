public class SortowanieBabelkowe extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie bąbelkowe";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int sort[] = new int[input.length-1]; //element 0 jest przeznaczony dla nazwy algorytmu
        //dlatego od długości odejmujemy 1, aby zliczyć tylko interesujące nas liczby

        for(int i = 0; i < sort.length; i++)
        {
            sort[i] = Integer.parseInt(input[i+1]); //pamiętamy, że wcześniej odjęliśmy 1, ponieważ chcieliśmy tylko
            //ograniczać się do liczb do posortowania, więc teraz musimy dodać 1, aby odwołać się do kolejnych elementów
            //tablicy input pomijając nazwię algorytmu

        }

        for(int i=0; i<sort.length;i++) //idziemy po całej długości tablicy do posortowania
        {
            for(int j=0;j<sort.length-1; j++) //za każdym razem zaczynamy od początku, aby mieć
                //pewność, że zawsze uda nam się dobrze posortować
            {
                if(sort[j]>sort[j+1]) //Jeżeli elementy są w złej kolejności wykonaj SWAPa
                {
                    //SWAP - zamiana miejscami dwóch elementów w tablicy
                    int temp = sort[j]; //tworzymy zmienną tymczasową i od razu zapisujemy do niej pierwszą wartość
                    sort[j] = sort[j+1]; //zamieniamy miejscami wartości
                    sort[j+1] = temp; //odzyskujemy wartość z temp i zapisujemy na nowym, tym razem odpowiednim miejscu
                }
            }
        }

        for(int i = 0; i < sort.length; i++)
            System.out.printf("%d ", sort[i]);

    }
}
