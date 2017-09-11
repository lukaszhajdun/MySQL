drop database if exists quiz;

CREATE DATABASE `quiz` ;
use quiz;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Struktura tabeli dla tabeli `questions`
--

CREATE TABLE IF NOT EXISTS `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `answera` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `answerb` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `answerc` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `answerd` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `correctAnswer` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `category` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=21 ;

--
-- Zrzut danych tabeli `pytania`
--

INSERT INTO `questions` (`id`, `question`, `answera`, `answerb`, `answerc`, `answerd`, `correctAnswer`, `category`, `year`) VALUES
(1, 'Wypisanie na ekranie zawartości zmiennej char s = "To jest tylko test" zostanie wykonane w języku C++ za pomocą instrukcji', 'cin&lt;&lt;s', 'cout&gt;&gt;s', 'cout&lt;&lt;s', 'cin&gt;&gt;s', 'c', 'programowanie', 2012),
(2, 'Destruktor w języku C++ to metoda', 'wywoływana w momencie usuwania obiektu', 'wywoływana w momencie tworzenia obiektu', 'zwalniająca pamięć przydzieloną dynamicznie w obiekcie', 'porządkująca pamięć operacyjną po usuniętych obiektach', 'a', 'programowanie', 2009),
(3, 'Dziedziczenie w programowaniu obiektowym pozwala na', 'łączenie obiektów', 'kopiowanie cech jednego obiektu do innego', 'usunięcie z istniejącej klasy zbędnych elementów.', 'tworzenie nowej klasy na podstawie jednej lub kilku już istniejących klas', 'd', 'programowanie', 2008),
(4, 'Złącze AGP służy do podłączenia', 'szybkich pamięci dyskowych', 'urządzeń wejścia/wyjścia', 'kart graficznych', 'modemu', 'c', 'urządzenia techniki komp.', 2007),
(5, 'Do którego wyprowadzenia należy podłączyć głośniki aktywne w karcie dźwiękowej, której schemat funkcjonalny przedstawia rysunek?', 'Mic in', 'Line in', 'Line out', 'Speaker out', 'c', 'urządzenia techniki komp.', 2006),
(6, 'Który blok karty dźwiękowej służy do cyfrowego przetwarzania sygnałów?', 'Przetwornik A/D', 'Procesor DSP', 'Syntezator', 'Mikser', 'b', 'urządzenia techniki komp.', 2011),
(7, 'Warunkiem niezbędnym przy archiwizacji danych jest', 'kompresja danych', 'kopiowanie danych', 'kompresja i kopiowanie danych', 'kompresja i kopiowanie danych z jednoczesnym ich szyfrowaniem', 'b', 'systemy operacyjne i sieci', 2006),
(8, 'Która warstwa modelu ISO/OSI jest związana z protokołem IP?', 'Sieciowa', 'Fizyczna', 'Transportowa', 'Łącza danych', 'a', 'systemy operacyjne i sieci', 2010),
(9, 'Ile komórek pamięci można zaadresować bezpośrednio w 64 bitowym procesorze, który ma 32 bitową szynę adresową?', '2 do potęgi 32', '2 do potęgi 64', '32 do potęgi 2', '64 do potęgi 2', 'a', 'urządzenia techniki komp.', 2006),
(10, 'Co oznacza zwrot "wykonanie backupu systemu"?', 'Zamknięcie systemu', 'Ponowne uruchomienie systemu', 'Wykonanie aktualizacji systemu', 'Wykonanie kopii zapasowej systemu', 'd', 'systemy operacyjne i sieci', 2012),
(11, 'Klaster komputerowy to', 'komputer z macierzą dyskową', 'komputer z wieloma procesorami', 'grupa komputerów pracujących współbieżnie tak, jakby był to jeden komputer', 'komputer zapasowy, na którym co pewien czas wykonywana jest kopia systemu głównego', 'c', 'urządzenia techniki komp.', 2007),
(12, 'Jaką ilość rzeczywistych danych można przesłać w czasie 1 s przez łącze synchroniczne o przepustowości 512 kbps, bez sprzętowej i programowej kompresji?', 'Około 5 kB', 'Około 55 kB', 'Ponad 64 kB', 'Ponad 500 kB', 'b', 'systemy operacyjne i sieci', 2012),
(13, 'Jakiej liczbie kolorów odpowiada kolor zakodowany na 16 bitach?', '16 kolorom', 'około 64 tysiącom kolorów', 'około 65 tysiącom kolorów', 'około 16 milionom kolorów', 'c', 'multimedia i grafika', 2008),
(14, 'Pamięć oznaczona symbolem PC3200 nie może współpracować z magistralą', '300 MHz', '333 MHz', '400 MHz', '533 MHz', 'd', 'urządzenia techniki komp.', 2006),
(15, 'Co oznacza jednostka dpi podawana w parametrach katalogowych skanerów i drukarek?', 'Punkty na cal', 'Gęstość optyczną', 'Punkty na milimetr', 'Punkty na centymetr', 'a', 'urządzenia techniki komp.', 2009),
(16, 'Jaka jest maksymalna prędkość odczytu płyt CD-R w napędzie oznaczonym x48?', '480 kB/s', '4800 kB/s', '7200 kB/s', '10000 kB/s', 'c', 'urządzenia techniki komp.', 2006),
(17, 'Funkcje różnych kategorii (daty i czasu, finansowe, tekstowe, matematyczne, statystyczne) są elementem składowym', 'edytora tekstu', 'przeglądarki internetowej', 'arkusza kalkulacyjnego', 'programów do tworzenia prezentacji multimedialnych', 'c', 'oprogramowanie biurowe', 2010),
(18, 'Który z podanych języków programowania nie jest językiem webowym?', 'HTML5', 'JavaScript', 'PHP', 'C++', 'd', 'programowanie', 2012),
(19, 'W języku C++ różnica między funkcją a procedurą polega na tym, że', 'funkcja zwraca wartość, a procedura nie', 'do funkcji jako parametr można przekazywać zmienną, a do procedur tylko wartość', 'do procedury jako parametr można przekazywać zmienną, a do funkcji tylko wartość', 'funkcja może być zdefiniowana z tylko jednym parametrem, a procedura z wieloma', 'a', 'programowanie', 2006),
(20, 'Jaki jest kod koloru w języku HTML, jeśli kolor ten ma składowe w zapisie dziesiętnym: czerwony = 27, zielony = 90 i niebieski = 104?', '#279004', '#1B5A68', '#1C9D4A', '#5A681B', 'b', 'multimedia i grafika', 2010);
