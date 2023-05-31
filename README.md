## Zadanie 1
W tym i kolejnym zadaniu zajmiesz się stworzeniem kilku podstawowych elementów UI - nie musisz nic kompilować.</br>
</br>
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
Po wykonaniu tego zadania aplikacja powinna się poprawnie budować, ale nie wszystkie funkcjonalności będą zaimplementowane.<br>

## Zadanie 2
W tym zadaniu zajmiesz się dodaniem przycisku służącego do usunięcia produktu.<br>
W pliku fragment_new_product_sheet.xml znajdziesz wskazówki do wykonania zadania.<br>
</br>

## Zadanie 3
W tym zadaniu zajmiesz się implementacją funkcjonalności do dodanego przez Ciebie w __Zadaniu 2__ przycisku __Delete__.</br>
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
W tym zadaniu zajmiesz się dodaniem ikonki do przycisku New Product.</br>

Najpierw dodaj zasób ikonki do swojego projektu - kliknij prawym przyciskiem na folder drawable i wybierz New > Vector Asset.</br>
Kliknij w przycisk obok pozycji Clip Art i w nowo otwartym oknie wyszukaj i wybierz ikonkę o nazwie "add". Wybierz ją, kliknij "Ok" i zmień nazwę (np. na ic_add), kliknij "Next" i "Finish".</br>
Sprawdź, czy nowa ikonka pojawiła się w folderze drawable.</br>
Następnie prejdź do pliku layout/activity_main.xml, znajdź element odpowiadający za przycisk i dodaj atrybut icon, przekazując mu nazwę utworzonej ikonki.<br>
