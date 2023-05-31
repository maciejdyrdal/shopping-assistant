# Shopping Assistant
## Nasza prezentacja: 
https://docs.google.com/presentation/d/1zTBbklkK35PFm6trg3hEziMjq87j3Xiz33A22iE5RSg/edit?usp=share_link
## Na początku
Pobierz branch - exercise.</br>

Zainstaluj __Android Studio IDE__: https://developer.android.com/studio

Pobierz odpowiedni dla swojego systemu operacyjnego plik.</br>
Przy instalacji najlepiej zaznacz opcję install __Android Virtual Device__ (screenshot poniżej).</br>

![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/2ea77b95-82b2-4ce0-a5c4-ca85545041dd)

![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/7ad4f84f-782a-4a87-816e-aec8d1492b8f)

## Jeżeli nie zainstalowałeś __Android Virtual Device__:</br>
Wejdź w __Device Manager__<br/>
![Instrukcja1](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/18e88d88-8380-476d-ae1e-797a2307b7ca)

Stwórz nowe urządzenie wirtualne: __Create device__:</br>
Phone>Pixel 3a>Tiramisu

![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/e39e5825-b7cd-410c-b797-1213a9532057)
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/70e722e6-e10b-4432-91e6-7f39aa4532fb)

## Uruchom __Android Virtual Device__:</br>
__Android Virtual Device__ uruchamia się dosyć długo, ale nie martw się - wystarczy uruchomić je tylko raz.</br>

Wejdź w __Device Manager__<br/>
![Instrukcja1](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/18e88d88-8380-476d-ae1e-797a2307b7ca)

Kliknij trójkąt<br/>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/608c5e34-4292-4d20-94f7-9fe569d6c7e0)


## Ustawienia Quality of Life w Android Studio - Opcjonalne
Szybka zmiana rozmiaru czcionki</br>

File>Settings>Editor>General</br>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/08babd63-2d5c-4eac-bc91-76fc769fd5a2)

Automatyczne importowanie</br>

File>Settings>Editor>General>Auto Import</br>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/c2aa87f8-28cf-44f4-9a72-071d556790ea)


## Zadanie 1
W tym i kolejnym zadaniu zajmiesz się stworzeniem kilku podstawowych elementów UI - nie musisz nic kompilować.</br>
Pobierz projekt do __Zadania 1__ </br>
Włącz tryb __Android__ w __Project__ (jeżeli nie jest on już włączony)- pokazuje on abstrakcyjną strukturę plików, po której łatwiej się poruszać.</br>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/78d2ccdd-8ff0-4e30-870f-fa8207d192e7)
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/fa7518de-a8c7-438e-8ff8-a2743e872d05)
</br>
Przejdź do: app>res>layout>fragment_new_product_sheet</br>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/67a7c816-1037-4391-9aa8-ab4a0d211921)
</br>
Zadanie polega na dodaniu drugiego z widocznych pól tekstowych, służącego do dodania opisu produktu.</br>
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/dc2b6ba4-1bab-401b-b4ee-036e996425b9)
</br>
Layout można edytować na 2 sposoby:</br>
- Edycja pliku .xml
- Wykorzystanie okna design i dodawanie __View__ za pomocą __Drag And Drop__

Rekomendujemy wybrać tryb __Split__, by na bieżąco widzieć zmiany zarówno w oknie __Design__ i pliku .xml</br>

![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/6639f74d-cbd9-4b57-b168-12b8d62ceab2)

Zanim rozpoczniesz - przyglądnij się zaimplementowanym już __View__. Wykonaj zadanie na ich podstawie.</br> 

## Zadanie 2
W tym zadaniu zajmiesz się dodaniem przycisku służącego do usunięcia produktu.<br>
W pliku fragment_new_product_sheet.xml znajdziesz wskazówki do wykonania zadania.
![image](https://github.com/maciejdyrdal/shopping-assistant/assets/115181486/aa7afaa1-89d7-490e-a1be-d04017e92e4d)
</br>

## Zadanie 3
W tym zadaniu zajmiesz się implementacją funkcjonalności, do dodanego przez Ciebie w __Zadaniu 2__ przycisku __Delete__.</br>
Prześledź w jaki sposób komunikują się ze sobą różne klasy.</br>
Przyglądnij się jak działa __Add/Insert__ oraz __Update__. Wykonaj zadanie na jego podstawie.</br>
Wskazówki:</br>
Dopisania kodu wymagają następujące pliki:</br>
-ProductItemDao.kt
-ProductItemRepository.kt
-ProductViewModel.kt
-NewProductSheet.kt<br>
Zacznij od pliku ProductItemDao.kt, w nim znajdziesz wskazówki co robić dalej.<br>

## Zadanie 4
Dodaj ikonkę do przycisku New Product</br>

Najpierw dodaj ikonkę do swojego projektu - kliknij prawym przyciskiem na folder drawable i wybierz New > Vector Asset.</br>
Kliknij w przycisk obok pozycji Clip Art i w nowo otwartym oknie wyszukaj i wybierz ikonkę o nazwie "add". Wybierz ją, kliknij "Ok" i zmień nazwę (np. na ic_add), kliknij "Next" i "Finish".</br>
Sprawdź, czy nowa ikonka pojawiła się w folderze drawable.</br>
Następnie prejdź do pliku layout/activity_main.xml, znajdź element odpowiadający za przycisk i dodaj atrybut icon, przekazując mu nazwę utworzonej ikonki.<br>
