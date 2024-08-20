import java.io.BufferedWriter;
import java.io.FileWriter;

public class QEYDLER {
    
    /*
      TODO      MASSİVLƏR HAQQINDA

      TODO      STATICLER

      Bir clasin icinde "static" blok achilibsa bu zaman class yaradildigi zamanm ilk evvel static blokun ichi ishe dushecek
     meselen:

     static{
        System.out.println("Static bloklar");
     }

     Class yuklenende ilk ishe dushen hissedir.
     Class senin ona ehtiyacin varsa yuklenir.
     Bir classi import etmek bele onun cagrilmasi sayilmir.

     Static blokun daha cox ne zaman lazim oldugunu SQL-le bagli movzuda aydin olacaqdir.

     TODO       Class.forName("StaticBloklar.StasticBloklar");

     forName - klasi yuklemek ucun lazim olan metoddur.

     TODO       STATIC olmayan blok non static ve ya instance blok

     Bu obyektin metodu olacaq. Yeni clasin bir basha obyekti sayilmayacaqdir.

     {
        System.out.println("non static instance blok");
    }

     Bu blok ne zaman ishe dushur:  Eger biz klasin ichinde istenilen bir konstruktoru yaratsaq ve
     hemin konstruktorlar ishe dushduyu zaman bu metodd ishe dushecekdir meselen:

    public StasticBloklar(){
        System.out.println("User");
    }

    public StasticBloklar(int a){
        System.out.println("User a");
    }
    Instance blok yaradildigi obyekte aiddir.  Yaradilan klasin ilk evvel instance bloku ishe dushur.

    Bu ne halda lazim ola biler - Eger sizin elementiniz var ki hansi ki, konstruktorun chagrilmagindan asili olmayaraq,
    siz hemin ishin, obyekt yaradildigi zaman ishe dushmesini isteyirsiz. Bununla da siz bu metodun ichindeki alqoritmin icra edilmesi ucun
    classin her bir konstruktoruna elave etmeyinize ehtiyac qalmayacaqdir.

    TODO        INHERITANCE

    public class Inheritance_Teacher extends Inheritance_Person{

    }
    Burada "extends" genishlemek demekdir. Yeni bir klass diger bashqa klassin nelerinise ozunde saxlayir.
    Bu o demek deyil ki, bu klasin ichinde diger klass movcuddur. Burada sadece olaraq bu klass diger klassin ozelliklerini
    ozunde dashiyir.

    Umumiyyetle bu hadise toreme, irsiyyet adlanir.



    идгTODO        BEHAVIOUR | STATES

    Deyishenlere States(xusuiyyet, svoystava menasinda), metodlara ise Behavior (ozunu aparma menasinda) deyilir.


    TODO        KONSTRUKTORLAR nece ishleyir?

    Eger biz Clasin ichinde bu cur parametrli konstruktor yaratsaq bu o demekdir ki, biz susumaya gore standart
    parametrsiz konsturktoru deyil, parametrli konsruktoru teleb edirik:

    public Inheritance_Person(String name){
        this.name = name;
    }

    Ve eger bu clasi diger claslar "extend" edirse bu zaman hemin klaslarda xeta olacaqdir. Xeta da odur ki hemin "extend"
    edilmish klas parametr teleb edir. Bu xetani aradan qaldirmaq ucun biz "extend" eden klassin ichinde konstruktorda "super" -i
    parametrli yaratmaliyiq:

    public Inheritance_User(){
      super("");
    }

    Daha murekkeb konstruktorlu halda:

        public class Inheritance_User extends Inheritance_Person {

            public Inheritance_User() {
                this(3);
            }

            public Inheritance_User(int a) {
                this(3, "");
            }

            public Inheritance_User(int a, String st) {
                super("");
            }

        }
    ==============================================================================================
    Biz extend etdiyimiz klasin ichinde olan her hansi bir metodu bir basha ve ya "super.method" qeyd etmekle cagira bilerik.
    Bu cur etmekle eger klassimizin ichinde eyni adda olan metod varsa bu zaman biz onu deyil "extend" olundugumuz klassdan olacagini bildiririk.

    public void foo(){
        super.methodPerson();
    }
    ===================================================================================================
    //TODO      POLYMORFIZM

    Polymorfizm nedir?

    =====================================================
    Bir metod var ve bizden mueyyen klas tipnde parametr teleb edir. Eger biz hemin metodu chagirsaq ve parametr olaraq ona
    extend ona extend olunan klass tipinde parametri gondersek, bu zaman obyekt olaraq oz tipini ver referencini saxlasa bele
    metodun teleb etdiyi parametr klass tipinin xasselerine eli chatacaqdir ashagidaki numunede oldugu kimi.

    public static void main(String[] args) {
        Polymorfizm_Sarxan s = new Polymorfizm_Sarxan();
        test(s);
    }

    public static void test(Polymorfizm_Azay a){

    }
    ------------------------------------------------------------------
    Eger biz indi bu metodun icinde parametr olaraq gonderdiyimiz klass tipinin sadece extend etdiyi klasin xasselerini deyil
    ozune aid olan xasseleri de gore bilmesi ucun onu kast ede bilerik. Meselen:

    public static void test(Polymorfizm_Azay a){
      Polymorfizm_Sarxan a2 = (Polymorfizm_Sarxan) a;
      a2.methodInSarxan();
    }

    Eger bu metodun ichinde biz bashqa tip klassi diger bir klassa kast emek istesek bizde xeta verecek.
    Bu xetani aradan qaldirmaq ucun TODO instansOf- dan
    istifade  ede bilerik ashagidaki numunede oldugu kimi:

    public static void test(Polymorfizm_Azay a){
        if (a instanceof Polymorfizm_Sarxan) {
            Polymorfizm_Sarxan a2 = (Polymorfizm_Sarxan) a;
        } else if (a instanceof Polymorfizm_Tural) {
            Polymorfizm_Tural a2 = (Polymorfizm_Tural) a;

        }
    }

    Burada bize melum olur ki, eger bizim klass bir klasdan "extend" olunursa biz hemin klassin teleb edildiyi yerde, o klassa
    "exdend" olunan klasslari da istifade ede bilerik. Buna da Javada TODO "is a" elaqesi deyilir
    ----------------------------------------------------------
    Biz extend edilen bir tip klassi digerine menimsede bilerik bu ya TODO upcasting ve ya downcasting olacaqdir
    DownCasting burada TODO "explicitly write" (ozun oz elinle) adlanir

    Meselen bu numunede oldugu kimi ede bilerik.

     Polymorfizm_Sarxan s = new Polymorfizm_Sarxan();
     Polymorfizm_Azay a = s; // upcasting
     Polymorfizm_Sarxan ss = (Polymorfizm_Sarxan) a; //downcasting
     -----------------------------------------------------------
     Eger biz tip klassa daha dogrusu qeyd edek digerinin "extend" etdiyi bir klassa, ona extend olunan klassa menimsetsek
     o artiq ozunun oz obyekti olmagina baxmayaraq menimsenen diger tip klassi kimi davranacaq, onun kimi ozunu aparacaqdir
     ashagida buna misal verek:

      Polymorfizm_Sarxan s = new Polymorfizm_Sarxan();
      Polymorfizm_Azay a = s; // upcasting

      Burada Serxan Klassi ozunu Azay klassi kimi aparacaq
      Ve bu da JAVA da TODO     Polymorfizm adlanir
      ------------------------------------------------------------

    ==========================================================
    TODO        Overloading

    public class Overload_Main {

    public static void main(String[] args) {
        Overload_Serxan s = new Overload_Serxan();
        method(s);
    }

    public static void method(Overload_Serxan s){
        System.out.println("Serxan");
    }

    public static void method(Polymorfizm_Azay a) {
        System.out.println("Azay");
    }

    public static void method(Polymorfizm_X x) {
        System.out.println("X");
    }

    public static void method(Object o) {
        System.out.println("Object");
    }

}
    ==========================================================
    //TODO      Klasin metodunun ichinde eger bir deyishen "inisialize" olunmasa xeta verecekdir.
    Buna sebeb Klasin ichinde yaradilan deyisheni JAVA ozu avtomatik inisialize edir. Amma metodun ichinde etmir ona gore ki,
    metod -dan qabag hele obyektin ozu yranmalidir. Buna misal olaraq ashagidaki numuneni verirem:

    public class Overload_Main_2 {
    public static void main(String[] args) {
        new Overload_Main_2().method("");
    }

    Integer a; //Xeta olmayacaq JAVA avtomatik olaraq ona "null" menimsedecekdir.

    public void method(String s){
        Integer b;                   //++Xeta olmasin deye burada b - ye nese menimsetmek lazimdir
        System.out.println(b);      //++burada xeta verir cunku b metodun icinde inisialize edilmir
        System.out.println(a);      //++Burada xeta olmur chunku a klassin icinde JAVA terefinden inisialize edilir.
    }
    }
     //TODO     INISIALIZE bir deyishene deyerin menimsedilmesi prochesidir.
    ==========================================================
    //TODO      PROTECTED DEFAULT
    Bu deyishenleri eyni paketin ichinde "klasslar" gore biler.
    Burada protectedleri diger paketde olan ve "extend" eden klaslar da gore biler.

    Default variable ozu eslinde packgace variable sayilir. yeni paketlerin ichinde gorune bilir.
    ==========================================================
    TODO        HAS A COMPOSITION

    Bir klassin ichinde Bashqa bir klassin obyektini yaradiriq. Ve bu klasin ichindeki diger klasa muraciet ede bilirik bu da HAS A adlanir.

    ==========================================================
    TODO        OVERRİDE
    Klasin ichinde sadece metodlar "override" olur.
    Deyishenler ise "hiden" ola bilir.
    @ovderride - vasitesile xetanin qarshisini almaq olur.

    ===========================================================
    TODO        FINAL KEYWORD
    Final onumush klas "extend" olunmaz.
    Final olan deyishenin deyeri deyishdirile bilmez.
    Bu sebebden de biz bunu "konstanta" adlandira bilerik.
    Final olunmush metod hemcinin de @override oluna bilmez.



    dersde 44-44 vaxtinda qaldi.
    ===========================================================
    TODO        EQUALS - nedir

    String deyisheni qebul edirik:

            String s = null;

    boolean b = s.equals("java"); bu cur yazmaqa tehlukelidir. Chunku NULLPOIUNTER Exception xeta ala bilerik.
    Ashagidaki kimi yazsaq xeta almnaycagiq:

            boolean b = "java".equals(s);

    ===========================================================
   TODO     HASHCODE -nedir

   Obyektin yaddahsda yerleshdiyi unvanin reqemle ifadesi.
   main.BMW@4e25154f



   ===========================================================
    TODO EXCEPTIONLAR

        |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        try {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Xeta bash verdi");
        }
        System.out.println("Salam");

        Exceptionlar : ArrayIndexOutOfBoundsException, ArithmeticException
        Exceptionu ozumuz yaradiriq:

        ||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        try {
            int[] arr = {};
            System.out.println(arr[0]);
        } catch (Exception ex) {
            StackTraceElement[] st = ex.getStackTrace();
            System.out.println(ex.getClass().getName() + ":" + ex.getMessage());

            for (int i = 0; i < st.length; i++) {
                StackTraceElement stE = st[i];
                System.out.println("        at " + stE.getMethodName() + ")" + stE.getClassName() + ":" + stE.getLineNumber() + ")");
            }
        }
        System.out.println("Salam");
        ||||||||||||||||||||||||||||||||||||||||||||||||||||||||

        Ozumuzun Exception klassizmizi yaradiriq:

        Ilk evvel klassi yaradiriq:

        public class MyException extends Exception{

        public MyException(String msg){
        super(msg);
        }

        }
        Bu klassdan throw edirik:

        Exception_Car b = new Exception_Car();
        if (b.name == null) {
            try {
                throw new MyException("Xeta olmushdur!!!");
            } catch (Exception ex) {
               ex.printStackTrace();
            }

        }


    TODO MULTIPLE TRY CATCH - nedir?

      try {
            int a = 0;
            int b = 0;
            Object obj = null;
            System.out.println(obj.toString());

        }catch (ArithmeticException ex){
            System.out.println("Riyazi xeta baash verdi");
        }catch (NullPointerException ex){
            System.out.println("Null xeta bash verdi");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array xeta bash verdi");
        }catch (Exception ex){
            System.out.println("Bashqa bir xeta bash verdi. "+ex.getClass().getName());
        }

      try {
            int a = 0;
            int b = 0;
            Object obj = null;
            System.out.println(obj.toString());

        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Menim axtardigim uchxetadan biri bash verdi");
        } catch (Exception ex) {
            System.out.println("Bashqa bir xeta bash verdi. " + ex.getClass().getName());
        }
    }

    TODO Exception ile Error arasindaki ferq nedir?
    Errorlar cox vacib problemleri ifade edir. Aplicationun bunu tutmaga ehtiyaci yoxdur.
    Meselen internet kesildi, bunun tutmagin menasi yoxdur.
    Ve ya yaddash qalmayib. bu proqram zaten ishlemeyecekdir.
    Bezi Errolar var istisna teshkil edir.
    Mesele bele errorlardan ClassDefNotFounError - bela erroru tutmagin menasi vari.

    Exception ise -sirf proqrami elaqelendiren xetalardir.

    Errola ishlemek ucun TRY CATCH numune:

    try{

    //shebeke ve ya internet xetasi

    }catch(Thriwable err){

        System.out.println("mesaj");
        err.printStackTrace();

    }

    TODO Exception ierarxiyasi nedir?

    RunTime ve RunTime olmasyan exceptionlar movcuddur.
    RunTime Proyekt ish dushduyu zaman bash veren exception xetalardir.

    Compile time errorlar da movcuddur.

    Run Time Errorlar Cheked ve Uncheked:

    RunTime Exceptionu elan etsek bizden bu xetanin tutulmasi teleb edilmeyecekdir ve xeta vermeyecekdir eger TRY CATCH etmesek.
    Lakin, Diger RunTime olmayan Exceptionlar Meselen FileNotFoundExceptionu chagirsaq bu zaman bizden TRY CATCH teleb edilecekdir.

    Meselen:

    throw ne FileNotFoundException(); // burada xeta verecekdir.

    Bu cur xetani Cheked Exception - da ashagidaki kimi aradan qaldira bilerik:

    public class Checked_Exception_Example {

        public static void main(String[] args) throws Exception {
            foo();
        }

        public static void foo() throws Exception {
            throw new SQLException(); //Qesden yaziriq ki, xeta kimi taninsin.

        }
    }

    Yuxaridaki kodda meslehet gorulur ki throw -da exceptionlari ayri ayri qeyd edek meselen:

       throw ne FileNotFoundException(); // burada xeta verecekdir.

    |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    Bu cur xetani Cheked Exception - da ashagidaki kimi aradan qaldira bilerik:

    public class Checked_Exception_Example {

        public static void main(String[] args) throws SQLException, IOExcpetion {
            foo();
        }

        public static void foo() throws SQLException, IOExcpetion{
            throw new SQLException(); //Qesden yaziriq ki, xeta kimi taninsin.

        }
    }

    |||||||||||||||||||||||||||||||||||||||||||||||||||

    Ve yaxud da ashagidaki kimi TRY CATCH etmekle ede bilerik

    public class Checked_Exception_Example {
        public static void main(String[] args)  {
            try {
                foo();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void foo() throws SQLException, IOException {
            throw new SQLException();

        }
    }
   ===========================================================
    TODO ABSTRACTION-lar
    BEAN - eger bizim klasslar encapsulationun butun teleblerini  yerine yetirirse bu zaman
    o BEAN sayilir.

    POJO -  Plain Old Java Object - Kohne sade java obyekti demekdir.

    TODO        Implement ile override arasindaki ferq:
    ondan ibaretdir ki, override olan bir sheyi deyishirik, implement ise olmayan yenir metodun alqoritmini teyin
    etmekdir

    TODO        Abstart class bu xeyali bir klassdir. ve onun yaradilmasina icaze verilmir.

    Biz abstrakt klassi yaratmaq istesek bu zaman hemin klass yaranmayacaq arada mueyyen her obyekt ucun klass yaranacaq
    bununla yanashi biz butun abstrakt klasslari da implementasiya etmeli olacagiq:

    Abstract_Car c = new Abstract_Car(){

            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void speedUp() {

            }
        };
        Bu da oz novbesinde TODO ANONIMUS KLASS adlanir.

       |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
       TODO INNER CLASS
       public class A{

       }
       Eger bu klasi yaratmaq sitesek ashagidaki koddan istifade edeceyik:

       Abstraction_BMW.A a= new Abstraction_BMW().new A();

        TODO NESTED CLASS
        Bu klass sadece STATIC INNER klassdir.
        Misal:
        Abstraction_BMW.A  a = new Abstraction_BMW.A();

        Bu Inner ve nested klasslar metodun da ichinde yarana biler:

        class Main$1 extends Abstract_Car{

            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void speedUp() {

            }
        };
        |||||||||||||||||||||||||||||||||||||||
        TODO        UNNAMED klasslar bu arxa planda yaranan klaslardir.

        ||||||||||||||||||||||||||||||||||||||||||||||||||||
        TODO INTERFACE-lerxz
        Interface de abstract kimi abstraktdir. Onun obyekti qeti shekilde yaradilmaz.

        Bir klass sadece bashqa diger bir klassi "extend" etdiyi halda, "interface" ise bir nec'
        kklassi "implement" ede biler.

        Extendler - strict ve restrict dir
        Implement(Interfeysler) daha boshdur, daha flexible-dir.

        TODO Default keyword
        Kohne javada interface de bedeni olan "method" yazmaq mumkun deyildi. Lakin sonraki verisyalarda
        "default keywor" yazmaqla methodun bedenini yazmaq mumkun olur meselen:

        default void foo(){

        }
        Hemchinin de interfeyslerde elan edilen deyishenler default olaraq:
        staticdir, final -dir. ve evvelceden deyeri inisialize edilmelirdir:

        int a = 5;

        TODO MARKER INTERFEYSLER

        Ichinde hech bir shey olmayan sirf xususiyyet vermekle

   ===========================================================

        TODO PATTERN

        TODO Singleton Pattern -
        Bir obyektin sadece bir defe yaradilmasini temin etmek. Bunun ucun numune olaraq ashagidaki proqram kodunu teqdim edirem:

 public class Fanar extends Device {

    private Fanar() { //Mutleq private olmaldir ki obyekt yaradila bilmesin

    }

    private static Fanar f = null;

    public static Fanar instance() {
        if (f == null) {
            f = new Fanar();
        }
        return f;
    }

    public void drive() {
        System.out.println("Fanar drive");
    }
}

        TODO QEYD: STRING Immutabledir. Mutable ve immutable class

  Eger obyektin ichinde String deyishen yaratsaq ve onu GETTER VE SETTER ile private edib tehluksiz etsek. Bunun ozu immutable demekdir.
  Numune olaraq ashagidaki kodu getirirem:

  Eger bir klassin ichindeki deyerler stabil qalirsa bu IMMUTABLE adlanir.



    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Fanar() {

    }

    Eger bir klass ve ya bir deyisheni hech kim deyishe bilmirse bu TODO EFFEKTIVLY FINAL adlanir.
   Bu o demekdir ki yeni FINAL olmadan biz elementi deyishmeye imkan vermiriksek bu EFFEKTVILIY FINAL adlanacaqdir.
   Java-da "effectively final" termini, bir dəyişənin (variable) təyin edildikdən sonra dəyişdirilmədiyini ifadə edir.
   Yəni, dəyişənə yalnız bir dəfə dəyər verilir və sonra həmin dəyər dəyişdirilmir, ancaq bu dəyişən final açar sözü ilə təyin edilməyib.
    Bu cür dəyişənlər, əslində final kimi davranır, baxmayaraq ki, final açar sözü istifadə olunmayıb.


    ==============================================================================
    TODO BUILDER PATTERN
    Builder şablonu, kompleks obyektlərin yaradılmasını addım-addım idarə edən bir dizayn şablonudur.
    Bu şablon yaradıcı şablonlar qrupuna aiddir və xüsusilə, çox sayda parametrlərlə obyekt yaratmaq lazım olduqda istifadə olunur.
    Builder şablonu obyektin tədricən qurulmasına və yekun mərhələdə tam obyektin yaradılmasına imkan verir.
    Bu yanaşma, kodun oxunabilirliyini artırır və obyektlərin müxtəlif konfiqurasiyalarda yaradılmasını asanlaşdırır.

    ==============================================================================

    TODO PROXY PATTERN

    Classlar arasinda durur ve mueyyen klassin inshini gorur.
    Proxy şablonu, obyektin əslində istifadəsini nəzarət etmək üçün ona bir "vasitəçi" (proxy) obyekt vasitəsilə giriş təmin edən bir dizayn şablonudur.
     Bu şablon struktur şablonlar qrupuna aiddir və obyektin yaradılma və ya istifadəsinin nə vaxt və necə həyata keçiriləcəyinə nəzarət etməyə imkan verir.
     Proxy şablonu, əsas obyektə daxil olmadan əvvəl əlavə funksionallıq əlavə etmək və ya obyektin istifadəsini məhdudlaşdırmaq üçün istifadə olunur.

    TODO FACTORY PATTERN / PROX FACTORY PATTERN

    Fabrik (Factory) şablonu Java-da ən çox istifadə olunan dizayn şablonlarından biridir.
    Bu tip dizayn şablonu yaradıcı şablonlara aiddir, çünki obyektin yaradılması üçün ən yaxşı yollardan birini təmin edir.

    Factory şablonunda, obyektin yaradılma məntiqini müştəriyə (istifadəçiyə) açıqlamadan obyekt yaradırıq və
     yeni yaradılmış obyektə ümumi bir interfeys vasitəsilə müraciət edirik.

    TODO SOLID PRICINPLES
    SOLID prinsipləri, obyekt yönümlü proqramlaşdırmada kodun daha yaxşı dizayn edilmesi və saxlanması üçün istifadə olunan beş əsas prinsipi təmsil edir. Bu prinsiplər Java kimi obyekt yönümlü dillərdə proqramlaşdırma edərkən yaxşı təcrübələri təmin etməyə kömək edir.

    Single Responsibility Principle (Tək Məsuliyyət Prinsipi):

    Bir sinif yalnız bir iş üçün məsuliyyət daşımalıdır. Sinif yalnız bir səbəbə görə dəyişdirilməlidir.
    Open/Closed Principle (Açıq/Qapalı Prinsip):

    Siniflər, modullar və funksiyalar genişləndirilə biləcək, amma dəyişdirilməyə qapalı olmalıdır.
    Yəni yeni xüsusiyyətlər əlavə edərkən mövcud kodu dəyişdirmək əvəzinə, onu genişləndirərək əlavə etməliyik.
    Liskov Substitution Principle (Liskov Əvəzləmə Prinsipi):

    Bir subclass (alt sinif) hər zaman onun superclass (üst sinif) kimi istifadə edilə bilməlidir.
    Başqa sözlə, bir obyekt, üst sinifindən alınan metodları normal işlədir və onların yerinə həmin metodların daha xüsusi versiyaları ilə əvəz olunur.
    Interface Segregation Principle (İnterfeys Ayırma Prinsipi):

    Bir sinif yalnız ehtiyac duyduğu metodları istifadə edən interfeyslərlə işləməlidir.
    Böyük interfeyslərdən çox, daha kiçik, daha spesifik interfeyslərə bölünməlidir.
    Dependency Inversion Principle (Asılılıq İnversiyası Prinsipi):

    Yüksək səviyyəli modullar aşağı səviyyəli modullara birbaşa asılı olmamalıdır.
    Hər iki növ modul abstraksiyalara bağlı olmalıdır. Başqa sözlə, konkret siniflərdən çox interfeyslərə və abstrakt siniflərə asılı olmalıyıq.
    Bu prinsipləri öyrənmək və onlara riayət etmək Java-da daha sağlam, uzadılabilir və saxlanması asan olan kodlar yazmağa kömək edəcəkdir.

    TODO DATE nedir?

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dt = sdf.format(d);
        String s  = "01-11-2024";
        Date d1 = sdf.parse(s);
        String dt2 = sdf.format(d1);
        System.out.println(dt2);
        System.out.println(dt);

        Scanner sc = new Scanner(System.in);
        System.out.println("type your birthday");
        String datesSTR = sc.nextLine();
        Date dClient = sdf.parse(datesSTR);

        Date dMe = sdf.parse("08-01-1993");

        long client = dClient.getTime();
        long me = dMe.getTime();
        long diff = client - me;

        System.out.println(diff/(24*60*60*1000)/365);

        TODO ENUM nedir?
        ====================================================
        public enum EMELIYYAT {
            TOPLA('+'), CIX('-'), VUR('*'), BOL('/');

            private char c;

            EMELIYYAT(){

            }

            public char getOperationSimvol(){
                return this.c;
            }


            EMELIYYAT(char c) {
                this.c = c;
            }

            public double hesabla(double a, double b){
                if(c=='+'){
                    return a+b;

                }
                return -1;
            }

        }
        ==================================================================
                public class Main {
            public static void main(String[] args) {
                EMELIYYAT e = EMELIYYAT.TOPLA;
               double netice = e.hesabla(5,5);
                System.out.println(netice);
                System.out.println(e.getOperationSimvol());
            }
        }
        ==================================================================
        ==================================================================
        ENUMDA realliqda ise ashagidaki hadise bash verir:

        public static final EMELIYYAT2 TOPLA = new EMELIYYAT2('+');
        public static final EMELIYYAT2 CIX = new EMELIYYAT2('-');
        public static final EMELIYYAT2 VUR = new EMELIYYAT2('*');
        public static final EMELIYYAT2 BOL = new EMELIYYAT2('/');

        private char c;

        EMELIYYAT2() {

        }

        EMELIYYAT2(char c) {
            this.c = c;
        }

        public char getOperationSimvol() {
            return this.c;
        }

        public double hesabla(double a, double b) {
            if (c == '+') {
                return a + b;

            }
            return -1;
        }
        ===========================================================
        ===========================================================

        TODO TRY WITH RESOURCE
        public class FileUtility2 {

 public static void writeIntoFile(String filename, String text) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) { // Burada olanlar Closable olmalidir. Try bunu bilir.
            bw.write(text);
            bw.close();
        }
    }
}

       TODO Fayl yaratmagin usullari

       ================================
       ================================

        package file;

        import java.io.BufferedWriter;
        import java.io.FileWriter;

            public class FileUtility2 {

                public static void writeIntoFile(String filename, String text) throws Exception {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) { // Burada olanlar Closable olmalidir. Try bunu bilir.
                        bw.write(text);
                        bw.close();
                    }
                }
            }
          ===============================
            package file;

            public class Main {
                public static void main(String[] args) throws Exception {
                    FileUtility2.writeIntoFile("test.txt", "Salam dunya");
                }
            }
        ====================================
        ====================================
        TODO        FAYL yaratmagin ikinci usulu

        private static void writeIntoFile(String filename, String text, boolean append) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) { // Burada olanlar Closable olmalidir. Try bunu bilir.
            bw.write(text);
            bw.close();
        }
        }

        public static void writeIntoFile(String filename, String text) throws Exception {
            writeIntoFile(filename, text, false);
        }

        public static void appendIntoFile(String filename, String text) throws Exception {
            writeIntoFile(filename, text, true);

        }

        TODO FILEOUTPUSTREAM - Colden iceriye nese gonderirem

        TODO FILEINPUTSTREAM - Iceriden cole nese gonderirem

        TODO        FAYLI METN METN OXUMAQ UCUN

       public static String read(String fileName) throws Exception {
       try (
             InputStream in = new FileInputStream(fileName);
             InputStreamReader r = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(r);
            )
       {
            String line = null;
            String result = "";

            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            return result;
        }
        }

    TODO        ANNOTATION

    ANNOTATION - nun yaradilmsai:

     package annotation;

    import java.lang.annotation.*;

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)

    public @interface Main {

    }

    TODO        REFLECTION


    TODO        CUSTOM ANNOTATİON PROCESSOR


    TODO LOMBOK


    TODO GITHUB

    git push

    git commit -m "menim ilk repozitorim"

    git config --global user.email "aliyevhacibaba@gmail.com"

    git clone https://github.com/dedebaba/awesomeresume.git

    git add .

     */

}

