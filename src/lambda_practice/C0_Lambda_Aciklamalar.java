package lambda_practice;

public class C0_Lambda_Aciklamalar {
         /*
     ForEach:
     Stream i�indeki veriyi tek tek t�ketmeki�in olu�turulmu� bir yap�d�r.
     **Terminal i�lemi oldu�undan dolay� stream art�k t�ketilmi� olarak kabul edilir ve
     art�k kullan�lamayaca�� anlam�na gelir.


    Filter:
    Dizimiz veya Collection��m�z �zerinde bizim belirtece�imiz ko�ullar do�rultusunda
    filtreleme i�lemi yapmam�za yarayan bir yap�d�r.
    Bu i�lem sonras� belirtti�imiz ko�ula uygun olmayan elemanlar bir sonraki a�amada kullan�lamazlar.
    Art�k elimizde filtrelenmi�/s�z�lm��/elenmi� bir veri vard�r


    Collect:
    Collect metodu Stream t�r�ndeki nesneleri ba�ka bi�imdeki nesneye,
    veri yap�s�na d�n��t�rmek i�in kullan�l�r.


    Map :Stream i�erisinde eri�ilen her bir eleman �zerinde i�lem yapmam�za
    ve ba�ka elemanlara d�n��t�rmemize imkan sa�layan


    Distinct:
    Stream i�erisinde bulunan ve tekrar eden elemanlar varsa
     bunlar� distinct metodu ile ��kartabilir ve
    elimizde tekrar etmeyen birbirinden farkl�
    elemanlar bar�ndan bir veri setimiz kal�r


    Sorted:
    Baz� durumlarda elimizde ki veri setini belirli bir parametreye g�re s�ralamak isteyebiliriz.
            2 t�r� bulunmaktad�r. Birinci hali parametre almaz k���kten b�y��e �ekilde s�ralar.
    �kinci format� ise Comparator aray�z�nden t�redi�i i�in
    bizim belirlemi� oldu�umuz parametreye g�re s�ralama i�lemi yapar.



    reduce : indirgeme demektir.
    kullan�m�; elemanlar� teker teker i�ler. Bir �nceki ad�mda elde edilen sonu�,
    bir sonraki elemanla i�lemle tutulur


    peek () 'in Javadoc sayfas� ��yle diyor: " Bu y�ntem, temelde, ��eleri bir
    ard���k d�zen i�inde belirli bir noktadan ge�erken g�rmek istedi�iniz
    yerde hata ay�klamay� desteklemek i�in vard�r .


    Match operasyonu bir ak���n belirli kriterleri sa�lay�p sa�lamad���n� �l�mek i�in kullan�l�r.
    Map den fark� her iterasyonu tek tek de�erlendirip sonucu yans�tmaz bunun yerine t�m koleksiyonu
    de�erlendirerek sonucu yans�tmas�d�r. Match operasyonunun 3 �e�it kullan�m� bulunmaktad�r;

        AnyMath: Verece�imiz �arta ba�l� olarak Stream i�erisinde gezinir ve
        herhangi bir elemanla e�le�me durumunda true d�necektir.


        AllMatch: Verilen �arta g�re Stream i�erisindeki t�m elemanlar�n
        bu �arta uymas� durumunda true d�necektir.


        NoneMatch: �arta g�re Stream i�indeki hi� bir
        eleman�n �art� sa�lamamas� durumunda true d�necektir.


    Limit
    Elimizde var olan bir veri kayna��n�, g�stermek istedi�imiz kadar�n� g�stermemize yarayan,
    s�n�rland�ran bir metoddur. Parametre olarak verece�imiz rakamla asl�nda
    Stream i�erisinde d�nen �ok say�da veri var
    ancak sen bize �u kadar�n� g�ster diyoruz.


    findFirst() => �lk eleman� verir. Bu ak���n ilk eleman�n� a��klayan bir �ste�e ba�l� veya ak�� bo�sa bo� bir �ste�e ba�l� d�nd�r�r.
    Ak���n kar��la�ma s�ras� yoksa herhangi bir ��e iade edilebilir. Optional return eder.


    // Arraylerde Stream kullanabilmek icin 2 yol vardir

    1) Stream <Integer> isim=StreamOf(cevrilecek olan)
    2) Arrays.stream(arr).


    Count
    Stream i�erisinde bulunan toplam veri say�s�n� ��renmemize yarar.


    flatMap() => Herhangi bir Collection�daki (Array gibi) elemanlar� birer birer Stream�e yerle�tirir.
    flatMap()�i kullanabilmek i�in elimizde bir Collection olmak zorunda.


    split() => Bu String ��esini verilen normal ifadenin e�le�melerine b�ler.
    Bu y�ntem, iki ba��ms�z de�i�kenli b�l�nm�� y�ntemi verilen ifade ve s�f�r s�n�r de�eriyle �a��r�r gibi �al���r.
    Sondaki bo� dizeler bu nedenle sonu� dizisine dahil edilmez.


    Optional<Integer> => Bir Class�t�r. Bo� olmayan bir de�er i�erebilen veya i�ermeyen bir kap Objecttir.
    *****Bir de�er varsa, isPresent () true, get () ise de�eri d�nd�recektir.
    Ek olarak, bu s�n�f, bir int'i bir String'e ve bir String'i bir int'e d�n��t�rmek i�in �e�itli y�ntemler
    ve ayr�ca bir int ile ilgilenirken yararl� olan di�er sabitler ve y�ntemler sa�lar. Exception gibi �al���r.

    #ifPresent � Varsa yap, yoksa yapma
    E�er bir Optional i�erisinde sadece veri varsa (null de�ilse) bir i�in yap�lmas� isteniyorsa #ifPresent metodu kullan�labilir.


    Comparator => bir Class�t�r. Compar kar��la�t�rmak demektir. Baz� nesneler koleksiyonuna toplam s�ralama uygulayan bir kar��la�t�rma i�levi.
    Kar��la�t�r�c�lar, s�ralama d�zeni �zerinde hassas kontrol sa�lamak i�in bir s�ralama y�ntemine (Collections.sort veya Arrays.sort gibi) aktar�labilir.
    Kar��la�t�r�c�lar, belirli veri yap�lar�n�n (s�ral� k�meler veya s�ral� haritalar gibi) s�ras�n� kontrol etmek veya do�al s�ralamas� olmayan
    nesnelerin koleksiyonlar� i�in bir s�ralama sa�lamak i�in de kullan�labilir.

    reverseOrder() => Comparator Class��n�n bir methodudur. Do�al s�ralaman�n tersini (b�y�kten k����e) uygulayan bir Comparator (kar��la�t�r�c�) d�nd�r�r.
    comparing() => kar��la�t�rma demektir.
    reversed() => Bu kar��la�t�r�c�n�n (comparator) ters s�ralanmas�n� uygulayan bir kar��la�t�r�c� (comparator) d�nd�r�r.


    skip(1) => atlama demek. Ak���n ilk n eleman�n� att�ktan sonra bu ak���n kalan elemanlar�ndan olu�an bir ak�� d�nd�r�r.
    Bu ak�� n'den daha az ��e i�eriyorsa, bo� bir ak�� d�nd�r�l�r. Bu, durum bilgisi olan bir ara i�lemdir.
    skip(list.size()-1) => List�in uzunlu�unun 1 eksi�ini yazarsak son eleman� yazd�r�r�z.


    Collectors.toList() => ��eleri koleksiyonlarda toplamak, ��eleri �e�itli kriterlere g�re �zetlemek gibi �e�itli
    yararl� azaltma i�lemlerini uygulayan Collector Uygulamalar�.

    // dosya eklemek icin 2 yol var
    1) Files.lines(Path.of("path")   buradan stream e eklemek icin
    Stream <String> satir=Files.lines(Path.of("dosya pathi"));
     bu bize tekrardan stream tanimlamadan kullanmayi saglar
    2) //Files.lines(Paths.get("dosya pathi")).  kullanilir

    satir.map(t->t.split(" ")).
                    flatMap(Arrays::stream). kelimelere ulasmamizi saglar

    `sum() Fonksiyonu: Kendisine verilen bir dizi say�y� al�p bu say�lar� birbiriyle toplamaya yarar



    */
}
