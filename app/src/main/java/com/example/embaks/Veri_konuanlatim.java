package com.example.embaks;

import java.util.ArrayList;
import java.util.List;

public class Veri_konuanlatim {

    public static List getData(String isim) {
        List list = new ArrayList<>();

        if (isim.equals("11")) {


            list.add(new Card_Ozellikleri("657 Sayılı Devlet Memuru Kanunu", null, Card_Ozellikleri.EN_UST_BOLUM));
            list.add(new Card_Ozellikleri("∫5x", "Belediyeler, İl Özel idareleri, Genel Katma Bütçeli Kurumlar, Kanunla kurular Fonlar, Kefalet Sandıkları, Beden Terbiyesi Bölge Müdürlükleri", Card_Ozellikleri.IKILI_BASLIK));



            list.add(new Card_Ozellikleri("barış", null, Card_Ozellikleri.UST_BASLIK));

            list.add(new Card_Ozellikleri("Temel İlkeler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Sınıflandırma", "Görevlerin gerektirdiği niteliklere ve mesleklere göre sınıflara ayırmak", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kariyer", "Lüzumlu bilgilere ve en yüksek derecelere kadar ilerleme.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Liyakat", "Sınıflar içinde ilerleme ve yükseltme, eşit imkanlar", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("4 İstihdam Şekliyle Personel Çalıştırılır", "Memurlar, Sözleşmeli Personel, Geçici Personel, İşçiler", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ödev ve Sorumluluklar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Sadakat", "Asilliğe geçtikten sonra en geç 1 ay'a kadar kurumcu yapılan törenle yemin belgesi imzalanır", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Tarafsız ve Devlete Bağlılık", "Memurlar Siyasi partiye üye oalmaz ve eylemlerde bulunamazlar", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Davranış ve İşbirliği", "Devlet Memurlarının işbirliği içinde çalışmaları esastır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Yurt dışında Davranış", "Yurt dışında devlet itibarını gözetir ve davranışlarına dikkat etmelidir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Amir Durumda Olanların Görev ve Sorumlulukları", "Amir, memura hakkaniyet ve eşitlik içinde davranır, kanuna aykırı emir veremez.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kişisel Sorumluluk ve Zarar", "Memurun ihmal ve tedbirsizliği sonucu idare zarara uğratılmışsa, bu zarar memura RAYİÇ bedeli üzerinden hesaplanır ve ödetilir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kişilerin Uğradıkları Zararlar", "Kişiler memur tarafından uğratıldıkları zarardan dolayı kişiye değil kuruma dava açarlar. Memur başkasının malını alırsa zararı devlet karşılar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Mal Bildirimi", "Devlet memurları, kendileriyle, eşlerine ve velayetleri altındaki çocuklarına ait taşınır ve taşınmaz malları, alacak ve borçları hakkında, özel kanunda yazılı hükümler uyarınca, mal bildirimi verirler. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Basına Bilgi ve Demeç Verme", "Memurlar basına bilgi ve demeç veremezler. Bakanlığın yetkisi dâhilinde valiler veya yetkilendirdiği kişiler verebilir ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Resmi Belge Araç Gereç Kullanımı", "Devlet memurları görevleri ile ilgili resmi belge araç ve gereçleri, yetki verilen mahaller dışına çıkaramazlar, hususi işlerinde kullanamazlar.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Genel Haklar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Uygulamayı İsteme Hakkı", "Yürürlükte bulunan hükümlerin kendileri hakkında aynen uygulanmasını isteme hakkına sahiptir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Güvenlik", "Kanunda yazılı haller dışında memurluğa son verilemez.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Emeklilik", "Kanunda belirtilen şartlara göre emeklilik hakları vardır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Müracaat Şikâyet Ve Dava Açma Hakkı", "Kuruma ve Amirine silsile yolu ile dava açabilir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Sendika Kurmak", "Memurlar sendika kurabilir ve bunlara üye olabilir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İzin", "Kanunda gösterilen şartlarda izin hakları vardır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kavuşturma Ve Yargılama", "Görevleri sırasında işledikleri suçlardan dolayı soruşturma ve kovuşturma yapılması özel hükümlere tabidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İsnat Ve İftiralara Karşı Koruma", "Memurlar hakkındaki ihbar ve şikayetler, garaz veya mücerret hakaret için, uydurma bir suç isnadı suretiyle yapıldığı ve soruşturma veya yargılamanın tabi olduğu kanuni işlem sonucunda bu isnat sabit olmadığı takdirde, merkezde bu memurun en büyük amiri, illerde valiler, isnatta bulunanlar hakkında kamu davası açılmasını Cumhuriyet Savcılığından isterler.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Yasaklar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Toplu eylemlerde ve hareketlerde bulunma yasağı", "Kamu hizmetini aksatacak şekilde görevlerini suiistimal edemezler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Grev yasağı", "Herhangi bir grev ve propaganda yapmaları yasaktır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ticaret ve Diğer Kazanç Getirici Faaliyetlerde Bulunma Yasağı", "Memurlar hiçbir şekilde ticari faaliyetlerde bulunamaz. Ayrıca Eşleri, reşit olmayan çocukları, yasaklanan faaliyetlerde bulunan memurlar bu durumu 15 gün içinde bağlı oldukları kuruma bildirmekle yükümlüdürler ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Hediye alma, menfaat sağlama yasağı", "Memurların hediye almaları yasaktır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Denetimindeki teşebbüsten menfaat sağlama yasağı", "Denetimindeki teşebbüsten menfaat sağlaması yasaktır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Gizli bilgileri açıklama yasağı", "Memurlar gizli bilgileri, yetkili bakanın ini olmadıkça açıklayamazlar.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Tesis Edilen Sınıflar", "1. Genel İdare Hizmetleri Sınıfı\n" +
                    "2. Din Hizmetleri Sınıfı\n" +
                    "3. Teknik Hizmetleri Sınıfı\n" +
                    "4. Emniyet Hizmetleri Sınıfı\n" +
                    "5. Sağlık Hizmetleri Ve Yardımcı Sağlık Hizmetleri Sınıfı\n" +
                    "6. Yardımcı Hizmetler Sınıfı\n" +
                    "7. Eğitim Ve Öğretim Hizmetleri Sınıfı\n" +
                    "8. Mülki İdare Amirliği Hizmetleri Sınıfı\n" +
                    "9. Avukatlık Hizmetleri Sınıfı\n" +
                    "10. Milli İstihbarat Hizmetleri Sınıfı\n" +
                    "11. Jandarma Hizmetleri Sınıfı\n" +
                    " 12. Sahil Güvenlik Hizmetleri Sınıfı\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıfların Öğrenim Durumlarına Göre Giriş ve Yükselebilecek Derece ve Kademeleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("İlkokulu bitirenler", "Derece: 15 ve Kademe: 1", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ortaokulu bitirenler", "Derece: 45 ve Kademe: 2", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Liseyi bitirenler", "Derece: 13 ve Kademe: 3", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2 yıllık bitirenler", "Derece: 10 ve Kademe: 2", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4 yıllık bitirenler", "Derece: 9 ve Kademe: 1", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5 yıllık bitirenler", "Derece: 9 ve Kademe: 2", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6 yıllık bitirenler", "Derece: 9 ve Kademe: 3", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri(null, "● Her üç yıl için bir derece yükselmesi verilir. \n" +
                    "● Her yıl için bir kademe yükselmesi verilir. \n" +
                    "●  Kademe ilerlemesi ile ilgili onay mercii atamaya yetkili amirdir. \n" +
                    "●  Son 8 yıllık süre içinde herhangi bir disiplin cezası almayanların kazanılmış hak aylıkları kadro şartı aranmaksızın bir üst dereceye yükseltilir.\n" +
                    "● Genel olarak 18 yaşını tamamlayanlar memur olabilirler. \n" +
                    "● Genel olarak ortaokulu bitirenler memur olabilirler. \n" +
                    "● Ortaokul mezunu istekli bulunamazsa ilkokulu bitirenlerin alınması caizdir. \n" +
                    "● Bir meslek veya sanat okulunu bitirenler en az 15 yaşını doldurmuş olanlar kazai rüşt ile memur olabilir. \n" +
                    "● Göreve ilk defa atananlar zorlayıcı bir sebep olmaksızın belirlenen sürede işe başlamazlarsa; 1 Yıl süreyle devlet memuru olarak istihdam edilemezler.\n" +
                    "● Memurların eşit dereceler arasında veya derece yükselmesi suretiyle sınıf değiştirmeleri caizdir. \n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Adaylık", "● Adaylık süresi 1 yıldan az 2 yıldan çok olamaz. \n" +
                    "● Adaylık süresince memur başka kuruma nakil olamaz. \n" +
                    "● Adaylık süresince aylıktan kesme ve kademe ilerlemesi durdurulması alanlar meslekten atılır. \n" +
                    "● Disiplin amiri teklifi ve atamaya yetkili amir onayı ile ilişiği kesilir. \n" +
                    "● İlişiği kesilenler derhal Devlet Personel Başkanlığına bildirilir. \n" +
                    "● Adaylık süresince ilişiği kesilenler ( Sağlık sorunları hariç ) 3 yıl boyunca Devlet Memurluğuna alınmazlar. \n" +
                    "● Aynı yerdeki görevlerine atananlar tebliğ gününü izleyen iş günü işe başlamak zorundadır. \n" +
                    "● Başka yerdeki görevlere atananlar, tebliğ tarihinden itibaren 15 gün içerisinde işe başlamak zorundadırlar. \n" +
                    "● Savaş ve olağanüstü hallerde bu süre Cumhurbaşkanı Kararı ile kısaltılabilir. \n" +
                    "● Bu iki durumda da başlamazlarsa atamaları iptal edilir ve 1 yıl Memur olamazlar. \n" +
                    "● Başka yerdeki görevine atananlar 15 güne ilaveten +10 gün süre verilebilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Diğer Hususlar ", "● Devlet Personel Başkanlığı atama yapılacak boş kadroların bilgileri başvurma süresinin bitiminden en az 15 gün önce Resmi Gazete, radyo, televizyon ve ülke çapında tirajı yüksek gazetelerden asgari biri ve uygun görülecek diğer araçlar ile duyurur. \n" +
                    "● Kurum ve kuruluşlar % 3 oranında engelli çalıştırmak zorundadır. % 3’ün hesaplanmasında ilgili kurum veya kuruluşun (yurtdışı hariç) toplam dolu kadro sayısı dikkate alınır. \n" +
                    "● 3 defa başarı belgesi alanlara , üstün başarı belgesi verilir. \n" +
                    "• Üstün başarı belgesi alanlara en yüksek devlet memuru aylığının (ek gösterge dahil) %200 e kadar ödül verilebilir. Mali yıl içinde ödüllendirileceklerin sayısı dolu kadronun 1000/10 ‘undan fazla – Meb ,Emniyet ,Jandarma vb. ise 1000/20’ den fazla olamaz. \n" +
                    "• Yıl içerisinde ödüllendirilecek personel sayısı kurumlarca , Ocak ayı sonuna kadar DPB’ye bildirilir. \n" +
                    "• Ders görevi  ile ilgili ücretle okutulacak ders saatlerinin sayısı, ders görevi alacakların nitelikleri ve diğer hususlar ; İlgili bakanlığın teklifi ve bakanlar kurulu kararı ile tespit edilir.\n" +
                    "● Daha iyi yetiştirilmek, eğitilmek, bilgileri arttırmak için yurt dışına gönderilenlere ayrılma süresi,       2 yıla kadar; Gerekirse bu süre en çok 1 kat uzatılabilir. \n" +
                    "● Fazla çalışma ücreti; Sosyal hak ve yardımlardan değil.\n" +
                    "● Aynı Kurumun başka başka yerlerde bulunan aynı sınıftaki memurları, karşılıklı olarak yer değiştirme suretiyle atanmalarını isteyebilirler. Bu isteğin yerine getirilmesi atamaya yetkili amirlerince uygun bulunmasına bağlıdır. \n" +
                    "● İlgili bakan her 3 yılda onayı yenilemek kaydıyla memurları yurt dışında görevlendirebilir. \n" +
                    "● Devlet memurlarına ikinci bir görev verilemez, para ödenmez. İstisnalar hariç. Örneğin; Öğretmenlere; okul ve enstitü müdürlüğü, başyardımcılığı ve yardımcılığı görevleri yaptırılabilir.\n" +
                    "● Askerden sonra memuriyete dönmek isteyenler terhis tarihinden itibaren 30 gün içinde kurumlarına başvurmak ve kurumda 30 gün içinde memuru göreve başlatmak zorundadır. \n" +
                    "● En fazla 2 defa memur kendi isteği ile çekilebilir. \n" +
                    "● Kadrosu kaldırılan memurlar en geç 6 ay içinde kendi kurumlarında niteliklerine uygun kadroya atanırlar. \n" +
                    "● Mazeretsiz 10 gün görevine gelmeyen memur, görevden çekilmiş sayılır. 6 ay geçmeden yine memur olamazlar. \n" +
                    "● Olağanüstü hal ve seferberlikte görevine başlamayanlar, bırakanlar; Bir daha memur olamaz. \n" +
                    "● Memurların çalışma süreleri haftada 40 saattir. \n" +
                    "● Günlük çalışma süreleri merkezde; Cumhurbaşkanı , illerde ise ; Valiler tarafından yapılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İzinler", "• Memurların izin süreleri 1-10 yıl arası çalışanlar için ; 20 Gün. 10 yıldan fazla olanlar için; 30 gün. \n" +
                    "• Zorunlu hallerde gidiş ve dönüş için en çok ikişer gün eklenebilir. \n" +
                    "• Birbirini izleyen iki yılın izni bir arada verilebilir. \n" +
                    "• Amirin uygun bulduğu zamanda, toptan ya da kısım kısım kullanılabilir. \n" +
                    "• Hizmetleri sırasında radyoaktif ışınlarla çalışan personele, her yıl yıllık izinlerine ilaveten 1 ay sağlık izni verilir. \n" +
                    "• Kadın memura doğumdan önce 8, doğumdan sonra 8 hafta toplamda 16 hafta analık izni verilir. Çoğul gebelikte doğum öncesi 8 haftaya + 2 hafta ilave edilir. Sağlık raporuyla belgelemek kaydıyla doğumdan önce 3 haftaya kadar çalışılabilir. \n" +
                    "• Eşin doğum yapması halinde, Babalık izni 10 gündür. \n" +
                    "• Kadın memura, doğum sonrası analık izni bitimine müteakip , ilk 6 ayda günde 3 saat – ikinci 6 ayda günde 1,5 saat süt izni verilebilir. \n" +
                    "• Kendisi veya çocuğunun evlenmesi ya da eşinin, çocuğunun,kendisinin veya eşinin ana,baba ve kardeşinin ölümü hallerinde isteği üzerine 7 gün izin verilir. \n" +
                    "• Belirtilen haller dışındaki durumlarda kullanılmak üzere 10 güne kadar mazeret izni verilebilir. \n" +
                    "• Zaruret halinde öğretmenler hariç, aynı usulle 10 gün daha mazeret izni verilebilir. \n" +
                    "• %70 engelli çocuğu olana yıllık 10 gün daha ilave izin verilir. \n" +
                    "• Memura, aylık ve özlük hakları korunarak, verilecek raporda gösterilecek lüzum üzerine, kanser, verem ve akıl hastalığı gibi uzun süreli bir tedaviye ihtiyaç gösteren hastalığı hâlinde 18  aya kadar, diğer hastalık hallerinde ise 12 ay a kadar izin verilir. \n" +
                    "• Görevi sırasında veya görevinden dolayı bir kazaya veya saldırıya uğrayan veya bir meslek hastalığına tutulan memur, iyileşinceye kadar izinli sayılır. \n" +
                    "• Aylıksız izin ; Doğum yapan memura, doğum sonrası analık izni süresinin bitiminden; eşi doğum yapan memura ise, doğum tarihinden itibaren istekleri üzerine 24 ay’a kadar aylıksız izin verilir.  Yabancı ülke resmî kurumlarında 10 yıl, Uluslararası kuruluşlarda 21 yıla kadar aylıksız izin \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Disiplin Cezaları Çeşitleri ve Ceza Uygulanacak Haller", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Uyarma", "Memura, görevinde ve davranışlarında daha dikkatli olması gerektiğinin yazı ile bildirilmesidir. Özürsüz, izinsiz göreve geç gelmek, erken ayrılmak. Tasarruf tedbirlerine riayet etmemek. Usulsüz müracaat ve şikâyette bulunmak. Görevine karşı kayıtsızlık göstermek. Belirlenen kılık kıyafet hükümlerine aykırı davranmak", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kınama", "Memura, görevinde ve davranışlarında kusurlu olduğunun yazı ile bildirilmesidir. Eşin, çocuğun kazanç faaliyetini zamanında kuruma bildirmemek. Görevde amire hal ve hareketleri ile saygısızca davranmak. Devlete ait resmi araç-gereci özel işlerinde kullanmak. İş arkadaşlarına, personele kötü muamelede bulunmak. İş arkadaşlarına ve sahibine söz ve hakaretle sataşmak. Verilen emirlere itiraz etmek. Yetkili olmadığı halde basına bilgi ve demeç vermek. Borçlarını kasten ödememek", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Aylıktan kesme", "Memurun, brüt aylığından (1/30 - 1/8 )arasında kesinti yapılmasıdır. Kasıtlı olarak verilen emir ve görevleri tam yapmamak. Özürsüz olarak göreve 1-2 gün geç gelmek. Görevle ilgili konularda yalan-yanlış beyanda bulunmak. Görev sırasında amirine sözle saygısızlık etmek. Memurun itibar ve güveninin sarsacak davranışta bulunmak. Herhangi bir yerin izinsiz kullanılmasına yardımcı olmak", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kademe İlerlemesinin Durdurulması", "Fiilin ağırlık derecesine göre memurun, bulunduğu kademede ilerlemesinin 1 - 3 yıl durdurulmasıdır. Göreve sarhoş gelmek, görev yerinde alkol kullanmak. Özürsüz ve kesintisiz 3-9 gün göreve gelmemek. Gerçeğe aykırı rapor ve belge düzenlemek. Ticaret yapmak ve kazanç getirici faaliyetlerde bulunmak. Belirlenen sürelerde mal bildiriminde bulunmamak. Açıklanması yasaklanan bilgileri açıklamak. Verilen görev ve emirleri kasten yapmamak. Herhangi bir siyasi parti adına faaliyette bulunmak.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Devlet Memurluğundan Çıkartma", "Bir daha Devlet memurluğuna atanmamak üzere memurluktan çıkarmaktır. Greve katılma, toplu göreve gelmeme. Siyasi partiye girmek. Yasaklanmış her türlü yayın, afiş vb. kuruma sokmak. Özürsüz olarak bir yılda 20 gün göreve gelmemek. Memurlukla bağdaşmayacak yüz kızartıcı hareketlerde bulunmak. Yetki almadan gizli bilgileri açıklamak. Siyasi ve ideolojik eylemlerden dolayı arananları gizlemek.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Diğer Notlar", "• Uyarma, kınama ve aylıktan kesme cezaları disiplin amirleri tarafından verilir. Soruşturma tamamlandığı günden itibaren 15 gün içinde kararı vermek zorundadır. \n" +
                    "• Kademe ilerlemesinin durdurulması cezası, memurun bağlı olduğu kurumdaki disiplin kurulunun kararı alındıktan sonra, atamaya yetkili amirler verir.30 gün \n" +
                    "• Memurluktan çıkarma cezası 6 ay içinde disiplin kovuşturmasına başlamadığı takdirde zamanaşımına uğrar. Soruşturma açılırsa 6 ay içinde kurul karara bağlar. \n" +
                    "• Uyarma ve Kınama cezaları, 5 yıl dır. Aylıktan Kesme ve Kademe ilerlemesi durdurulması cezaları, 10 yıl sonra atamaya yetkili amire başvurarak özlük dosyasından silinmesini isteyebilir. \n" +
                    "• Uyarma-Kınama-Aylıktan kesme için, Disiplin Kuruluna;  Kademe İlerlemesi Durdurulması için,Yüksek Disiplin Kuruluna itiraz edilir. \n" +
                    "• İtirazda süre, karar tebliğinden itibaren 7 gündür. 7 gün içinde savunmasını yapmayan memur, savunma hakkından vazgeçmiş sayılır. \n" +
                    "• İtiraz mercileri kararı, 30 gün içinde vermek zorundadırlar. \n" +
                    "• Görevden uzaklaştırılan memur için 10 gün içinde soruşturmaya başlanması şarttır. Görevden uzaklaştırılan memura bu sürede aylıklarının 3/2 si ödenir. \n" +
                    "• Görevden uzaklaştırma bir disiplin kovuşturması icabından en çok 3 ay devam edebilir. \n" +
                    "• Bir takvim yılı içinde kullanılan hastalık izin süreleri toplamının 7 günü aşması halinde, aşan sürelere isabet eden zam ve tazminatlar % 25 eksik ödenir. \n" +
                    "• Kurumlar gerektiği takdirde personelini günlük çalışma saatleri dışında fazla çalışma ücreti vermeksizin çalıştırabilirler. Bu durumda fazla çalışmanın her sekiz ( 8 ) saati için bir gün hesabı ile izin verilir. Ancak, bu suretle verilecek iznin en çok on günlük kısmı yıllık izinle birleştirilerek yılı içinde kullandırılabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("12")) {

            //list.add(new Card_Ozellikleri("", "", Card_Ozellikleri.IKILI_BASLIK));


            list.add(new Card_Ozellikleri("Bu kanunun amacı ", "* Memurlar ve diğer kamu görevlilerinin görevleri sebebiyle işledikleri suçlardan dolayı yargılanabilmeleri için izin vermeye yetkili mercileri belirtmek ve izlenecek usulü düzenlemektir.\n" +
                    "* Ağır cezayı gerektiren suçüstü hali genel hükümlere tabidir.\n" +
                    "* Disiplin hükümleri saklıdır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İzin vermeye yetkili merciler/ Soruşturma izni yetkisi", "* İlçede görevli memurlar ve diğer kamu görevlileri hakkında: KAYMAKAM \n" +
                    "* İlde ve merkez ilçede görevli memurlar ve diğer kamu görevlileri hakkında: VALİ \n" +
                    "* Bölge düzeyinde teşkilatlanan kurum ve kuruluşlarda görev yapan memurlar ve diğer kamu görevlileri hakkında görev yaptıkları: İLİN VALİSİ \n" +
                    "* Cumhurbaşkanına veya Cumhurbaşkanlığına bağlı, ilgili veya ilişkili kuruluşlar ve bakanlıkların merkez ve bağlı veya ilgili kuruluşlarında görev yapan diğer memur ve kamu görevlileri hakkında o kuruluşun: EN ÜST İDARİ AMİRİ \n" +
                    "* Cumhurbaşkanı kararıyla atanan memurlar ve diğer kamu görevlileri hakkında: CUMHURBAŞKANI veya İLGİLİ BAKAN\n" +
                    "* TBMM’de görevli memurlar ve diğer kamu görevlileri hakkında: TBMM GENEL SEKRETERİ\n" +
                    "* TBMM Genel Sekreteri ve yardımcıları hakkında: TBMM BAŞKANI\n" +
                    "* Cumhurbaşkanlığında görevli memurlar ve diğer kamu görevlileri hakkında: CUMHURBAŞKANLIĞI İDARİ İŞLER BAKANI \n" +
                    "* Cumhurbaşkanlığı İdari İşler Başkanı hakkında: CUMHURBAŞKANI \n" +
                    "* Büyükşehir belediye başkanları, il ve ilçe belediye başkanları; büyükşehir, il ve ilçe belediye meclisi üyeleri ile il genel meclisi üyeleri hakkında: İÇİŞLERİ BAKANI \n" +
                    "* İlçelerdeki belde belediye başkanları ve belde belediye meclisi üyeleri hakkında: KAYMAKAM \n" +
                    "* Merkez ilçelerdeki belde belediye başkanları ve belde belediye meclisi üyeleri hakkında: İLİN VALİSİ \n" +
                    "* Köy ve mahalle muhtarları ile bu Kanun kapsamına giren diğer memurlar ve kamu görevlileri hakkında: İlçelerde KAYMAKAM, merkez ilçede VALİ \n" +
                    "* Yokluklarında ise vekilleri tarafından bizzat kullanılır. \n" +
                    "* Ast memur ile üst memurun aynı fiile iştiraki halinde izin, üst memurun bağlı olduğu merciden istenir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İhbar veya şikâyetin işleme konulması için", "1. Soyut ve genel nitelikte olmaması, \n" +
                    "2. Kişi veya olay belirtilmesi, \n" +
                    "3. İddiaların ciddi bulgu ve belgelere dayanması, \n" +
                    "4. İhbar veya şikayet dilekçesinde; dilekçe sahibinin doğru ad, soyad ve imzası ile iş veya ikametgah adresinin bulunması zorunludur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ön inceleme başlatılması:", "* Cumhuriyet başsavcılıkları ile izin vermeye yetkili merciler ihbar ve şikayetler konusunda daha önce sonuçlandırılmış bir ön inceleme olması halinde müracaatı işleme koymazlar.\n" +
                    "* Ön incelemenin neticesini etkileyecek yeni belge sunması halinde işleme koyabilirler.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ön incelemede görevlendireceklerin belirlenmesi", "* İzin vermeye yetkili merci tarafından bizzat yapılabilir.\n" +
                    "* Yetkili merci tarafından görevlendirecek denetim elemanlarınca yapılabilir.\n" +
                    "* Yetkili merci tarafından üstü konumundaki memur ve kamu görevlileri yaptırabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Başka Mercilerin Ön İncelemesinde Görevlendirilemeyecekler", "1. Yargı mensupları \n" +
                    "2. Yargı kuruluşlarında çalışanlar \n" +
                    "3. Askerler\n" +
                    "* Ön inceleme ile görevlendirilen kişi veya kişiler, bakanlık müfettişleri ile kendilerini görevlendiren merciin bütün yetkilerine sahiptir.\n" +
                    "* Bu konuda hüküm bulunmayan hususlarda Ceza Mahkemeleri Usulü Kanununa göre işlem yapılabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ön incelemede süre", "* Yetkili merci soruşturma izni konusundaki kararını bu Kanun kapsamında suçun işlenildiğini öğrendiği tarihten itibaren ön inceleme dahil 30 gün içinde verir. \n" +
                    "* Zorunlu hallede bu süre 15 günü geçmemek üzere bir defa uzatılabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İtiraz süresi", "* Yetkili merciin kararının tebliğinden itibaren 10 gündür. \n" +
                    "* İtirazlar, öncelikle incelenir ve en geç 3 ay içinde karara bağlanır. \n" +
                    "* Verilen kararlar kesindir. Bu kararlar Cumhuriyet Başsavcılığına bildirilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Danıştay İkinci Dairesi", "1) C.B kararı ile atanan memurlar,\n" +
                    "2) C.B’ de görevli memurlar,\n" +
                    "3) C.B idari işler ,\n" +
                    "4) TBMM’ de görevli mamurlar,\n" +
                    "5) TBMM genel sekreteri ve yardımcısı,\n" +
                    "6) Büyükşehir belediye başkanları,\n" +
                    "7) İl ve ilçe belediye başkanları,\n" +
                    "8) Büyükşehir, il, ilçe belediye meclis üyeleri,\n" +
                    "9) Büyükşehir il genel meclis üyeleri hakkındakilere bakar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bölge İdari Mahkemesi", "1) İlçede görevli memurlar,\n" +
                    "2) İlçelerdeki belde belediye başkanları,\n" +
                    "3) Belde belediye meclis üyeleri,\n" +
                    "4) Köy ve mahalle muhtarları,\n" +
                    "5) İlde ve ilçede görevli memurlar,\n" +
                    "6) Merkez ilçede belde ve belediye başkanları,\n" +
                    "7) Merkez ilçede meclis üyeleri hakkındakilere bakar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İştirak Halinde İşlenen Suçlar", "Memur olmayan, memur olanla; ast memur, üst memurla aynı mahkemede yargılanır. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Soruşturma İzninin Gönderileceği Mercii", "Cumhuriyet Başsavcısı ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Hazırlık soruşturmasını yapacak merciiler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Cumhurbaşkanlığı İdari İşler Başkanı\n" +
                    "TBMM Genel Sekreteri\n" +
                    "Bakan Yardımcıları\n" +
                    "Valiler\n" +
                    "Müsteşarlar\n", "*Yargıtay Cumhuriyet Başsavcısı veya Vekili yapar.\n" +
                    "*Yargıtayın ilgili ceza mahkemesi dairesine başvurur\n", Card_Ozellikleri.ALT_BOLUM));


            list.add(new Card_Ozellikleri("Kaymakamlar", "*İl Cumhuriyet Başsavcısı veya Vekili yapar.\n" +
                    "*İl ağır ceza mahkemesine başvurur.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Bunların dışında kalanlar", "*Cumhuriyet Başsavcısı tarafından yapılır.\n" +
                    "*Sulh ceza mahkemesine başvurur.\n", Card_Ozellikleri.ALT_BOLUM));


        } else if (isim.equals("21")) {

            list.add(new Card_Ozellikleri("MİLLİ EĞİTİM TEMEL KANUNU (1739)", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Türk Milli Eğitiminin Temel İlkeleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Genellik ve eşitlik", "Eğitim kurumları dil, ırk, cinsiyet, engellilik ve din ayırımı gözetilmeksizin herkese açıktır. Eğitimde hiçbir kişiye, aileye, zümreye veya sınıfa imtiyaz tanınamaz.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Ferdin ve toplumun ihtiyaçları", "Milli eğitim hizmeti, Türk vatandaşlarının istek ve kabiliyetleri ile Türk toplumunun ihtiyaçlarına göre düzenlenir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Yöneltme", "Fertler, eğitimleri süresince, ilgi, istidat ve kabiliyetleri ölçüsünde ve doğrultusunda çeşitli programlara veya okullara yöneltilerek yetiştirilirler. Bu amaçla, ortaöğretim kurumlarına, eğitim programlarının hedeflerine uygun düşecek şekilde hazırlık sınıfları konulabilir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Eğitim hakkı", "İlköğretim görmek her Türk vatandaşının hakkıdır. İlköğretim kurumlarından sonraki eğitim kurumlarından vatandaşlar ilgi, istidat ve kabiliyetleri ölçüsünde yararlanırlar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5. Fırsat ve imkân eşitliği", "Eğitimde kadın, erkek herkese fırsat ve imkân eşitliği sağlanır. Maddi imkânlardan yoksun başarılı öğrencilerin en yüksek eğitim kademelerine kadar öğrenim görmelerini sağlamak amacıyla parasız yatılılık, burs, kredi ve başka yollarla gerekli yardımlar yapılır.Özel eğitime ve korunmaya muhtaç çocukları yetiştirmek için özel tedbirler alınır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6. Süreklilik", "Fertlerin genel ve mesleki eğitimlerinin hayat boyunca devam etmesi esastır. Gençlerin eğitimi yanında, hayata ve iş alanlarına olumlu bir şekilde uymalarına yardımcı olmak üzere, yetişkinlerin sürekli eğitimini sağlamak için gerekli tedbirleri almak da bir eğitim görevidir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("7. Atatürk İnkılap ve İlkeleri ve Atatürk Milliyetçiliği", "Eğitim sistemimizin her derece ve türü ile ilgili ders programlarının hazırlanıp uygulanmasında ve her türlü eğitim faaliyetlerinde Atatürk İnkılap ve ilkeleri ve Anayasada ifadesini bulmuş olan Atatürk milliyetçiliği temel olarak alınır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("8. Demokrasi eğitimi", "Güçlü ve istikrarlı, hür ve demokratik bir toplum düzeninin gerçekleşmesi ve devamı için yurttaşların sahip olmaları gereken demokrasi bilincinin kazandırıp geliştirilmesine çalışılır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("9. Laiklik", "Türk milli eğitiminde laiklik esastır. Din kültürü ve ahlak öğretimi ilköğretim okulları ile lise ve dengi okullarda okutulan zorunlu dersler arasında yer alır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("10. Bilimsellik", "Her derece ve türdeki ders programları ve eğitim metotlarıyla ders araç ve gereçleri, bilimsel ve teknolojik esaslara ve yeniliklere, çevre ve ülke ihtiyaçlarına göre sürekli olarak geliştirilir. Eğitimde verimliliğin artırılması ve sürekli olarak gelişme ve yenileşmenin sağlanması bilimsel araştırma ve değerlendirmelere dayalı olarak yapılır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("11. Planlılık", "Milli eğitimin gelişmesi iktisadi, sosyal ve kültürel kalkınma hedeflerine uygun olarak eğitim - insangücü - istihdam ilişkileri dikkate alınmak suretiyle, sanayileşme ve tarımda modernleşmede gerekli teknolojik gelişmeyi sağlayacak mesleki ve teknik eğitime ağırlık verecek biçimde planlanır ve gerçekleştirilir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("12. Karma eğitim", "Okullarda kız ve erkek karma eğitim yapılması esastır. Ancak eğitimin türüne, imkan ve zorunluluklara göre bazı okullar yalnızca kız veya yalnızca erkek öğrencilere ayrılabilir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("13. Eğitim kampüsleri ve okul ile ailenin işbirliği", ": Okul - aile birliklerinin gelirleri her türlü vergi, resim ve harçtan muaftır. Ayni ve nakdi bağışlar kabul edebilir. Maddi katlı sağlamak için sosyal-kültürel etk.ve kampanyalar düzenleyebilirler. Okullar bünyesinde kantin-salon vb. yerleri işletebilir, işlettirebilir. Okul-aile birliklerinin kuruluş ve işleyişi harcanması ve denetlenmesine dair usul ve esaslar Millî Eğitim ve Maliye bakanlıklarınca müştereken hazırlanacak yönetmelikle düzenlenir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("14. Her yerde eğitim", "Milli eğitimin amaçları yalnız resmi ve özel eğitim kurumlarında değil, aynı zamanda evde, çevrede, işyerlerinde, her yerde ve her fırsatta gerçekleştirilmeye çalışılır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri(" Türk Eğitim Sisteminin Genel yapısı", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a) Örgün Eğitim", "Okul öncesi eğitim, ilköğretim, ortaöğretim, yükseköğretim. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b)Yaygın Eğitim", "Örgün eğitim yanında veya dışında düzenlenen eğitim faaliyetlerinin tümü. Okuma-Yazma öğretmek, eksik eğitimleri tamamlama vs.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Okul öncesi eğitimi", "* Onları ilköğretime hazırlamak \n" +
                    "* Çocukların Türkçeyi doğru ve güzel konuşmalarını sağlamak \n" +
                    "* Çocukların beden, zihin ve duygu gelişmesin ve iyi alışkanlıklar kazanmasını sağlamak \n" +
                    "* Şartları elverişsiz çevrelerden ve ailelerden gelen çocuklar için ortak bir yetişme ortamı yaratmak \n" +
                    "* Okul öncesi eğitim kurumları, bağımsız anaokulları olarak kurulabileceği gibi ilköğretim okuluna bağlı uygulama sınıfı olarak da açılabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İlköğretim", "* Mecburi ilköğretim çağı 6-14 yaş grubundaki çocukları kapsar. 72 Aylık çocuk 1’e başlar. \n" +
                    "* Bu çağ çocuğun 5 yaşını bitirdiği yılın eylül ayı sonunda başlar, 13 yaşını bitirip 14 yaşına girdiği yılın öğretim yılı sonunda biter. Yöneltme, ilköğretimde başlar. \n" +
                    "* İlköğretimin son ders yılının ikinci yarısında öğrencilere devam edebilecekleri okul ve meslek tercihi ile ilgili rehberlik servisince gerekli çalışmalar yapılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ortaöğretim", "* Bütün öğrencilere ortaöğretim seviyesinde asgari ortak bir genel kültür vermek suretiyle onlara kişi ve toplum sorunlarını tanımak. \n" +
                    "* Çözüm yolları aramak ve yurdun İktisadi sosyal ve kültürel kalkınmasına katkıda bulunmak bilincini ve gücünü kazandırmak. \n" +
                    "* Öğrencileri, çeşitli program ve okullarla ilgi, istidat ve kabiliyetleri ölçüsünde ve doğrultusunda yüksek öğretime veya hem mesleğe hem de yüksek öğretime veya hayata ve iş alanlarına hazırlamaktır. \n" +
                    "* Bu görevler yerine getirilirken öğrencilerin istekleri ve kabiliyetleri ile toplum ihtiyaçları arasında denge sağlanır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yükseköğretim Kurumları", "Üniversiteler, Fakülteler, Enstitüler, Yüksekokullar, Konservatuvarlar, Meslek Yüksekokulları, Uygulama ve Araştırma Merkezleri ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretmenlik Mesleği ", "* Öğretmenlik mesleği; adaylık döneminden sonra öğretmen, uzman öğretmen ve başöğretmen olmak üzere üç kariyer basamağına ayrılır. \n" +
                    "* Değerlendirme 100 tam puan üzerinden yapılır. \n" +
                    "% 10’unu kıdem \n" +
                    "% 10’unu etkinlikler \n" +
                    "% 10’unu sicil ( işbaşarımı ) \n" +
                    "% 20’sini eğitim \n" +
                    "% 50’sini de sınav puanı oluşturur. \n" +
                    "* Eğitim Yüksekokulu açma yetkisi, Öğretmenlik formasyonu veren ve öğretmen yetiştiren MEB’e bağlı eğitim yüksekokulları Cumhurbaşkanı kararı ile kurulabilir.\n" +
                    "* Askeri eğitim kurumlarının dereceleri ve müfredatı, Milli Savunma Bakanlığı ile birlikte tespit edilir. \n" +
                    "* Öğretmenlerin hizmet sürelerine ve/veya isteğe bağlı il içi veya il dışı yer değiştirmelerine ilişkin usul ve esaslar yönetmelikle belirlenir.\n", Card_Ozellikleri.IKILI_BASLIK));
        } else if (isim.equals("22")) {
            list.add(new Card_Ozellikleri("1 SAYILI CUMHURBAŞKANLIĞI KARARNAMESİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Teşkilat", "MEB; merkez, taşra ve yurtdışı teşkilatlarından oluşur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Hizmet Bölümleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Temel Eğitim Genel Müdürlüğü", "Okul öncesi ve ilköğretim; okul ve kurumlarının yönetimine ve öğrencilerinin eğitim ve öğretimine yönelik çalışmalar yapmak.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Ortaöğretim Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Mesleki ve Teknik Eğitim Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Din Öğretimi Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5) Özel Eğitim ve Rehberlik Hizmetleri Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6) Hayat Boyu Öğrenme Genel Müdürlüğü", "Yaygın eğitim ve öğretim ile açık öğretim hizmetlerini yürütmek.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("7) Özel Öğretim Kurumları Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("8) Yenilik Ve Eğitim Teknolojileri Genel Müdürlüğü", "Bilişim teknolojileri ve ürünlerinin kullanılmasına yönelik çalışmalar yürütmek.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("9) Öğretmen Yetiştirme ve Geliştirme Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("10) Ölçme, Değerlendirme ve Sınav Hizmetleri Genel Müdürlüğü", "Sınav koordinatörlüklerinin koordinasyonunu sağlamak.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("11) Yükseköğretim ve Yurt Dışı Eğitim Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("12) Avrupa Birliği ve Dış İlişkiler Genel Müdürlüğü", "Diğer ülkelerle işbirliğine yönelik işleri yürütmek. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("13) Personel Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("14) Hukuk Hizmetleri Genel Müdürlüğü", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("15) Destek Hizmetleri Genel Müdürlüğü", "Bakanlığın taşınır ve taşınmazlarına ilişkin işlemleri ilgili mevzuat çerçevesinde yürütmek. Genel evrak ve arşiv faaliyetlerini düzenlemek ve yürütmek Bakanlığa bağlı döner sermaye işletmeleri ile ilgili işleri yürütmek. Ders kitaplarını, kaynak ve yardımcı eğitim dokümanlarını, makine, teçhizat ve donatım ihtiyaçlarını temin etmek.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("16) Talim ve Terbiye Kurulu Başkanlığı", "Bakanlığın bilimsel danışma ve inceleme organıdır. Yardımcı kitaplar ile öğretmen kılavuz kitaplarını incelemek. Eğitim sistemini, eğitim ve öğretim plan ve programlarını, ders kitaplarını hazırlatmak, hazırlananları incelemek veya inceletmek, araştırmak, geliştirmek ve uygulamaya ilişkin görüşlerini Bakana sunmak.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("17) Teftiş Kurulu Başkanlığı", "Bakanlık Maarif Müfettişleri aracılığıyla yürütmek. Bakanlık personeline, Bakanlık okul ve kurumlarına, özel öğretim kurumlarına ve gerçek ve tüzel kişilere rehberlik etmek. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("18) Strateji Geliştirme Başkanlığı", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("19) Bilgi İşlem Dairesi Başkanlığı", "Bilgi işlem ve otomasyon ihtiyacını karşılamak. Bakanlığın internet sayfaları, elektronik imza ve elektronik belge uygulamaları ile bilişim sistemleri (MEBBİS) ve e-okul uygulamalarını yürütmek.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("20) İnşaat ve Emlak Dairesi Başkanlığı", "Bakanlığa ait arsa, bina ve tesisleri, ilgili birimlerle koordine ederek, mimari proje çalışmalarını yürütmek.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("21) Basın ve Halkla İlişkiler Müşavirliği", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("22) Özel Kalem Müdürlüğü", "Bakanın çalışma programını düzenlemek. Bakanın resmî ve özel yazışmalarını, protokol ve tören işlerini düzenlemek ve yürütmek. ", Card_Ozellikleri.ALT_BOLUM));


            list.add(new Card_Ozellikleri("Notlar", "* Bakanlık, taşra teşkilatı kurmaya yetkilidir.\n" +
                    "* Kadro; Cumhurbaşkanlığı Kararnamesi hükümlerine göre düzenlenir. \n" +
                    "* Öğretmenlerin emeklilik işlemleri; Haziran ve Temmuz ayları içinde yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));
        } else if (isim.equals("23")) {
            list.add(new Card_Ozellikleri("ÖZEL ÖĞRETİM KURUMLARI KANUNU (5580)", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("-----------------------------------------------------------------", "    Özel öğretim kurumlarına kurum açma izni verilmesi, kurumun nakli, devri, personel çalıştırması gibi esasları vardır. ( Yabancılar tarafından açılmış olanları da kapsar. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurum açma izni", "* İzin başvuruları, ilgili İl Milli Eğitim Müdürlüğüne yapılır. İzni Valilik verir. \n" +
                    "* Valilikçe açılması uygun görülen okullara ilişkin başvurular, Bakanlığa gönderilir.\n" +
                    "* Valilikçe reddedilmesi hâlinde, kurucu veya kurucu temsilcisi tarafından taleplerinin reddine ilişkin işlemin tebliğinden itibaren 15 iş günü içinde Bakanlığa itirazda bulunulabilir. \n" +
                    "* İtiraz, Bakanlıkça 15 iş günü içinde karara bağlanır. \n" +
                    "* İlkokul, ortaokul, lise ve özel eğitim kurumları için, 1 Eylül tarihinden sonra verilen açılma izinleri ertesi yıl için geçerlidir.\n" +
                    "* Kanunlara uymayan iş yerleri brüt asgari ücretin 20 katı idari para cezası uygulanır ve bu yerler valiliklerce kapatılır. \n" +
                    "* Yabancıların ortaklığı ile açılan kanuna uygun olmayan iş yerleri için de aynı işlemler uygulanır. Ortaklığın sona erdirilmesi için 30 iş günü süre verilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurucu / Kurucu Temsilcilerinin Nitelikleri ve Kurum Binaları", "*  Meyhane, kahvehane, kıraathane, bar, elektronik oyun merkezleri gibi umuma açık yerler ile açık alkollü içki satılan yerlerin, okul binalarından kapıdan kapıya en az 100 m uzaklıkta bulunması zorunludur. \n" +
                    "*  Turizmin yoğun olduğu yörelerde bulunan okulların tatil olduğu dönemlerde, yukarıda belirtilen iş yerleri ile okullar arasında 100 m uzaklık şartı aranmaz. \n" +
                    "*  Uzaklıkla ilgili esaslar İçişleri, Millî Eğitim, Sağlık, Kültür ve Turizm bakanlıklarının müştereken hazırlayacakları yönetmelikle belirlenir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Milletler Arası Özel Öğretim Kurumu", "Cumhurbaşkanının izniyle açılabilir. Kurum açma izni verilen kurumlar 2 yıl içerisinde faaliyete başlamak zorundadır.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurum Açma İzninin İptali", "2 yıl içerisinde faaliyete başlamayan veya faaliyete başladıktan sonra yönetmelikte belirtilen süreden fazla izinsiz ara veren, farklı amaçla kullanılan yerlerin çalışma ruhsatı iptal edilir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurumlarda çalıştırılacak personel", "Bir kurumun öğretime başladığı tarihten itibaren mevcut ders saati sayısının, kuruluş sırasında 1/3 ni, kuruluşundan 3 yıl sonra da en az 2/3 ini asıl görevi bu kurumlarda olan öğretmen, uzman öğretici ve usta öğreticiler tarafından okutulması zorunludur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Brüt asgari ücretin 5 katı para cezası gerektiren haller", "* Bakanlıkça onaylı yerleşim planında izinsiz değişiklik yapması. \n" +
                    "* Gerçeğe aykırı reklam ve ilan vermesi veya reklam ve ilanlarda öğrenci resim ve bilgilerini kullanması. \n" +
                    "* Haftalık ders çizelgesi ve programları Bakanlık izni olmadan kurumda uygulaması. \n" +
                    "* Bu Kanun ve bu Kanuna dayanılarak yürürlüğe konulan yönetmelik ve yönergelerde belirtilen hükümlere aykırı fiillerde bulunması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Brüt asgari ücretin 10 katı para cezası gerektiren haller", "* Mevzuatta belirtilen sayıda personel çalıştırmaması veya mevzuata aykırı personel çalıştırması. \n" +
                    "* 14/6/1973 tarihli ve 1739 sayılı Millî Eğitim Temel Kanununun genel ve özel amaçları ile temel ilkelerine uymaması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Brüt asgari ücretin 20 katı para cezası gerektiren haller", "* Kurum açma şartlarından herhangi birisini kaybetmesi. \n" +
                    "* Devir-teslimden kaçınması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Notlar", "* Okul kurucusu; Kurumu kapatacaksa en az 3  ay önce yazılı olarak bildirmek şartıyla Bakanlığa, yönetici, öğretmen, uzman öğretici, usta öğretici ve öğrenci/kursiyerlere haber vererek öğretim yılı sonunda okulunu kapatabilir. \n" +
                    "* Kapanan veya kapatılan kurum; mühürlerini, yönetici, öğretmen ve öğrencilerle ilgili bütün defterlerini, dosyalarını ve diğer evrakını ilgili valiliğe devir ve teslim etmeye mecburdur. \n" +
                    "* Belirtilen şartlara uymadan kurumunu kapatanlar ile soruşturma sonucu kurum açma izni ile işyeri açma ve çalışma ruhsatı iptal edilen kurucuya beş 5 yıl geçmeden tekrar kurum açma izni, bir kurumu devralma ya da bir kuruma ortak olma izni verilmez. \n" +
                    "* İhtiyaç halinde, resmî okullarda görevli öğretmenlere asıl görevlerini aksatmamak ve aylık karşılığı okutmakla yükümlü bulunduğu haftalık ders saati sayısını doldurmaları kaydı ile öğretmenlere haftalık ders saati sayısının yarısı kadar ücretli ders verilebilir. \n" +
                    "* Kademe ilerlemesinin durdurulması cezasını gerektiren fiillerin işlenmesi halinde bu kişilere kademe ilerlemesinin durdurulması cezası yerine brüt aylığından 1/4’ü ile 1/2’si arasında maaş kesim cezası verilebilir. \n" +
                    "* 2 defa teftiş raporuyla başarısızlığı tespit edilen yönetici, öğretmen, uzman öğretici ve usta öğreticilerin çalışma izni iptal edilir. \n" +
                    "* Öğrenim ücreti ve diğer ücretler, kurumlarca her yıl tespit edilerek OCAK ayından itibaren en geç MAYIS ayında ilân edilir. \n" +
                    "* Kurumlar, öğrenim gören öğrenci sayısının % 3 ’ünden az olmamak üzere ücretsiz öğrenci okutmakla yükümlüdür. Bakanlıkça bu oran % 10 a kadar artırılabilir. \n" +
                    "* Bir okula alınabilecek yabancı uyruklu öğrenci sayısı, o okulda okuyan Türkiye Cumhuriyeti uyruklu öğrenci sayısının %30’ unu aşamaz. \n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("24")) {
            list.add(new Card_Ozellikleri("DİLEKÇE HAKKININ KULLANILMASINA DAİR KANUN (3071)", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Amacı", "Türk vatandaşlarının ve Türkiye’ de ikamet eden yabancıların kendileriyle veya kamu ile ilgili dilek ve şikayetleri hakkında, TBMM ve yetkili makamlara yazı ile başvurma haklarının kullanılma biçimini düzenlemektir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Dilekçede bulunması zorunlu şartlar", "Adı-soyadı, imzası, iş veya ikametgah adresi.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İncelenemeyecek dilekçeler", "Belli bir konuyu ihtiva etmeyenler, yargı mercilerinin görevine giren konularla ilgili olanlar, dilekçede bulunması zorunlu şartlardan herhangi birini taşımayanlar.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Diğer Hususlar", "* Türkiye’de ikamet eden yabancılar karşılıklılık esası gözetilmek ve dilekçelerin Türkçe yazılması kaydıyla bu haktan yararlanabilirler. \n" +
                    "* Türk vatandaşlarının ve Türkiye’de ikamet eden yabancıların kendileri ve kamu ile ilgili dilek ve şikâyetleri konusunda yetkili makamlara yaptıkları başvuruların sonucu veya yapılmakta olan işlemin safahatı hakkında dilekçe sahiplerine en geç 30 gün içinde gerekçeli olarak cevap verilir. \n" +
                    "* TBMM’ye gönderilen dilekçelerin, Dilekçe Komisyonunda incelenmesi ve karara bağlanması 60 gün içinde sonuçlandırılır. \n" +
                    "* İlgili kamu kurum veya kuruluşları TBMM Dilekçe Komisyonunca gönderilen dilekçeleri 30 gün içinde cevaplandırır. \n" +
                    "* TBMM’ye yapılan başvuruları İnceleme ve karara bağlamanın esas ve usulleri Türkiye Büyük Millet Meclisi İçtüzüğünde gösterilir. \n" +
                    "* Bu Kanun hükümlerini TBMM Başkanı ile Bakanlar Kurulu yürütür. \n", Card_Ozellikleri.IKILI_BASLIK));
        } else if (isim.equals("25")) {

            list.add(new Card_Ozellikleri("BİLGİ EDİNME HAKKI KANUNU (4982)", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Amaç", "Demokratik ve şeffaf yönetimin gereği olan eşitlik, tarafsızlık ve açıklık ilkelerine uygun olarak kişilerin bilgi edinme hakkını kullanmalarına ilişkin esas ve usulleri düzenlemektir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kapsam", "Bu kanun; kamu kurum ve kuruluşları ile kamu kurumu niteliğindeki meslek kuruluşlarının faaliyetlerinde uygulanır.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Başvuru sahibi; ", "Gerçek kişi ise: Gerekli belgeler; başvuru sahibinin adı-soyadı, imzası, ev veya iş adresi. \n" +
                    "Tüzel kişi ise: Gerekli belgeler; tüzel kişinin unvanı ve adresi, yetkili kişinin imzası, yetki belgesi. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İstenecek bilgi veya belgenin niteliği", "* Kurum ve kuruluşlar, ayrı veya özel bir çalışma, araştırma, inceleme ya da analiz neticesinde oluşturulabilecek türden bir bilgi veya belge için yapılacak başvurulara olumsuz cevap verebilirler.\n" +
                    "* İstenen bilgi veya belge, başvurulan kurum ve kuruluştan başka bir yerde bulunuyorsa, başvuru dilekçesi bu kurum ve kuruluşa gönderilir ve durum ilgiliye yazılı olarak bildirilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yayımlanmış veya kamuya açıklanmış bilgi veya belgeler", "* Kurum ve kuruluşlarca yayımlanmış veya yayın, broşür, ilân ve benzeri yollarla kamuya açıklanmış bilgi veya belgeler, bilgi edinme başvurularına konu olamaz.\n" +
                    "* Ancak, yayımlanmış veya kamuya açıklanmış bilgi veya belgelerin ne şekilde, ne zaman ve nerede yayımlandığı veya açıklandığı başvurana bildirir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bilgi veya belgeye erişim", "* Kurum ve kuruluşlar, başvuru sahibine istenen belgenin onaylı bir kopyasını verirler.\n" +
                    "* Bilgi veya belgenin niteliği gereği kopyasının verilmesinin mümkün olmadığı veya kopya çıkarılmasının aslına zarar vereceği hallerde, kurum ve kuruluşlar ilgilinin yazılı veya basılı bilgiler için;  söz konusu belgenin aslını incelemesi ve not alabilmesini, ses kaydı şeklindeki bilgi veya belgelerde dinleyebilmesini, görüntü kaydı şeklindeki bilgi veya belgelerde izleyebilmesini sağlarlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bilgi ve Belgeye Erişim Süreleri: Kurum ve Kuruluşlar", "* Başvuru üzerine istenen bilgi veya belgeye erişimi 15 iş günü içinde sağlarlar.\n" +
                    "* Başvuru içeriğinin birden fazla kurum ve kuruluşu ilgilendirmesi, durumlarında bilgi veya belgeye erişim 30 iş günü içinde sağlanır.\n" +
                    "* İstenen belge erişim maliyeti, başvuru sahibine bildirilmesiyle 15 gün içinde ödenmesi gerekir. Ödenmezse erişim talebinden vazgeçmiş sayılır\n.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Başvuruların cevaplandırılması", "Yazılı olarak veya elektronik ortamda başvuru sahibine bildirirler.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İtiraz Usulü", "Yargı yoluna başvurmadan önce kararın tebliğinde itibaren 15 gün içinde Kurula itiraz edebilir. Kurul kararını 30 iş günü içinde verir. Kurulun istediği her türlü bilgi ve belge 15 gün içinde verilmek zorundadır.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bilgi Edinme Kurulu", "* 9 üyeden oluşur.\n" +
                    "* Cumhurbaşkanı seçer.\n" +
                    "* Üyelerin görev süreleri 4 yıldır.\n" +
                    "* Kurul başkanı, kurul üyelerince kendi aralarından seçilir.\n" +
                    "* Kurul ayda en az 1 defa toplanır,ihtiyaç halinde başkanın çağrısıyla toplanır.\n" +
                    "* Görev süreleri sona erenler yeniden seçilebilir.\n" +
                    "* Yeni seçilen kurul göreve başlayıncaya kadar önceki Kurul görevine devam eder.\n" +
                    "* Kurulun sekretarya hizmetini Adalet Bakanlığı yapar.\n" +
                    "* Kurulun görev ve çalışma esasları Cumhurbaşkanlığınca hazırlanacak yönetmelikle düzenlenir.\n" +
                    "* Belgeleri Şubat ayının sonuna kadar Bilgi Edinme Değerlendirme Kuruluna gönderirler.\n" +
                    "* Kurul hazırlayacağı genel raporu her yıl Nisan ayı sonuna kadar T.B.M.M.’e gönderirler.\n" +
                    "* Bu raporları takip eden 2 ay içinde T.B.M.M. kamuoyuna açıklar.\n" +
                    "* Kamunun yayımını takip eden 6 ay içinde Cumhurbaşkanlığı tarafından hazırlanarak yürürlüğe konulur.\n" +
                    "* Bu kanun hükümlerini Cumhurbaşkanı yürütür.\n" +
                    "* Bilgi Edinme ve Değerlendirme Kurulu üyelerinin bir ayda fiilen görev yapan gün sayısı 4 ü aşması halinde , aşan günler için huzur hakkı ödenmez.\n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("26")) {
            list.add(new Card_Ozellikleri("İLKÖĞRETİM VE EĞİTİM KANUNU (222)", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("-----------------------------------------------------------------", "* Mecburi ilköğretim çağı 6-14 yaş grubundaki çocukları kapsar.\n" +
                    "* İlkokulların birinci sınıflarına o yılın 31 Aralık tarihinde 72 ayını dolduran çocukların kaydı yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Mecburi olanlar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("İlköğretim okulları ", "(gündüzlü, pansiyonlu, yatılı, gezici  okulları)", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri(" Özel eğitime muhtaç çocuklar için kurulacak okullar ve sınıflar", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri(" Yetiştirici ve tamamlayıcı sınıflar ve kurslar", "Mecburi ilköğrenim çağında bulundukları halde, öğrenimlerini yaşıtlarıyla birlikte zamanında yapmamış olan çocuklara kısa yoldan ilköğrenim vermek ve ayrıca yetişmelerine lüzum görülen çocukları ilköğretim okuluna hazırlamak amacıyla açılır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("İsteğe bağlı olanlar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Okul öncesi eğitim kurumları", "", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri(" Tamamlayıcı sınıflar ve kurslar İlköğretim", "İlköğrenim çağı dışına çıkmış olup da üst dereceli öğrenim kurumlarına gidememiş olan yurtdaşlardan genel bilgilerini artırmak ve kendilerinin daha iyi bir iş ve üretim unsuru olarak yetiştirilmeleri amacıyla öğretim yapılır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Notlar", "* Bir öğretim yılı, okulda, derslerin başlamasından bir hafta önceki tarihten, son sınıf sınavlarının bittiği güne kadarki süredir.\n" +
                    "* Mecburi öğrenim çağını bitirdiği öğretim yılı sonuna kadar ilköğretim okulunu bitiremeyen çocukların ilköğrenimlerini tamamlamak üzere en çok 2 öğretim yılı daha okula devamlarına izin verilir.Bu iki yıllık uzatma sonunda da okulu bitiremiyen çocuklara tasdikname verilerek, kayıtları silinir.\n" +
                    "* Her yıl derslere başlamadan en az 15 gün önce, muhtarlar okul müdürüyle iş birliği yaparak köy ve mahallelerindeki mecburi öğrenim çağında bulunan çocukların künyelerini gösterir 3 nüsha çizelge hazırlayıp birer nüshasını okul idarecilerine ve ilçe eğitim müdürlüğüne verir. Diğer nüshasını da yanlarında saklarlar.\n" +
                    "* Nüfus cüzdanı bulunmıyan veya henüz nüfus kaydı yaptırılmamış çocukların yaşları, çocuklar görülmek suretiyle, ihtiyar kurullarınca tespit edilir.\n" +
                    "* Birleştirilmiş sınıflar da dahil olmak üzere bir öğretmene düşen öğrenci sayısı 40 dan fazla olamaz.\n" +
                    "* Her yıl Eylül ayının üçüncü haftası ‘’ İlköğretim haftası’’ dır.\n" +
                    "* Öğrenci velisi, okula gidemeyen çocuğun durumunu en geç 3 gün içinde okul idarecilerine bildirmekle yükümlüdür. \n" +
                    "* Zorlayıcı sebepler dışında, öğrencilere 15 günü geçmemek üzere izin verilir.\n" +
                    "* Muhtarlar 3 gün içinde veliye durumu bildirir. Muhtar ve amirlerin ihtarına tebliğine rağmen çocuğu okula yollamayanlara her gün için 15 TL para cezası verilir. Buna rağmen hala yollamazsa 500 TL ceza verilir.\n" +
                    "* Okul idaresi ve mülki amirlerin sorduğu sorulara cevap vermeyenlere 100 TL idarî para cezası verilir.\n" +
                    "* İlköğretim çağında ki hiçbir öğrenci ücretli ücretsiz çalıştırılamaz.Yoğunlaştırılmış telafi programı normal ders saatinin 3/2 inden az olamaz.İlköğretim çağında olan öğrencilerin özel kurs ve dershane kaydı yasaktır. İlköğretim ve Eğitim Kanunu’nun hükümlerine aykırı davrananlara 400 TL den 1000 TL ye kadar ceza verilir.\n" +
                    "* Bu kanunda yazılı idarî para cezaları ‘’ Mahalli Mülki Amiri ‘’ tarafından verilir.\n" +
                    "* Okula gelir sağlamak amacıyla seçilen topraklar 50 dekardan fazla olamaz.\n" +
                    "* Her köy okulunun bitişinde veya yakınında 2 dekar ile 10 dekar arası uygulama bahçesi olmalıdır.\n" +
                    "* Köy okullarına bitişik öğretmen lojmanlarıyla müstakil öğretmen lojmanlarının dolayında her ev için 500 ile 1000 m2 lik bir arazi, öğretmen bahçesi olmak üzere okul arsasından veya uygulama bahçesinden yahut okula gelir sağlayacak araziden ayrılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İlde İlköğretim Görevlileri", "ilköğretim kurumlarında aşağıdaki görevliler bulunur:\n" +
                    "1) Müdür ve müdür yardımcıları,\n" +
                    "2) Öğretmenler; sınıf, branş, okul öncesi eğitim, özel eğitim öğretmenleri ile gezici öğretmenler ve usta öğreticiler,\n" +
                    "3) Rehberlik uzmanları,\n" +
                    "4) Sağlık, teknik, genel idare ve yardımcı hizmetler sınıflarına dahil personel ile eğitim faaliyetlerinin gerektirdiği diğer personel.\n" +
                    "* İlköğretim kurumlarının açılma, kapanma ve öğretime ara verme zamanları Milli Eğitim Bakanlığınca çıkarılacak yönetmelikle düzenlenir.\n" +
                    "* İlköğretim okulların yaz tatili, sınavların bitimi tarihinden yeni öğretim yılının başına kadar sürer.\n" +
                    "* Öğretmenler, yaz tatili içinde aralıksız iki ay izinlidirler.\n" +
                    "* Tek öğretmenli okullarda görevli öğretmenlerin yaz tatili izinleri, bölge ilköğretim müfettişleriyle, İlçe eğitim müdürü tarafından okul ve kurumların korunması da gözönünde tutularak ayarlanır.\n" +
                    "* Öğretmenler kanunlarla veya Cumhurbaşkanlığı kararnameleriyle kendilerine verilen işlerden başka, meslek dışı herhangi bir görevle yükümlü tutulamazlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İlköğretime ait bazı gelir kaynakları ", "* Her yıl devlet gelirinden %3 ünden az olmamak üzere Devlet bütçesinden yapılacak yardımlar.\n" +
                    "* Özel idare bütçelerine, bu hükümler gereğince sağlanacak gelirler hariç ve 1960 mali yılında ilköğretime tahsis edilen miktardan az olmamak üzere, yıllık gelirlerinin en az % 20 si oranında konulacak ödenekler.\n" +
                    "* Köy okullarına gelir sağlamak üzere, tahsis edilen araziden ve okul uygulama bahçesinden elde edilen gelirler hariç köy bütçelerine her yıl genel gelirlerinin en az % 10 u oranında konulacak ödenekler.\n", Card_Ozellikleri.IKILI_BASLIK));
        } else if (isim.equals("27")) {

            list.add(new Card_Ozellikleri("MİLLî EĞİTİM BAKANLIĞI REHBERLİK HİZMETLERİ YÖNETMELİĞİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Tanımlar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Bölüm", "Rehberlik ve araştırma merkezindeki özel eğitim hizmetleri bölümünü ve rehberlik hizmetleri bölümünü ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Çocuk Gelişimi ve Eğitimcisi", "Üniversitelerin çocuk gelişimi veya çocuk sağlığı ve eğitimi alanlarında lisans eğitimi almış rehberlik ve araştırma merkezlerinde öğrencilere, ailelere ve öğretmenlere çocukların her türlü gelişim durumlarına ilişkin sorunların çözümünde gerekli önlemlerin alınmasında ve gelişimlerinin izlenmesinde yardım sağlayan personeli ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Danışan Dosyası", "Özel ve gizlilik içeren; bireyin ve öğrenci ise velisinin izni olmadan ( mevzuat ile yetkili kılınan makamlar hariç ) paylaşılmayan bilgilerin kaydedildiği dosyayı ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Danışmanlık Tedbiri", "Çocuklara eğitim ve gelişimleri ile igili sorunlarının çözümünde yol göstermeye yönelik rehberlik tedbirlerini ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Eğitim Programcısı", "Üniversitelerin eğitimde program geliştirme alanında lisans eğitimi almış RAM’da rehberlik ve psikolojik danışma hizmetleri alanlarında gereksinim duyulan programların geliştirilmesinde gerekli teknik hizmetleri veren personeli ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ergoterapist", "Üniversitelerin ergoterapi alanında lisans eğitimi almış, RAM’da bireylerin günlük yaşam aktivitelerine katılımlarını geliştirmek amacıyla hizmet sunan personeli ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Fizyoterapist", "Üniversitelerin fizyoterapi ve rehabilitasyon alanında lisans eğitimi almış, RAM’da bireylerin yetersizliklerinden kaynaklı ağrıyı, özrü ve yeteneklerini özel ölçme-değerlendirme ve inceleme yöntemleri ile belirleyerek hekimin tanısına göre, fizyoterapi ve rehabilitasyon programını planlayan, uygulayan ve tekrar değerlendirerek rapor eden personel ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Psikolog", "Üniversitelerin psikoloji alanında lisans eğitimi almış RAM’da atipik ve uyum güçlüğü olan çocuklara tanılama ve terapi hizmetleri veren personel ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Psikolojik Danışma", "Bireylere kendini tanıma, karar verme ve problem çözme becerisi kazandıran, bireylerin kişisel ve toplumsal uyumlarını gerçekleştirmelerini amaçlayan bireyle veya grupla yürütülen süreci ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Psikometrist", "Psikolojik ölçme araçları konusunda lisans veya lisansüstü eğitim almış RAM’da tarama, inceleme, tespit, teşhis ve benzeri amaçlarla kullanılacak psikolojik ölçme araçlarını uygulamayı bilen ve gerekli olanları geliştiren personeli ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Rehberlik Öğretmeni", "Eğitim kurumlarındaki rehberlik servisleri ile rehberlik ve araştırma merkezlerinde rehberlik hizmetlerini yürüten personeli ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Sosyal Çalışmacı", "Üniversitelerin sosyal hizmet alanında lisans eğitimi almış RAM’da danışanlarla ilgili olarak verilecek hizmetlerin planlanması için gerekli sosyal, ekonomik ve kültürel bilgileri toplayan, değerlendiren ve hizmetlerin verilmesinde sosyal hizmet kurumları arasında eşgüdümü sağlayan personeli ifade eder. Konferans, gezi, seminer, grup toplantısı gibi sosyal etkinlikler organize eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Rehberlik Hizmetlerinin İlkeleri", "Rehberlik hizmetlerinin planlanması ve yürütülmesinde;\n" +
                    "a) Bireye ve bireysel farklılıklara saygı,\n" +
                    "b) Bilimsellik,\n" +
                    "c) Gizlilik,\n" +
                    "ç) Gelişimsel bir anlayışla önleyici ve koruyucu yaklaşım,\n" +
                    "d) Bireysel, kurumsal ve toplumsal özellikler ile ihtiyaçların göz önünde bulundurulması,\n" +
                    "e) Hayat boyu rehberlik anlayışıyla bireylerin yaş, gelişimsel özellikleri ve öğretim kademelerinin dikkate alınması,\n" +
                    "f) Mesleki ve etik değerlere uyulması,\n" +
                    "g) İlgili tarafların işbirliği ve eşgüdümü, \n" +
                    "esastır.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Alanlarına göre rehberlik hizmetleri", "Eğitsel rehberlik, Mesleki rehberlik ve Kişisel/Sosyal rehberlik", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Birey sayısına göre rehberlik hizmetleri", "Bireysel rehberlik ve Grup rehberliği", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretim kademelerine göre rehberlik hizmetleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a) Okul öncesi dönemde rehberlik hizmetleri", "Çocuğun sosyalleşmesine, ilkokula hazır olması için uyum çalışmalarına, sosyal beceriler kazanmasına ve aile rehberliğine yönelik olarak eğitsel, mesleki ve kişisel/sosyal rehberlik hizmetleri kapsamında yürütülür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b) İlkokul kademesinde rehberlik hizmetleri", "Öğrencinin okula uyum sağlamasına, öğrenmeyi öğrenme ve öğrendiklerini aktarmaya yönelik bilişsel becerileri kazanmasına; etkili öğrenmeye yönelik stratejiler geliştirme, duyguları tanıma, kendini ifade etme gibi sosyal beceriler ile zorlu yaşam olaylarıyla baş etme becerileri kazanmasına; kişilik gelişimini ve mesleki gelişimlerini desteklemeye yönelik olarak eğitsel, mesleki ve kişisel/sosyal rehberlik hizmetleri kapsamında yürütülür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("c) Ortaokul kademesinde rehberlik hizmetleri", "Öğrencinin ilgi, yetenek ve kişilik özellikleri doğrultusunda seçmeli derslere, eğitsel ve sosyal kulüplere yönelmesine ve hobi edinmesine; güçlü ve zayıf yönlerini tanımasına ve geliştirilmesi gereken yönlerini fark etmesine; gelişim dönemi özelliklerini tanımasına ve uyum sağlamasına yönelik olarak eğitsel, mesleki ve kişisel/sosyal rehberlik hizmetleri kapsamında yürütülür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("ç) Ortaöğretim kademesinde rehberlik hizmetleri", "Öğrencinin bireysel özelliklerini değerlendirip sağlıklı bir kimlik oluşturarak yetişkinlik yaşamına hazırlanmasına; kendi değerleri ile toplumsal değerler arasında bağ kurabilmesine; yükseköğretim kurumlarına devam etmeye istekli olmasına ve kendisine uygun bir alana yönelmesine, iş yaşamına hazırlanmasına ve meslek edinmesine yönelik olarak eğitsel, mesleki ve kişisel/sosyal rehberlik hizmetleri kapsamında yürütülür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("d) Yaygın eğitimde rehberlik hizmetleri", "Bireyin gelişim dönemi özellikleri, ihtiyaçları, beklentileri, çevre koşulları, sosyoekonomik ve kültürel özellikleri dikkate alınarak hayat boyu öğrenmeyi destekleyen, meslek öncesi eğitim, iş yaşamına hazırlık, yeni bir meslek edinme, aktarılabilir becerilerin iş ve meslek yaşamındaki önemine yönelik olarak eğitsel, mesleki ve kişisel/sosyal rehberlik hizmetleri kapsamında yürütülür.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Bireyi Tanıma", "Bireyin kendi ilgi, yetenek, değer, tutum ve kişilik özelliklerini keşfetmesi ve gerçekçi kararlar almasını sağlamak amacıyla rehberlik öğretmeni, sınıf rehber öğretmeni ve diğer öğretmenler tarafından yürütülen bilgi toplama sürecidir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Psikososyal koruma, önleme ve krize müdahale hizmetleri", "* Psikososyal koruma, önleme ve krize müdahale hizmetleri kapsamında il ve ilçe milli eğitim müdürlükleri ile eğitim kurumlarında psikososyal koruma, önleme ve krize müdahale ekipleri kurulur.\n" +
                    "Bu ekipler:\n" +
                    "* İl milli eğitim müdürlüklerinde; özel eğitim ve rehberlik hizmetlerinden sorumlu müdür yardımcısı veya şube müdürünün başkanlığında, en az bir ve en fazla üç rehberlik ve araştırma merkezi müdürü, en az bir ve en fazla üç rehberlik hizmetleri bölüm başkanı ile en az bir ve en fazla beş rehberlik öğretmeninden oluşur.\n" +
                    "* İlçe milli eğitim müdürlüklerinde; özel eğitim ve rehberlik hizmetlerinden sorumlu şube müdürü başkanlığında varsa rehberlik ve araştırma merkezi müdürü ve rehberlik hizmetleri bölüm başkanı ile her eğitim kademesinden en az birer rehberlik öğretmeninden oluşur.\n" +
                    "* Eğitim kurumlarında; eğitim kurumu müdürü veya eğitim kurumu müdürü tarafından görevlendirilmiş bir müdür yardımcısı başkanlığında, varsa rehberlik öğretmenleri ile rehberlik hizmetleri yürütme komisyonu üyesi her sınıf düzeyinden en az bir sınıf rehber öğretmeninden oluşur.\n" +
                    "* Yürütülen faaliyetler Bakanlıkça düzenlenir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Aile rehberliği", "Rehber Öğretmen ve en az 2 komisyon üyesi ile yapılır. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik hizmetleri il danışma komisyonun kuruluşu", "* Komisyon, Eylül ve Haziran aylarında olmak üzere yılda en az iki kez toplanır.\n" +
                    "* Bu komisyonun sekretarya hizmetleri il milli eğitim müdürlüğündeki özel eğitim ve rehberlik hizmetleri birimi tarafından yürütülür.\n" +
                    "* Rehberlik hizmetleri il danışma komisyonu, il milli eğitim müdürü veya il milli eğitim müdür yardımcısının veya şube müdürünün başkanlığından oluşur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik hizmetleri il danışma komisyonunun Görevleri", "1) Eylül ayında yapılacak toplantıda, il ve ilçelerde gerçekleştirilmesi düşünülen rehberlik hizmetlerine ilişkin ihtiyaçları belirler, değerlendirir ve gerekli tedbirlerin alınmasına yönelik karar alır.\n" +
                    "2) Haziran ayında yapılacak olan toplantıda il ve ilçelerde yapılan rehberlik çalışmalarının sonuçlarını değerlendirir.\n" +
                    "3) Haziran ve Eylül aylarında yapılacak her iki toplantıda alınan kararların toplantıların yapıldığı ay içerisinde il milli eğitim müdürlüğünce Bakanlığa gönderilmesini sağlar.\n" +
                    "4) Rehberlik öğretmeni olmayan eğitim kurumlarında rehberlik hizmetlerinin yürütülmesi için alınacak tedbirleri karara bağlar.\n" +
                    "5) Açılmasına ihtiyaç duyulan rehberlik ve araştırma merkezleri ile ilgili değerlendirmede bulunur ve alınan kararlar doğrultusunda Bakanlığa gönderilmek üzere il milli eğitim müdürlüğüne teklifte bulunur.\n" +
                    "6) Rehberlik ve araştırma merkezlerinin çalışma bölgelerini kapasitelerine göre her yıl değerlendirir. Rehberlik ve araştırma merkezlerinde düzenlemeye ihtiyaç duyulacak hususlarda Bakanlığa gönderilmek üzere il milli eğitim müdürlüğüne teklifte bulunur.\n" +
                    "7) Yıl içerisinde ilin ihtiyacına yönelik düzenlenecek rehberlik hizmetlerine ilişkin mahalli hizmet içi eğitim ihtiyaçlarını belirler ve teklifi il milli eğitim müdürlüğüne gönderir.\n" +
                    "8) Eğitim kurumlarının talepleri ve ihtiyaçları doğrultusunda aile, öğrenci, öğretmen, idareciler ve diğer kamu personeline yönelik rehberlik hizmetlerine ilişkin düzenleyebileceği eğitim etkinlikleri ile ilgili teklifte bulunur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik ve araştırma merkezlerinin bölümleri", " İl veya ilçelerdeki rehberlik hizmetleri ile özel eğitim hizmetlerinin planlanması, koordineli bir şekilde yürütülmesi, sunulan hizmetlerin izlenmesi ve değerlendirilmesinin sağlanması amacıyla faaliyet yürüten rehberlik ve araştırma merkezleri; rehberlik hizmetleri bölümü ile özel eğitim hizmetleri bölümünden oluşur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik hizmetleri bölümü ve görevleri", "1) Her tür ve kademedeki en az birer rehberlik öğretmeninden oluşturulan komisyon tarafından il danışma komisyonu kararları göz önünde bulundurularak eğitim kurumlarının özellik, kademe ve türlerine göre yıllık çerçeve planı hazırlanır. Ders yılı başlamadan önce eğitim kurumlarına ulaştırılır.\n" +
                    "2) Rehberlik ve araştırma merkezinin sorumluluk bölgesinde bulunan rehberlik öğretmenleri ile dönem başlarında ve yılsonunda olmak üzere en az üç defa toplantı düzenlenir. Değerlendirme raporu hazırlanır ve sonuçları izlenir.\n" +
                    "3) Eğitim kurumlarından gönderilen yıllık çalışma programı ile çalışma raporları incelenir, değerlendirilir ve sonuçları raporlaştırılarak rehberlik ve araştırma merkezi müdürüne iletilir.\n" +
                    "4) Rehberlik hizmetlerinden yararlanmak üzere rehberlik ve araştırma merkezine başvuran ya da yönlendirilen bireylere randevu verilir. Danışan dosyası açılır ve gerekli psikolojik yardım hizmeti verilir.\n" +
                    "5) Çalışmalarda kullanılan psikolojik ölçme araçları, danışan dosyaları ve diğer kayıtların güvenliği ve gizliliği sağlanır.\n" +
                    "6) Eğitsel, mesleki ve kişisel/sosyal alanlarda grup rehberlik etkinliklerine yönelik programlar hazırlanır.\n" +
                    "7) Hizmetin niteliğine ve bireyin ihtiyaçlarına göre psikolojik ölçme araçları, bilimsel standartlara ve etik ilkelere göre uygulanır.\n" +
                    "8) Bireye ihtiyacı doğrultusunda rehberlik hizmetleri verilir.\n" +
                    "9) Bireysel veya grupla psikolojik danışma hizmeti rehberlik öğretmenleri tarafından verilir.\n" +
                    "10) Danışanlar ihtiyaçları doğrultusunda gerektiğinde ilgili kurum ve kuruluşlara yönlendirilir.\n" +
                    "11) Öğretmenlere, ailelere ve bireylere bölüm hizmetleri ile ilgili eğitim etkinlikleri düzenlenir.\n" +
                    "12) Bölümün hizmetleriyle ilgili bilimsel gelişmeler izlenir, uygulamalardan yararlanılır. Gerektiğinde üniversiteler ve ilgili kuruluşlarla iş birliği yapılır.\n" +
                    "13) Eğitim kurumlarındaki rehberlik servisleri ziyaret edilerek rehberlik öğretmenlerine ve eğitim kurumu idaresine yönelik rehberlik hizmeti verilir. Rehberlik öğretmeni olmayan okullara yönelik gerekli çalışmalar planlanarak uygulanır.\n" +
                    "14) Hizmetlerde kullanılacak psikolojik ölçme araçları ile diğer araç ve tekniklerin tespiti, temini, geliştirilmesi ve rehberlik servislerine dağıtımı için yapılabilecek çalışmalar planlanır ve yürütülür.\n" +
                    "15) Bireylere, ailelere, öğretmenlere ve eğitim kurumlarına yönelik rehberlik hizmetlerine ilişkin yayınlar oluşturulur ve eğitim kurumlarına ulaştırılır.\n" +
                    "16) Rehberlik öğretmenlerine mesleki gelişimi destekleme kapsamında müşavirlik hizmeti verilir.\n" +
                    "17) Eğitim kurumlarında görevli rehberlik öğretmenlerine bilgi ve beceri artırıcı eğitim etkinlikleri düzenlenir. Gerektiğinde ilgili kuruluşlardan uzman desteği alınır.\n" +
                    "18) Görevlendirildiği takdirde hakkında danışmanlık tedbir kararı verilen öğrenciye ilgili mevzuat doğrultusunda ihtiyaç duyulan hizmeti sunar.\n" +
                    "19) Görevlendirildiği takdirde bölüm personeli tercih dönemlerinde tercih danışmanlığı yapmak üzere görev alır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Özel eğitim hizmetleri bölümü ve görevleri", "1) Özel eğitim ihtiyacı olan bireylerin tanılanması amacıyla tarama faaliyetleri planlanır.\n" +
                    "2) Eğitsel değerlendirme ve tanılama hizmetlerinden yararlanmak üzere rehberlik ve araştırma merkezine başvuran ya da yönlendirilen bireylere; randevu verilir, dosya açılır ve gerekli hizmetler sunulur.\n" +
                    "3) Eğitsel değerlendirme ve tanılama hizmetlerinden yararlanmak üzere rehberlik ve araştırma merkezine başvuran bireylere ilişkin düzenlenen rapor ve bilgilerin gizliliği sağlanır.\n" +
                    "4) Ailelerin ihtiyaçları doğrultusunda, rehberlik hizmetleri bölümü ile iş birliği yapılarak aile eğitim programları düzenlenir, sonuçları izlenir ve değerlendirilir.\n" +
                    "5) Eğitim kurumlarında veli, idareci ve öğretmenlere, özel eğitim hizmetleri konusunda gerekli destek sunulur. Gerektiğinde bu hizmetlerin sunumunda, üniversite ve ilgili kuruluşlarla iş birliği yapılır.\n" +
                    "6) Çalışma bölgesindeki eğitim kurumlarında açılmış olan özel eğitim sınıflarında ve destek eğitim odalarında yapılan çalışmaları izlemek için il ve ilçe özel eğitim hizmetleri kurulu ile gerekli çalışmalar yapılır.\n" +
                    "7) Okul öncesi dönemde bulunan özel eğitim ihtiyacı olan öğrencilerin öğretmenlerine ve velilerine yönelik eğitim etkinlikleri düzenlenir.\n" +
                    "8) Okul öncesi dönemde bulunan özel eğitim ihtiyacı olan öğrencilerin okula uyum süreci takip edilir.\n" +
                    "9) Özel eğitim ihtiyacı olan öğrencilerin gelişimi öğrencinin devam ettiği eğitim kurumunun rehberlik servisi ile iş birliği yapılarak takip edilir.\n" +
                    "10) Hizmetlerde kullanılacak psikolojik ölçme araçları ile diğer araç ve tekniklerin tespiti, temini, geliştirilmesi ve rehberlik servislerine dağıtımı için yapılabilecek çalışmalar planlanır ve yürütülür.\n" +
                    "11) Özel eğitim ihtiyacı olan bireylere, ailelere, öğretmenlere ve eğitim kurumlarına yönelik özel eğitim hizmetlerine ilişkin yayınlar oluşturulur ve eğitim kurumlarına ulaştırılır.\n" +
                    "12) Bölümün hizmetleriyle ilgili bilimsel gelişmeler izlenir, uygulamalardan yararlanılır. Gerektiğinde üniversiteler ve ilgili kuruluşlarla iş birliği yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik ve araştırma merkezi müdürünün görevleri", "1) Rehberlik ve araştırma merkezindeki müdür yardımcıları arasında iş bölümü yapar.\n" +
                    "2) Rehberlik ve araştırma merkezinin bölümlerine, bölüm hizmetlerine uygun ve deneyimli bir personeli bölüm başkanı olarak görevlendirir.\n" +
                    "3) Rehberlik ve araştırma merkezi personelinin, merkezin bölümlerinde uygun şekilde görevlendirilmesini ve iş bölümünü ilgili bölüm başkanının görüşünü de alarak yapar.\n" +
                    "4) Bölümlerin çalışmalarını izler; hazırladıkları program, rapor ve projelerini inceleyerek onaylar ve sonuçları değerlendirir.\n" +
                    "5) Rehberlik ve araştırma merkezi çalışmalarında kullanılan psikolojik ölçme araçlarının, danışan dosyalarının ve diğer kayıtların güvenliğini, gizliliğini ve standartlarına uygun kullanılmasını sağlar.\n" +
                    "6) Bölümler arası çalışmaları koordine eder.\n" +
                    "7) Rehberlik ve araştırma merkezinin yılsonu çalışma raporunun elektronik ortama aktarılmasını ve yeni eğitim yılı çalışma programlarının hazırlanmasını sağlar.\n" +
                    "8) Merkez komisyonuna başkanlık eder. Alınan kararlara göre gerekli çalışmaları yürütür.\n" +
                    "9) Rehberlik ve araştırma merkezinin hizmetleriyle ilgili yeni gelişmeleri izler ve gerekli çalışmaları yapar.\n" +
                    "10) Rehberlik ve araştırma merkezi hizmetlerinin işbirliği içerisinde yürütülebilmesi için gerekli önlemleri alır.\n" +
                    "11) Rehberlik ve araştırma merkezinin çalışma bölgesinde bulunan eğitim kurumlarındaki rehberlik hizmetlerinin planlanmasını, uygulanmasını ve değerlendirilmesini sağlar.\n" +
                    "12) Rehberlik ve araştırma merkezinin personel, özlük, bütçe, ayniyat, demirbaş işleri ve hizmetlerin gerektirdiği araç ve gereçlerin sağlanması için çalışmalar yapar.\n" +
                    "13) Rehberlik hizmetleri il danışma komisyonu toplantılarına katılır.\n" +
                    "14) Özel eğitim hizmetleri ile rehberlik hizmetlerinin yürütülmesinde il veya ilçedeki ilgili kurum ve kuruluşlarla iş birliği yapar.\n" +
                    "15) Rehberlik ve araştırma merkezinin bölümlerinin tarama, tanılama ve danışanlarla ilgili uygulamalarında gerekli sağlık hizmetleri için görev bölgesinde bu hizmetleri veren veya verebilecek olan birimlerle iş birliği yapar.\n" +
                    "16) Rehberlik ve araştırma merkezinin görevlerine ilişkin konularda il veya ilçede seminer ve kurs gibi hizmet içi eğitim etkinliklerinin mahallî hizmet içi eğitim planına alınması için gerekli önerilerde bulunur ve çalışmaları izler. Konferans, panel, sempozyum gibi etkinliklerin gerçekleştirilmesini sağlar, ilgili rehberlik ve araştırma merkezi personelini etkinliklerde görevlendirir.\n" +
                    "17) Personel sayısının yetersiz olduğu durumlarda hizmetlerin yürütülmesinde branşı ile ilgili rehberlik ve araştırma merkezi çalışmalarına katılır.\n" +
                    "18) Rehberlik ve araştırma merkezinin stratejik planının hazırlanmasını ve uygulanmasını sağlar.\n" +
                    "19) İl veya ilçe genelinde özel eğitim ve rehberlik hizmetlerine ilişkin yılda en az üç araştırma yapılmasını sağlayarak hazırlanan raporu ilçe millî eğitim müdürlüğüne gönderir.\n" +
                    "20) Rehberlik ve araştırma merkezi çalışmalarını kamuoyuna tanıtmak amacıyla kitle iletişim araçlarını etkin bir şekilde kullanır.\n" +
                    "21) Eğitim yılı başında yapılacak toplantıda, rehberlik ve araştırma merkezinde oluşturulacak kurul ve komisyonları belirler.\n" +
                    "22) 6331 sayılı İş Sağlığı ve Güvenliği Kanununun 4 üncü maddesinin birinci fıkrasına göre rehberlik ve araştırma merkezinde çalışanların işle ilgili sağlık ve güvenliğini sağlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik ve araştırma merkezi müdür yardımcılarının görevleri", "1) Rehberlik ve araştırma merkezinde görevli memurlarla, yardımcı hizmetler sınıfındaki personelin iş bölümünü düzenler, müdürün onayından sonra iş ve işlemlerin yürütülmesini sağlar.\n" +
                    "2) Bölümlerin ihtiyaçlarını belirler ve gerekli önlemleri alır.\n" +
                    "3) Bölümlerden gelen rapor ve yazıların yazılmasını sağlar.\n" +
                    "4) Personel, özlük, bütçe, ayniyat, demirbaş hizmetlerinin yürütülmesini sağlar.\n" +
                    "5) Satın alma işlerinde müdürün vereceği görevleri yapar.\n" +
                    "6) Rehberlik ve araştırma merkezinin muayene, teslim alma ve sayım komisyonlarına başkanlık eder, bu konulardaki işlemleri yürütür.\n" +
                    "7) Rehberlik ve araştırma merkezinin depo, arşiv ve toplantı salonu gibi mekânlarının düzenli bir şekilde hizmete hazır bulundurulmasını ve korunmasını sağlar.\n" +
                    "8) Personel sayısının yetersiz olduğu durumlarda hizmetlerin yürütülmesinde branşı ile ilgili rehberlik ve araştırma merkezi çalışmalarına katılır.\n" +
                    "9) Üniversitelerin ilgili bölümlerinden staj, inceleme ve araştırma amacıyla rehberlik ve araştırma merkezine gelen kişilere bölümüyle ilgili bilgi verir ve bu kişilerin rehberlik ve araştırma merkezindeki çalışmalarını düzenler.\n" +
                    "10) Rehberlik ve araştırma merkezinde müdürün olmadığı zamanlarda müdürlüğe vekâlet eder.\n" +
                    "11) 6331 sayılı İş Sağlığı ve Güvenliği Kanununa göre rehberlik ve araştırma merkezinde çalışanların işle ilgili sağlık ve güvenliğinin sağlanmasında rehberlik ve araştırma merkezi müdürünün vereceği görevleri yapar.\n" +
                    "12) Rehberlik ve araştırma merkezi müdürünün hizmetle ilgili vereceği diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bölüm başkanının görevleri", "1) Bölümün işlerini planlar, işbirliğini sağlar ve çalışmaları izler.\n" +
                    "2) Bölümle ilgili hizmetlerin yürütülmesi için gerektiğinde diğer bölümlerle iş birliğini sağlar.\n" +
                    "3) Bölüm hizmetlerinin yürütülmesinde branşı ile ilgili çalışmalara katılır.\n" +
                    "4) Bölümüyle ilgili toplantılar düzenler ve düzenlenen toplantılara katılır.\n" +
                    "5) Bölüm çalışma alanına giren konulardaki etkinlikleri ve katılımcıları müdüre önerir.\n" +
                    "6) Merkez komisyonu toplantısında görüşülmek üzere bölümün yıllık çalışma programını ve raporunu bölüm personeli ile birlikte hazırlar ve rehberlik ve araştırma merkezi müdürüne iletir.\n" +
                    "7) Bölümle ilgili çalışma programının, değerlendirme raporlarının, araştırma ve proje raporlarının ve diğer ilgili kayıtların usulüne uygun olarak tutulmasını sağlar.\n" +
                    "8) Rehberlik ve araştırma merkezi müdürünün hizmetlerle ilgili vereceği diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik öğretmeninin görevleri ve sorumlulukları", "1) Görevlendirildiği bölümün çalışmalarını yürütür.\n" +
                    "2) Görevlendirildiği bölümün çalışmaları kapsamında eğitim kurumlarındaki rehberlik servislerinde yürütülen hizmetlere destek verir ve ihtiyaç duyulan konularda iş birliği yapar.\n" +
                    "3) Bireylerin kendini tanımasını sağlar ve gelişimlerini destekler.\n" +
                    "4) İhtiyaçlar doğrultusunda, ailelere, öğrencilere, öğretmenlere ve idarecilere yönelik eğitim programı ve grup rehberliği ile bireysel veya grupla psikolojik danışma çalışmaları yapar.\n" +
                    "5) Görevlendirildiği takdirde danışmanlık tedbir kararı alınmış çocuğa ve çocuğun bakımından sorumlu olan kişilere ilgili mevzuat hükümlerince danışmanlık tedbiri hizmeti sağlar.\n" +
                    "6) Bireyi tanıma, tarama, eğitsel değerlendirme ve tanılama ile yönlendirme amacıyla psikolojik ölçme araçlarını kullanır, sonuçlarını değerlendirir, gerekli durumlarda ilgili bölümlere sevk eder.\n" +
                    "7) Psikososyal, koruma, önleme ve krize müdahale hizmetleri ekibinde yer alır.\n" +
                    "8) Çalışmalarda kullanılan psikolojik ölçme araçlarının, danışan dosyalarının ve diğer kayıtların güvenliğini ve gizliliğini sağlar.\n" +
                    "9) Görevlendirildiği takdirde rehberlik öğretmeni olmayan okulların rehberlik çalışmalarına destek verir.\n" +
                    "10) Görev alanı ile ilgili araştırma, yayın, proje, seminer, konferans ve benzeri çalışmalara katılır.\n" +
                    "11) Görevlendirildiği takdirde tercih danışmanlığı çalışmalarını yürütür.\n" +
                    "12) Özel eğitim bölümünde görevlendirilmesi hâlinde eğitsel değerlendirme ve tanılama sürecinde görev alır.\n" +
                    "13) Görev alanı ile ilgili gerekli görülen durumlarda rehberlik ve araştırma merkezinde görevli en az iki öğretmen ile birlikte aile ziyaretleri yapar.\n" +
                    "14) Alanı ile ilgili rehberlik ve araştırma merkezi müdürünün vereceği diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Özel eğitim öğretmeninin görevleri ve sorumlulukları", "1) Görevlendirildiği bölümün çalışmalarını yürütür.\n" +
                    "2) Özel eğitim ihtiyacı olan bireyin ihtiyaçları doğrultusunda idareci, öğretmene ve aileye bilgi verir.\n" +
                    "3) Bireylerin, eğitsel değerlendirme ve tanılama çalışmalarına katılır.\n" +
                    "4) Destek eğitim önerilen bireylerin, engel türü ve derecesine, gelişim özelliklerine uygun eğitim planını hazırlar ve sonuçlarını değerlendirir.\n" +
                    "5) Eğitsel ve mesleki yönlendirmede bireylerin; engel türü ve derecesine uygun kararlar alabilmek için diğer alan uzmanlarıyla iş birliği yapar.\n" +
                    "6) Bireyin yetersizlik türü ve var olan performansı doğrultusunda en az sınırlandırılmış eğitim ortamlarından yararlanması amacıyla görüş ve önerilerini Özel Eğitim Değerlendirme Kuruluna sunar.\n" +
                    "7) Görev alanı ile ilgili idareci, öğretmen, veli ve öğrencilere eğitim etkinlikleri düzenler.\n" +
                    "8) Özel eğitim hizmetleri ile ilgili mevzuat doğrultusunda tanımlanmış diğer görevleri yerine getirir. Görevlendirilmesi hâlinde ilgili kurullarda görev alır.\n" +
                    "9) Görev alanı ile ilgili gerekli görülen durumlarda rehberlik ve araştırma merkezinde görevli en az iki öğretmen ile birlikte aile ziyaretleri yapar.\n" +
                    "10) Alanı ile ilgili rehberlik ve araştırma merkezi müdürünün vereceği diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Görevlendirilecek diğer personel", " Rehberlik ve araştırma merkezinde gerektiğinde çocuk gelişimi ve eğitimcisi, sosyal çalışmacı, eğitim programcısı, psikometrist, psikolog, fizyoterapist ve ergoterapist görevlendirilir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik ve araştırma merkezinde bulunması gereken araç-gereç, defterler ve basılı evrak", "Mevzuat gereği tutulması zorunlu olan idari, mali ve personel işleri ile ilgili her türlü defter ve basılı evrakın yanı sıra, rehberlik ve araştırma merkezinin hizmetleri ve görevleri ile ilgili araç-gereçler şunlardır:\n" +
                    "a) Bakanlık tarafından dağıtımı yapılan psikolojik ölçme araçları, teslim ve dağıtım formları ile puanlama ve kayıt formları.\n" +
                    "b) Danışan görüşme formu.\n" +
                    "c) Öğrenci gözlem formu.\n" +
                    "ç) İnceleme raporu formu.\n" +
                    "d) Danışan kayıt defteri.\n" +
                    "e) Rehberlik ve araştırma merkezinin kendi geliştirdiği ya da ihtiyaç duyulan diğer defter ve basılı evrak. \n" +
                    "f) Rehberlik ve araştırma merkezinin rehberlik ile özel eğitim çalışmalarının daha etkin biçimde bilgisayar destekli olarak yürütülebilmesi için gerekli yazılım ve donanımlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Merkez komisyonu ve görevleri", " * Merkez komisyonu; rehberlik ve araştırma merkezinde görevli idareci ve öğretmenlerden oluşur.\n" +
                    "*  Rehberlik ve araştırma merkezi çalışmalarının bütünlük içinde yürütülmesi ve koordinasyonuyla ilgili konuları görüşmek üzere yılda en az iki kez müdürün başkanlığında toplanır. Görevleri şunlardır:\n" +
                    "1) Rehberlik ve araştırma merkezinin bölüm çalışmalarını ihtiyaçlar doğrultusunda planlar ve yıl içinde yapılan çalışmaları değerlendirir.\n" +
                    "2) Kurum tarafından yapılacak olan araştırmaları planlar, görevlendirilecek bölümü ve bölüm personelini belirler.\n" +
                    "3) Çalışma bölgesinin rehberlik hizmetleri ile özel eğitim hizmetlerine ilişkin ihtiyaçlarını belirler, bu ihtiyaçlar doğrultusunda yapılacak faaliyetler ve alınacak önlemlere ilişkin ilgili birimlerle iş birliği yapar.\n" +
                    "4) Rehberlik ile özel eğitim ihtiyaçlarına ilişkin projeler üretilmesi için gerekli çalışmaları yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik servisi", "* Resmî ve özel, örgün ve yaygın eğitim kurumlarında rehberlik hizmetlerini yürütmek üzere rehberlik servisi kurulur. Rehberlik hizmetlerinin etkili bir şekilde yürütülebilmesi için rehberlik servisinin;\n" +
                    "a) Öğrenci, veli, öğretmen ve diğer personelin kolaylıkla ulaşabileceği konumda olması,\n" +
                    "b) Uygun fiziki koşullara sahip olması,\n" +
                    "c) Bilişim, iletişim araçları, gerekli büro malzemeleri, bireysel rehberlik ve grup rehberliği için gerekli araç ve gereçler ile donatılmış olması gerekir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik hizmetleri yürütme komisyonu", "* Eğitim kurumlarında rehberlik hizmetlerinin planlanması ve kurum içindeki iş birliğinin sağlanması amacıyla rehberlik hizmetleri yürütme komisyonu oluşturulur.\n" +
                    "* Rehberlik hizmetleri yürütme komisyonu eğitim kurumu müdürünün başkanlığında aşağıdaki üyelerden oluşur:\n" +
                    "a) Müdür başyardımcısı, sınıf ve şubelerden sorumlu müdür yardımcıları ve pansiyondan sorumlu müdür yardımcıları ile rehberlik hizmetlerinden sorumlu müdür yardımcısı.\n" +
                    "b) Rehberlik öğretmenleri.\n" +
                    "c) Sınıf rehber öğretmenlerinden her sınıf düzeyinden seçilecek en az birer temsilci.\n" +
                    "ç) Ortaöğretim kurumlarında Disiplin Kurulu ve Onur Kurulundan; ilköğretim kurumlarında ise Öğrenci Davranışları Değerlendirme Kurulundan birer temsilci.\n" +
                    "d) Okul-aile birliğinden bir temsilci.\n" +
                    "e) Okul öncesi eğitim kurumları hariç okul öğrenci temsilcisi.\n" +
                    "* Rehberlik öğretmeni bulunmayan eğitim kurumlarında gerektiğinde rehberlik ve araştırma merkezinden bir rehberlik öğretmeninin bu komisyona katılması sağlanır.\n" +
                    "* Okul öncesi eğitim kurumlarında; rehberlik hizmetleri yürütme komisyonu, müdür başkanlığında bir müdür yardımcısı ve farklı yaş grubundaki çocukların eğitiminden sorumlu en az birer öğretmenden oluşur.\n" +
                    "* Yaygın eğitim kurumlarında; yürütme komisyonu, müdürün başkanlığında bir müdür yardımcısı, rehberlik öğretmeni ile müdürün görevlendireceği bir öğretmenden oluşur.\n" +
                    "* Rehberlik öğretmenleri komisyonun sürekli üyesidir. Komisyonun diğer üyeleri her ders yılı başında öğretmenler kurulunda yeniden belirlenir.\n" +
                    "* Komisyon toplantısı, öğretmenler kurulu toplantısının yapıldığı tarihten itibaren en geç bir ay içerisinde yapılır.\n" +
                    "* Komisyon birinci dönem başında, ikinci dönem başında ve yılsonunda olmak üzere en az üç defa toplanır. Gerektiğinde rehberlik servisinin önerisi ile de toplanabilir.\n" +
                    "* Komisyonun gündemi, rehberlik servisince hazırlanıp eğitim kurumu müdürüne sunulur; gündem ve toplantı günleri müdür tarafından bir hafta önce yazılı olarak ilgililere duyurulur. Komisyon toplantısında alınan kararlar tutanak haline getirilir. Alınan kararlar eğitim kurumu personeline yazılı olarak duyurulur.\n" +
                    "* Rehberlik öğretmeni bulunmayan eğitim kurumlarında rehberlik hizmetleri, rehberlik hizmetleri yürütme komisyonu aracılığıyla rehberlik ve araştırma merkezi ile iş birliği içerisinde yürütülür.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Rehberlik hizmetleri yürütme komisyonunun görevleri", "1) Rehberlik servisince hazırlanan yıllık çerçeve planını inceler; görüşlerini bildirir. Uygulanması için gerekli önlemleri karara bağlar.\n" +
                    "2) Rehberlik hizmetlerinin yürütülmesi sırasında hizmetlere ilişkin çalışmaları ve ortaya çıkan sorunları inceler, değerlendirir ve bunların çözümüne yönelik önlemleri belirler.\n" +
                    "3) Eğitim ortamında; öğrenciler, aileler, idareciler ve öğretmenler arasında sağlıklı iletişim kurulabilmesi için yapılacak çalışmaları belirler.\n" +
                    "4) Eğitsel ve mesleki rehberlik çalışmalarında ve öğrencileri yönlendirmede, eğitim kurumundaki etkinliklerden yararlanılabilmesi için gerekli çalışmaları belirler.\n" +
                    "5) Yapılacak çalışmalarda birey, aile, ilgili kurum ve kuruluşlara yönelik iş birliğinin sağlanması için gerekli faaliyetleri planlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Eğitim kurumu müdürünün rehberlik hizmetlerine ilişkin görevleri", "1) Okulda rehberlik hizmetlerinin sağlıklı şekilde yürütülebilmesi için hizmetin gerektirdiği fiziksel şartları ve uygun çalışma ortamını hazırlar, kullanılacak araç ve gereci sağlar.\n" +
                    "2) Rehberlik hizmetleri yürütme komisyonunu kurar ve bu komisyona başkanlık eder.\n" +
                    "3) Eğitim kurumunun rehberlik hizmetlerinin yürütülmesi ile ilgili yıllık çerçeve planın hazırlanmasını sağlar ve uygulanmasını izler.\n" +
                    "4) Eğitim kurumunda birden fazla rehberlik öğretmeni varsa bir rehberlik öğretmenini koordinatör olarak görevlendirir ve gerekli gördüğü takdirde görevlendirme değişikliği yapar.\n" +
                    "5) Birden fazla rehberlik öğretmeni olması hâlinde program, planlama, araştırma gibi görevler dışında; hizmetlerin yürütülmesinde sınıf ve öğrenci sayıları ve özel beceriler gibi ölçütlere göre gerektiğinde iş bölümü yapar.\n" +
                    "6) Eğitim kurumundaki öğretmenleri her sınıfa bir sınıf rehber öğretmeni olmak üzere zorunlu olmadıkça öğrencilerin mezuniyetine kadar değiştirmemeyi esas alarak görevlendirir.\n" +
                    "7) Eğitim kurumundaki rehberlik hizmetlerinin verimli bir şekilde yürütülmesi için rehberlik öğretmeni, sınıf rehber öğretmenleri, öğrenciler ve veliler arasında iş birliğini sağlar.\n" +
                    "8) Rehberlik servisince hazırlanan yıllık çerçeve planını ders yılının başladığı ilk ay içerisinde, yıl sonu çalışma raporunun bir örneğini ise ders yılının tamamlandığı ay içerisinde bağlı bulunduğu rehberlik ve araştırma merkezine gönderir.\n" +
                    "9) Haftalık ders çizelgesinde yer alan rehberlik uygulamalarına ayrılmış saatlerde rehberlik hizmetlerinin sunulması için gerekli tedbirleri alır.\n" +
                    "10) Hakkında danışmanlık tedbir kararı alınmış çocuklara ve ailelerine yönelik rehberlik servisi tarafından sunulacak hizmetlerin yerine getirilmesini sağlar.\n" +
                    "11) İhtiyaçlar doğrultusunda öğrencilere, öğretmenlere, idarecilere ve ailelere yönelik gerçekleştirilecek eğitim etkinliklerinin düzenlenmesi için uygun ortamı ve gerekli desteği sağlar.\n" +
                    "12) Pansiyonlarda barınan öğrencilere verilecek rehberlik hizmetleriyle ilgili gerekli tedbirleri alır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Müdür yardımcılarının rehberlik hizmetlerine ilişkin görevleri", "1) Rehberlik hizmetleri yürütme komisyonu toplantılarına katılır.\n" +
                    "2) Rehberlik hizmetlerinin nitelikli bir şekilde yürütülebilmesi için öğrencilerin devam durumu, başarı durumu, sosyal kulüp çalışmaları gibi bilgi ve belgeleri rehberlik servisi ile paylaşır ve iş birliği yapar.\n" +
                    "3) Eğitim kurumu müdürünün vereceği rehberlik hizmetleriyle ilgili diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Koordinatör rehberlik öğretmeninin görevleri", "1) Rehberlik servisi ile eğitim kurumu yönetimi arasındaki koordinasyonu sağlar.\n" +
                    "2) Rehberlik programları ve rehberlik etkinlikleri ile ilgili öğretmenler kuruluna bilgi verir.\n" +
                    "3) Rehberlik servisinin hazırladığı yıllık çerçeve programının ve yıl sonu çalışma raporlarının birer örneğini eğitim kurumu müdürüne iletir.\n" +
                    "Rehberlik öğretmeninin görevleri\n" +
                    "1) Yıllık çerçeve planını, bağlı olduğu rehberlik ve araştırma merkezinin hazırladığı çerçeve planı temel alarak eğitim kurumunun türüne ve öğrencilerin ihtiyaçlarına göre hazırlar. Yıllık çerçeve planını ve yıl sonu çalışma raporunu rehberlik ve araştırma merkezine iletilmek üzere eğitim kurumu müdürüne sunar.\n" +
                    "2) Sınıf rehberlik planlarının hazırlanmasında, uygulanmasında, sınıf içi rehberlik uygulamalarının geliştirilmesinde sınıf rehber öğretmenlerine rehberlik eder.\n" +
                    "3) Öğrencilerin eğitsel, mesleki ve kişisel/sosyal gelişimlerini sağlamak amacıyla bireysel rehberlik ve grup rehberliği hizmetlerini yürütür.\n" +
                    "4) Sınıf ve pansiyonlarda yürütülen eğitsel, mesleki ve kişisel/sosyal rehberlik etkinliklerinden, rehberlik alanında özel bilgi ve beceri gerektiren hizmetleri yürütür.\n" +
                    "5) Gerektiğinde rehberlik hizmetlerinde kullanılacak ölçme araçları, doküman ve kaynakları hazırlama ve geliştirme çalışmalarına katılır.\n" +
                    "6) Rehberlik hizmetleri çerçevesinde yapılan çalışmaları raporlaştırır ve ilgililerle paylaşır.\n" +
                    "7) Mesleklerin özelliklerini, ön koşullarını, eğitim, yetiştirilme ve staj olanaklarını, çalışma koşullarını; verilen bursları, eğitim ve iş gücü yetiştirme programlarını öğrenciler, öğretmenler ve velilerle paylaşır.\n" +
                    "8) Rehberlik hizmetlerinin etkin ve verimli bir şekilde yürütülebilmesi için ihtiyaç duyulan durumlarda bireysel veya grupla psikolojik danışma ve görüşme yapmak üzere öğrenciyi ders saati içerisinde rehberlik servisine davet eder. Görüşme içeriğinin gizliliğini koruyarak görüşülecek öğrencinin yalnızca adını ve görüşme saatini eğitim kurumu idaresine bildirir.\n" +
                    "9) Rehberlik servisinde gerçekleştirilen çalışmaların kaydını tutar, çalışmalara ait doküman arşivi oluşturur.\n" +
                    "10) Bireylere ilişkin hizmetin gerektirdiği özel ve gizlilik içeren bilgileri, mevzuat ile yetkili kılınan makamlar dışında öğrencinin ve velisinin izni olmadan kimseyle paylaşmaz.\n" +
                    "11) Rehberlik hizmetlerinin tanıtılması ve yaygınlaştırılması amacı ile materyal hazırlar ve gerekli tanıtım çalışmalarını gerçekleştirir.\n" +
                    "12) Merkezî sınavlara ait tercih döneminde görev alır.\n" +
                    "13) Eğitsel değerlendirme ve tanılamada özel eğitim değerlendirme kuruluna üye olarak katılır.\n" +
                    "14) Özel eğitim ihtiyacı olan öğrencilerin eğitim ihtiyaçlarının karşılanması amacıyla bireyselleştirilmiş eğitim programı geliştirme ekibinde rehberlik hizmetlerini yürütmek üzere görev alır.\n" +
                    "15) Özel eğitim ihtiyacı olan öğrenciler ve ailelerine yönelik eğitim hizmetlerinin yürütülmesinde ilgili kişi, kurum ve kuruluşlarla iş birliği yapar.\n" +
                    "16) Destek eğitim odasında eğitim alan kaynaştırma öğrencilerinin gelişimini takip eder. Öğretmenlere bu konuda rehberlik eder.\n" +
                    "17) Evde ve hastanede eğitime karar verilmiş öğrencilere rehberlik hizmeti sunmak amacıyla öğrenciyi evde ve hastanede ziyaret eder.\n" +
                    "18) Rehberlik ve araştırma merkezlerinin yürüttüğü proje ve ekip çalışmalarına ihtiyaç duyulması hâlinde katılır.\n" +
                    "19) Öğrencinin ilgi, yetenek, değer, çevre koşulları ve kişilik özelliklerini de dikkate alarak alan, dal ve ders seçimi yapmasına, sosyal kulüplere yönelmesine destek olur. Üst eğitim kurumlarına ve programlarına ilişkin gerekli bilgileri verir.\n" +
                    "20) Görevlendirildiği takdirde komisyonla öğrenci alan eğitim kurumlarının kayıt döneminde görev alır.\n" +
                    "21) Eğitim kurumuna ve pansiyona yeni kayıt olan ya da nakil yoluyla gelen öğrencilere yapılacak uyum çalışmasını planlar.\n" +
                    "22) Aile rehberliği hizmetlerini yürütür.\n" +
                    "23) Veli toplantılarına katılır.\n" +
                    "24) Öğrencilerin stresle, kişisel sorunlarla ve travmatik yaşantılarla baş etme becerileri geliştirmelerine destek olur.\n" +
                    "25) Öğrencinin kişisel özelliklerini, eğitsel ve mesleki ihtiyaçlarını değerlendirmek amacıyla ihtiyaç duyulan ölçme aracını uygular; değerlendirmelerini raporlaştırarak ilgililerle paylaşır.\n" +
                    "26) Mesleki yönelim faaliyetlerinde güncel veri ve gelişmelerden faydalanmak için ilgili kurum ve kuruluşlarla işbirliği yapar.\n" +
                    "27) Psikolojik ölçme araçlarını uygularken, ölçme aracının uygulama yönergesinde belirtilen kurallara, bilimsel ve etik ilkelere uygun davranır.\n" +
                    "28) Öğrencinin ya da grubun ihtiyaçlarına göre psikolojik danışma sürecini belirler, uygular ve danışma sürecinde danışan dosyası aracılığı ile gerekli kayıtları tutar.\n" +
                    "29) Öğrencilerle yürütülen rehberlik çalışmalarının kayıtlarını tutar ve sonrasında öğrenciyi izler.\n" +
                    "30) Hakkında danışmanlık tedbir kararı alınan çocuğa ve çocuğun bakımından sorumlu kişilere hizmet sunar.\n" +
                    "31) Pansiyonlu eğitim kurumlarında, pansiyonda barınan öğrencilere verilecek rehberlik hizmetleri ile ilgili iş ve işlemleri eğitim kurumunda veya pansiyonda yürütür.\n" +
                    "32) İhtiyaçlar doğrultusunda, ailelere, öğrencilere, öğretmenlere ve idarecilere yönelik ilgili kurum ve kuruluşlarla iş birliği yaparak eğitim etkinlikleri gerçekleştirir.\n" +
                    "33) Çalışmalarını rehberlik ve araştırma merkezi ile işbirliği içerisinde yürütür.\n" +
                    "34) Ortaokullarda öğrenci davranışları değerlendirme kurulunun ve ortaöğretim kurumlarında okul öğrenci ödül ve disiplin kurulunun önerisi ile rehberlik servisine yönlendirilen öğrenciyle görüşme yapar ve öğrencinin durumuna ilişkin raporu ilgili kurula sunar.\n" +
                    "35) Eğitim kurumu idarecileri, öğretmenler, eğitim kurumu personeli ve ailelere yönelik rehberlik hizmetleri hakkında işbirliği sağlanması için müşavirlik yapar.\n" +
                    "36) Sınavlarda görev alabilir; belleticilik ve nöbet görevi yapar.\n" +
                    "37) Sunduğu hizmetlerin etkililiğini ve verimliliğini artırmak amacıyla araştırma, izleme ve değerlendirme çalışmaları yapar.\n" +
                    "38) Eğitim kurumu müdürünün vereceği rehberlik hizmetleri ile ilgili diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf rehber öğretmeninin görevleri", "1) Eğitim kurumunun yıllık rehberlik planı çerçevesinde sınıfının yıllık çalışmalarını planlar. Bu planlamanın bir örneğini ders yılının ilk ayı içinde rehberlik servisine iletir; plan dâhilinde uygulamalarını gerçekleştirir.\n" +
                    "2) Bireyi tanıma tekniklerinden uzmanlık bilgisi gerektirmeyenleri sınıfında uygulayarak sonuçlarını rehberlik öğretmeni ile paylaşır.\n" +
                    "3) e-Okul sistemindeki öğrenci gelişim dosyalarının sınıf rehberlik hizmetleri ile ilgili bölümlerini doldurur, gerektiğinde rehberlik servisiyle iş birliği yapar.\n" +
                    "4) Sınıfa yeni gelen öğrencilerin uyum sürecinde rehberlik öğretmeni ile iş birliği içerisinde çalışır.\n" +
                    "5) Rehberlik öğretmeni ile iş birliği yaparak öğrencilerin ilgi, yetenek, değer, akademik başarı ve kişilik özelliklerine göre öğrenci meclisine, öğrenci kulüplerine, seçmeli derslere ve sosyal etkinliklere yönlendirme işlemlerini yürütür.\n" +
                    "6) Sınıfındaki öğrencilerin risk altında olduğuna ilişkin veri elde ettiğinde gerekli desteği sağlamak üzere rehberlik servisine bilgi verir.\n" +
                    "7) Öğrencinin, öğrenme stilini fark etmesine, öğrenme becerilerini geliştirmesine, akademik performansını artırmasına yönelik çalışmalarında rehberlik servisiyle iş birliği yapar.\n" +
                    "8) Sınıfıyla ilgili yürüttüğü rehberlik çalışmalarını, rehberlik hizmetleri ile ilgili ihtiyaç ve önerilerini belirten raporu ders yılı sonunda rehberlik servisine iletir.\n" +
                    "9) Öğrenci hakkındaki özel ve gizlilik içeren bilgileri korur.\n" +
                    "10) Bireyselleştirilmiş eğitim planının hazırlanmasında görev alır.\n" +
                    "11) Eğitim kurumu müdürünün rehberlik hizmetleri ile ilgili vereceği diğer görevleri yapar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Diğer öğretmenler", "Sınıf rehber öğretmenliği görevi olmayan öğretmenler, gerektiğinde rehberlik servisinin planlaması doğrultusunda rehberlik çalışmalarına destek sağlar.Eğitim kurumu müdürünün vereceği rehberlik hizmetleri ile ilgili görevleri yapar.\n" +
                    "Çalışma saatleri ve izinler\n" +
                    "* Rehberlik servislerinde görevli rehberlik öğretmenlerinin çalışma süreleri haftalık 30 iş saatidir. Günlük çalışma saatleri eğitim-öğretim kurumunun özellik ve ihtiyaçlarına göre okul müdürlüğünce düzenlenir. Bu elemanlar izin ve tatillerini diğer öğretmenler gibi kullanırlar\n" +
                    "* Rehberlik öğretmenleri tercih danışmanlığı, alan ve ders seçimi, öğrenci tanılama sürecine bağlı olarak yapılacak çalışmalarda izin ve tatil dönemlerinde görevlendirilebilir.\n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("28")) {

            list.add(new Card_Ozellikleri("MİLLÎ EĞİTİM BAKANLIĞI OKUL ÖNCESİ EĞİTİM VE İLKÖĞRETİM KURUMLARI YÖNETMELİĞİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Tanımlar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Anaokulu", "36-68 aylık çocukların eğitimi amacıyla açılan okulu", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ana sınıfı", "57-68 aylık çocukların eğitimi amacıyla örgün ve yaygın eğitim kurumları bünyesinde açılan sınıfı", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Eğitim ve öğretim yılı", "Eğitim ve öğretimin başladığı tarihten, sonraki eğitim ve öğretim yılının başladığı tarihe kadar geçen süreyi ifade eder.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İlköğretim kurumları", "Resmî ve özel ilkokul, ortaokul ile eğitim, öğretim, yönetim ve bütçe ile ilgili iş ve işlemleri Din Öğretimi Genel Müdürlüğünce yürütülen imam-hatip ortaokullarını kapsar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Okul öncesi eğitim kurumu", "Okul öncesi eğitim çağı çocuklarına eğitim veren anaokulu, ana sınıfı ile uygulama sınıfını kapsar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Uygulama sınıfı", "Mesleki ve teknik ortaöğretim kurumlarında çocuk gelişimi ve eğitimi alanında 36-68 aylık çocukların eğitiminin yapıldığı uygulama birimini ifade eder.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Ders yılı süresi ve haftalık ders programı ", "*Okul öncesi eğitim ve ilköğretim kurumlarında ders yılı süresinin 180 iş gününden az olmaması esastır. \n" +
                    "* Ders yılı, yarıyıl ve yaz tatilinin başlama ve bitiş tarihleri, Bakanlıkça her yıl düzenlenen çalışma takviminde belirtilir. Bu tarihler göz önünde bulundurularak hazırlanan il çalışma takvimi, il millî eğitim müdürlüklerinin önerisi ve valilik onayı ile yürürlüğe girer. \n" +
                    "* Bu programda yönetici ve öğretmenlerin okutacakları derslerin gün ve saatlere göre öğretmenlerin mazeretleri de dikkate alınarak dengeli olarak dağılımı yapılır ve ilgililere imza karşılığı duyurulur. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Etkinlik, ders, etüt ve dinlenme süreleri ", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Okul öncesi eğitim kurumlarında;", "* Günde ellişer dakikalık aralıksız 6 etkinlik saati süre ile ikili eğitim yapılır. \n" +
                    "* Bir gruptaki çocuk sayısının 10’dan az, 20’den fazla olmaması esastır. \n" +
                    "* Eğitim ve öğretim yılı içinde çocuk sayısı 10’un altına düşen gruplar öncelikli olarak diğer gruplarla birleştirilir. \n" +
                    "* Yaz aylarında yapılan eğitime sadece okul öncesi eğitimden yararlanamayan çocuklar kaydedilir. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İlköğretim kurumlarında;", "* Bir ders saati süresi 40 dakikadır. Okul yönetimince teneffüsler için normal eğitim yapılan okullarda  en az 15 dakika, ikili eğitim yapılan okullarda  ise en az 10 dakika süre ayrılır.\n" +
                    "* Normal öğretim yapılan okullarda yemek ve dinlenme için en az 40, en çok 90 dakika süre verilir. \n" +
                    "* İkili öğretim yapılan ilköğretim kurumlarında sabahçı ve öğlenci grup öğrencilerinin çıkış ve girişleri arasında en fazla 30 dakikalık süre ayrılır. \n" +
                    "* Yatılı bölge ortaokullarında etüt için her gün iki ders saati süre ayrılır. \n" +
                    "* Ortaokul ve imam-hatip ortaokullarında dersler, öğretmenler kurulu kararı ile blok olarak da yapılabilir. Ancak her blok ders, iki ders saati süresi ile sınırlıdır.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Okul tespitinin planlanması ", "* Öğrencilerin, yerleştirilecekleri okulları belirlemek üzere mart ayında il/ilçe millî eğitim müdürünün görevlendireceği müdür yardımcısı veya şube müdürünün başkanlığında, eğitim bölgesindeki okulların özelliklerine göre seçilen en çok beş okul müdüründen öğrenci yerleştirme komisyonu oluşturulur. \n" +
                    "* Komisyon, okulların fiziki kapasite ve ulaşım imkânlarını dikkate alarak öğrenci alınacak kayıt alanlarını belirler ve e-Okul sisteminin ilgili bölümüne işler.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kayıt zamanı ve kayıt yaşı ", "*Okul öncesi eğitim ve ilköğretim kurumlarında yeni kayıtlar, temmuz ayının ilk iş gününde başlar. \n" +
                    "* Kayıt işlemi e-Okul sistemi üzerinden yapılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Okul öncesi eğitim kurumlarında okula kayıt", "* Anaokulu, ana sınıfı ve uygulama sınıflarına, kayıtların yapıldığı yılın eylül ayı sonu itibarıyla 57-68 aylık çocukların kaydı yapılır. Ancak bir grup oluşturabilecek kadar çocuk bulunmayan okullarda 36-47 ay arası çocuklar da ana sınıfına kaydedilebilir. \n" +
                    "* Okulun kayıt alanında ikamet eden ve bir sonraki eğitim ve öğretim yılında ilkokula başlayacak çocukların kaydı yapıldıktan sonra fiziki imkânları yeterli olan ve uygulama sınıflarına 36-56 aylık, ana sınıflarına ise 69-71 aylık çocuklar da kaydedilebilir.\n" +
                    "* İlkokul kaydı bir yıl ertelenen ve bir önceki yıl okul öncesi eğitim almamış olan 69-71 aylık çocuklara, okul öncesi eğitim kurumlarına kayıtta öncelik tanınır.\n" +
                    "* Rehberlik ve araştırma merkezlerinde oluşturulan Özel Eğitim Değerlendirme Kurulunca hazırlanan rapor doğrultusunda tam zamanlı kaynaştırma yoluyla okul öncesi eğitim kurumlarına yönlendirilen  36-71 aylık çocuklar bu kurumlara kaydedilir. Bu sınıfların mevcutları 10 çocuk bulunan sınıflarda iki, 20 çocuk bulunan sınıflarda ise bir çocuk olacak şekilde oluşturulur. \n" +
                    "* Başvurunun kontenjandan fazla olması durumunda veliler huzurunda kura çekimi yapılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri(" İlkokula kayıt", "* İlkokulların birinci sınıfına, kayıtların yapıldığı yılın eylül ayı sonu itibarıyla 69 ayını dolduran çocukların kaydı yapılır. \n" +
                    "* Gelişim yönünden ilkokula hazır olduğu anlaşılan 66, 67 ve 68 ay arası çocuklardan, velisinin yazılı isteği bulunanlar da ilkokul birinci sınıfa kaydedilir. \n" +
                    "* Okul müdürlükleri, yaşça kayıt hakkını elde eden çocuklardan 69, 70 ve 71 aylık olanları velisinin yazılı talebi bulunması halinde okul öncesi eğitime yönlendirebilir veya kayıtlarını bir yıl erteleyebilir.\n" +
                    "* Nüfusa gerçek yaşından büyük veya küçük yazılmış olanların yaşlarının düzeltilmesi okul yönetimince velilerinden istenir. Bu öğrencilerden velisi üç ay içinde girişimde bulunmadığı veya bu işleri yapmadığı takdirde gereği yapılmak üzere il/ilçe millî eğitim müdürlüğüne bildirilir. \n" +
                    "* Mecburi ilköğretim çağında olup herhangi bir sebeple okula kaydı yapılmamış okuma yazma bilmeyen çocukların kayıtları birinci sınıfa yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ortaokul ve imam-hatip ortaokuluna kayıt", "* İlkokul öğrenimini tamamlayan ve kayıtların yapıldığı eylül ayı sonu itibarıyla zorunlu öğrenim çağı dışına çıkmamış öğrencilerin kayıtları ulusal adres veri tabanındaki yerleşim yeri adres bilgileri esas alınarak e-Okul sistemi üzerinden ortaokula yapılır. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Nakil ", "* Nakiller eylül ayının ilk iş günü başlar ve ders yılı sonuna 15 iş günü kalıncaya kadar devam eder. \n" +
                    "* Ancak doğal afet, sağlık ve ailenin adres değişikliği gibi nedenlerde bu süre aranmaz. \n" +
                    "* İller arası nakillerde en çok beş günlük süre devamsızlıktan sayılmaz.\n" +
                    "* Şehit, harp malûlü ve muharip gazi çocukları ile özel eğitime ihtiyacı olan çocukların nakilleri, durumlarını belgelendirmeleri şartıyla ulusal adres veri tabanındaki adreslerine bakılmaksızın istedikleri okula yapılır. \n" +
                    "* İlköğretim kurumlarında sınıf mevcutları otuzun altında kalan okulların boş kontenjanları derslerin başladığı haftanın ilk iş gününde e-Okul sisteminde ilan edilir. Bu okullara kayıt alanı dışından öğrencisini nakil ettirmek isteyen velilerin başvuruları derslerin başladığı ilk hafta içerisinde e-Okul sistemi üzerinden alınır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Denklik ile kayıt ", "* Denkliği kabul edilmiş olan özel Türk okulları ile azınlık veya yabancı okullardan resmî okullara naklen gelen öğrenciler, öğrenim belgelerinde gösterilen sınıflara sınavsız alınırlar. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınavla kayıt ", "* Mecburi ilköğretim çağında olup yurt dışında bulunması, tutuklu olması, oturduğu yerde okul bulunmaması ve sağlık durumu nedeniyle hiç okula gidememiş veya öğrenime ara vermiş çocuklardan özel bir şekilde kendini yetiştirmiş olanlar, sınavla tespit edilecek bilgi düzeyine ve yaşına uygun sınıfa kaydedilir. \n" +
                    "* Bu sınavlar, ilkokullarda okul müdürünün başkanlığında en az iki öğretmenin; ortaokul ve imam-hatip ortaokullarında ise alan öğretmenleri ile okul rehber öğretmeninin katılacağı bir komisyon tarafından yapılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yatılı bölge ortaokuluna kayıt ", "* Yatılı bölge ortaokulunun öğrenci alacağı yerleşim yerleri ve öğrenci sayısı, kayıtlar başlamadan en az bir ay önce il millî eğitim müdürü veya görevlendireceği il millî eğitim müdür yardımcısının başkanlığında, ilçe millî eğitim müdürleri ve yatılı bölge ortaokulu müdürlerinden oluşan bir komisyon tarafından tespit edilir. \n" +
                    "* Okulu bulunmayan veya öğrenci yetersizliği nedeniyle okulu kapatılan yerleşim birimlerindeki öğrenciler ile birleştirilmiş sınıfları bulunan ilkokullarda 4 üncü sınıfı tamamlayan ve taşımalı eğitim kapsamına alınamayan mecburi ilköğretim çağındaki öğrenciler de yatılı bölge ortaokullarına alınırlar. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Devam, devamsızlığın izlenmesi ve izin verme", "Çocukların devamsızlıkları, okul öncesi eğitim kurumlarında öğretmen, ilkokullarda sınıf öğretmeni, ortaokul ve imam-hatip ortaokullarında ise okul yönetimi tarafından e-Okul sistemine işlenir ve yöneticiler tarafından takip edilir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Devam, devamsızlığın izlenmesi ve izin verme", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Okul öncesi eğitim kurumlarında", "* Kayıtları yapılan çocukların kuruma günlük eğitimi aksatmayacak şekilde devam etmelerinin sağlanması esastır. Ancak özel eğitim gerektiren çocukların sosyal uyum ve gelişim özelliğine göre günlük devam sürelerinde esneklik sağlanır. \n" +
                    "* Özürsüz olarak aralıksız 10 gün okula devam etmeyen çocuğun velisi okul müdürlüğünce yazı ile uyarılır. Bu uyarıya rağmen özürsüz olarak aralıksız 30 gün okula devam etmeyen ve devam ettiği hâlde üst üste iki aylık ücreti yatırılmayan çocukların kaydı silinir. Bu durum veliye yazılı olarak bildirilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İlköğretim kurumlarında", "* İlköğretim kurumlarında öğrencilerin okula devamları zorunludur. \n" +
                    "* Normal ve ikili öğretim yapılan okullarda ilk derse girdiği hâlde sonraki bir veya daha fazla derse özürsüz olarak girmeyen öğrencinin durumu okul yönetimince velisine ivedilikle bildirilir ve devamsızlığı yarım gün sayılır. \n" +
                    "* Öğrencinin geçerli mazereti ve velinin başvurusu üzerine okul yönetimi tarafından bir öğretim yılı içerisinde 15 güne kadar izin verilebilir. \n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Öğrenim çağı dışına çıkan öğrenciler", "* Mecburi ilköğretim çağı dışına çıkan ilkokul öğrencileri, ders yılı sonuna kadar öğrenimlerine devam ettirilir. Bu öğrencilere öğretim yılı sonunda Öğrenim Belgesi verilerek yaygın eğitime yönlendirilir.\n" +
                    "* Mecburi öğrenim çağını bitirdiği ders yılı sonuna kadar ortaokul veya imam-hatip ortaokulu öğrenimlerini tamamlayamayan öğrenciler, öğrenimlerini tamamlamak üzere en çok iki eğitim ve öğretim yılı daha okullarına devam ettirilir.\n" +
                    " * Bu iki yıllık uzatma sonunda da ortaokul veya imam-hatip ortaokulu öğrenimini tamamlayamayanlara ders yılı sonunda öğrenim durumunu gösterir Öğrenim Belgesi düzenlenir ve Açık Öğretim Ortaokuluna yönlendirilir\n.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrenci Dosyası ", " Okul öncesi ve ilkokullarda öğrenci dosyası bilgileri Şube rehber öğretmeni tarafından E-Okul sistemine işlenir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrenci Başarısının Değerlendirilmesi ", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Ölçme ve değerlendirmenin genel esasları", "* Başarının ölçülmesi ve değerlendirilmesinde öğretim programlarında belirtilen amaçlar ile kazanımlar esas alınır. Ölçülecek kazanımın özelliğine göre ilgili dersin öğretim programında yer alan ölçme ve değerlendirme esaslarına uyulur. \n" +
                    "* İlkokul 4 üncü sınıfta öğrenci başarısı; sınavlar ile ders etkinliklerine katılım çalışmalarından alınan puanlara göre değerlendirilir.\n" +
                    "* Ortaokul ve imam-hatip ortaokullarında öğrencilerin başarısı; sınavlar, ders etkinliklerine katılım ve varsa proje çalışmalarından alınan puanlara göre değerlendirilir. \n" +
                    "* Kaynaştırma yoluyla eğitimlerine devam eden öğrenciler için; Bireyselleştirilmiş Eğitim Programı Geliştirme Birimi tarafından BEP hazırlanır ve bu öğrencilerin başarıları, bu programda yer alan amaçlara göre değerlendirilir. \n" +
                    "* İlkokul 1, 2 ve 3 üncü sınıflarda öğrencilerin başarısı; Karnede “çok iyi”, “iyi” ve “geliştirilmeli” şeklinde gösterilir. \n" +
                    "*İlkokul 4 üncü sınıf ile ortaokul ve imam-hatip ortaokulunda dönem puanı, yıl sonu puanı ve yıl sonu başarı puanı 100 tam puan üzerinden belirlenir. Yüzlük puan sisteminde 0- 44,99 puanlar başarısız, 45,00 ve üzeri puanlar başarılı olarak değerlendirilir. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ölçme ve değerlendirmenin niteliği ve sayısı ", "* 4, 5, 6, 7 ve 8 inci sınıflarda her dersten bir dönemde iki sınav yapılır. Sınavların zamanı, en az bir hafta önceden öğrencilere duyurulur. \n" +
                    "* Öğrencilere her dönemde her bir dersin haftalık ders saati sayısı 2 ve daha az olanlara 2, haftalık ders saati sayısı 2 den fazla olanlara ise 3 defa ders etkinliklerine katılım puanı verilir.\n" +
                    "* Bir sınıfta/şubede bir günde yapılacak sınav sayısı ikiyi, her bir sınav süresi ise bir ders saatini geçemez. \n" +
                    "* Ortak değerlendirme yapılmasına imkân vermek üzere; sınavlar ilgili zümre kararı doğrultusunda okul müdürlüğünce ortak olarak da yapılabilir.\n" +
                    "* Öğretmenlerce yapılan sınavlarda farklı soru tiplerine yer verilir.\n" +
                    "* Proje vermeyen öğrencinin proje notu sıfır olarak değerlendirilir. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ölçme ve değerlendirmeye katılmayanlar ", " Veli, öğrencisinin sınava katılamama veya projesini zamanında teslim edememe gerekçesini, en geç beş iş günü içinde okul yönetimine yazılı olarak bildirir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ölçme ve değerlendirme sonuçlarının duyurulması ", "* Sınav sonuçları sınavların yapıldığı, projelerin değerlendirilmesi ise teslim edildiği tarihten başlayarak en geç 10 iş günü içinde e-Okul sistemine işlenir ve öğrencilere bildirilir. \n" +
                    "* Öğrencilerin hazırladıkları projelerin değerlendirilmesinde kullanılan dereceli puanlama ölçekleri de bir yıl saklanır.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınıf geçme", "* Ortaöğretimde ; Bir üst sınıfa devam etmek için öğrencinin iki dönem puanının aritmetik ortalaması, her ders için 45,00’dan az olamaz. \n" +
                    "* İlkokullarda öğrencilere sınıf tekrarı yaptırılmaması esastır. Ancak; istenilen yeterlik düzeyine ulaşamamış ilkokul öğrencilerine, velinin yazılı talebi üzerine, ilkokul öğrenimi süresinde bir defaya mahsus olmak üzere sınıf tekrarı yaptırılabilir.\n" +
                    "* Eğitim ve öğretim yılında özürsüz 20 gün devamsızlık yapanlar ile herhangi bir dersten yıl sonu puanı 45’ten az olan öğrencilerin sınıf geçmesi veya sınıf tekrarına, ikinci dönemin son haftasında şube öğretmenler kurulunda karar verilir. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Gelişim raporu ile öğrenci karnesi", "* Okul Öncesi Eğitim Programı doğrultusunda hazırlanan çocuğa yönelik Gelişim Raporu, her dönem sonunda e-Okul sistemine işlenerek bir örneği veliye verilir. \n" +
                    "* Gelişim raporuna pedagojik olmayan ve gizliliği gerektiren bilgiler işlenmez. \n" +
                    "* İlköğretim kurumlarında öğrencilere, e-Okul sistemindeki bilgiler esas alınarak her dönem sonunda karne verilir. \n" +
                    "* Karnede, öğrencinin derslerdeki başarısı ile sosyal etkinlik çalışmaları ve okula devam durumu gösterilir. İlkokul karnesinde davranış ölçütlerine göre öğrencilerin gelişim düzeylerine de yer verilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İlköğretim kurumlarında sınıf yükseltme ", "* İlkokul 1, 2 ve 3 üncü sınıf öğrencilerinden bilgi ve beceri bakımından sınıf düzeyinin üstünde olanlar velisinin yazılı talebi, sınıf öğretmeninin önerisi ile eğitim ve öğretim yılının ilk ayı içinde sınıf yükseltme sınavına alınırlar. \n" +
                    "* Başarılı olanlar bir üst sınıfa yükseltilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretmenler kurulu", "* Ders yılı başlamadan önce, ikinci dönem başında ve ders yılı sonunda toplanır. Ayrıca okul müdürünün gerekli gördüğü zamanlarda ve kurul üyelerinin salt çoğunluğunun yazılı isteği doğrultusunda da kurul toplantısı yapılır.\n" +
                    "* Toplantı gündemi en az 5 gün önceden imza karşılığı öğretmenlere duyurulur ve öğretmenler odasına asılır.\n" +
                    "* Öğretmenlerinde görüşü alınarak hazırlanmalıdır. Kurul toplantısı ders saatleri dışında yapılır. Gerekli hallerde okul müdürü teklifi ilçe mem onayı ile ders saatleri içinde yapılır.Ayrıca kararlar oy çokluğu ile alınır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Zümre öğretmenler kurulu ", "* Zümre öğretmenler kurulu; okul öncesi eğitim kurumlarında okul öncesi eğitimi öğretmenlerinden, ilkokullarda aynı sınıfı okutan sınıf öğretmenleri ve varsa alan öğretmenlerinden, ortaokul ve imam-hatip ortaokullarında ise aynı alanın öğretmenlerinden oluşur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Şube öğretmenler kurulu ", "* Şube öğretmenler kurulu, ortaokul ve imam-hatip ortaokullarında aynı şubede ders okutan öğretmenler ile okul rehber öğretmeninden oluşur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretmenlerin mesleki çalışmaları ", "* Okul öncesi eğitim ve ilköğretim kurumlarında görevli yönetici ve öğretmenler temmuz ayının ilk iş gününe, eylül ayının ilk iş gününden derslerin başlangıcına kadar; yıl içinde ise yıllık çalışma programında belirtilen sürelerde mesleki çalışma yapar.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretmen", "* İlkokullarda sınıf öğretmenleri, okuttukları sınıfı bir üst sınıfta da okuturlar. Ancak istekleri yönetimce uygun görülmesi hâlinde başka bir sınıfı da okutabilirler. \n" +
                    "* İlkokullarda bütün derslerin sınıf öğretmenlerince okutulması esastır. Ancak Yabancı Dil ile Din Kültürü ve Ahlak Bilgisi dersleri okulun kadrolu alan öğretmenlerince okutulur.\n" +
                    "* Öğretmenlere, eğitim, öğretim ve yönetim görevlerinden başka bir görev verilemez.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Müdür yardımcısı ve öğretmenlerin nöbet görevi ", "* Müdür yardımcısı ve öğretmen sayısı yeterli olmayan okullarda müdür yardımcısı ve öğretmenlere haftada birden fazla nöbet görevi verilir. Öğretmen sayısı iki ve daha az olan uygulama sınıflarında bölüm şefi de nöbet tutar.\n" +
                    "* Öğretmen, birden fazla okulda ders okutuyorsa aylığını aldığı okulda, aylık aldığı okulda dersi yoksa en çok ders okuttuğu okulda nöbet tutar.\n" +
                    "* Okuldaki öğretmen sayısının yeterli olması durumunda, kadınlarda 20, erkeklerde 25 hizmet yılını dolduran öğretmenlere nöbet görevi verilmez. Ancak ihtiyaç duyulması hâlinde bu öğretmenlere de nöbet görevi verilebilir.\n" +
                    "* Hamile öğretmenlere, doğuma üç ay kala ve doğumdan itibaren bir yıl süre ile nöbet görevi verilmez. \n" +
                    "* Nöbet görevi, ilk ders başlamadan 30 dakika önce başlar, son ders bitiminden 30 dakika sonra sona erer. Ancak bu süre, okulun özelliğine göre öğretmenler kurulu kararıyla 15 dakikadan az olmamak kaydıyla kısaltılabilir. \n" +
                    "* Nöbet görevine özürsüz olarak gelmeyen öğretmen hakkında, derse özürsüz olarak gelmeyen öğretmen gibi işlem yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ödüller ve ödüllerin verilmesi ", "* İlkokul 4 üncü sınıf ile ortaokul ve imam-hatip ortaokullarının bütün sınıflarında puan ortalaması Türkçe dersinden 55.00, diğer derslerin her birinden 45.00 puandan aşağı olmamak şartı ile tüm derslerin dönem ağırlıklı puan ortalaması 70.00-84.99 olanlar \"Teşekkür\" , 85.00 puan ve yukarı olanlar \"Takdir\" belgesi ile ödüllendirilir\n" +
                    "* Çeşitli sosyal, kültürel ve sanatsal etkinliklerde üstün başarı gösteren öğrenciler \"İftihar Belgesi\" ile ödüllendirilir.\n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("29")) {

            list.add(new Card_Ozellikleri("MİLLİ EĞİTİM BAKANLIĞI ORTAÖĞRETİM KURUMLARI YÖNETMELİĞİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Ortaöğretim Kurumları", "* Fen liseleri,\n* Sosyal bilimler liseleri,\n* Anadolu liseleri,\n* Güzel sanatlar liseleri \n* Spor liseleri,\n" +
                    "* Anadolu imam-hatip liseleri,\n" +
                    "* Mesleki ve teknik Anadolu Liseleri,\n* Mesleki ve teknik eğitim merkezleri, \n* Çok programlı Anadolu liseleri,\n*Özel eğitim meslek liseleri,\n*Mesleki eğitim merkezlerinden,\n*Eğitim kampüslerinden;  oluşur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ders süresi ve günlük çalışma saatleri", "* Ortaöğretim kurumlarında bir ders saati süresi 40 dakikadır. \n" +
                    "* Öğretim yılı, ders yılının başladığı tarihten ertesi ders yılının başladığı tarihe kadar geçen süredir. \n" +
                    "* Ders yılı süresi 36 haftadır. \n" +
                    "* Dinlenme süreleri okul sürelerince belirlenir. İl çalışma takvimine uygun olarak okul zümre başkanlarından oluşan komisyon tarafından belirlenir. \n" +
                    "* Dersler arasındaki dinlenme süresi 10 dakikadan az, öğle arası 45 dakikadan az olamaz.Sadece ikili  öğretim yapan okullarda bu süreler biraz daha kısa belirlenebilir. \n" +
                    "* Dersler, zümre öğretmenlerinin önerisi ve okul müdürü olayı ile blok olarak yapılabilir. Ancak her blok ders, iki ders saati süresiyle sınırlıdır. \n" +
                    "* Okulda yapılan meslek dersi süresi 40 dk, işletmede yapılırsa 60 dakikadır. \n" +
                    "* Ders yılının süresi, derslerin başladığı günden kesildiği güne kadar okulun açık bulunduğu günlerle öğrencilerin törenlere katıldıkları resmî ve mahallî bayram günleri sayılarak hesaplanır. Bu tarihler göz önünde bulundurularak millî eğitim müdürlüklerince hazırlanacak çalışma takvimi valilik onayı ile yürürlüğe konur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Hazırlık Sınıfı", "* Hazırlık sınıfı olabilmesi için en az 12 öğrenci talep etmelidir. \n" +
                    "* Sosyal bilimler liselerinde hazırlık sınıfı açılır; ayrıca Bakanlıkça uygun görülen diğer ortaöğretim kurumlarında da hazırlık sınıfı açılabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ders Seçimi", "* Ders seçimi 2.dönemin ilk haftasında öğrencilere duyurulur. \n" +
                    "* Veli, Sınıf Öğretmeni, Rehberlik Öğretmeni ve Öğrenci tarafından şubat ayında seçim yapılır, E-okul’a işlenir ve Kitap seçim modülüne ihtiyaç girilir. \n" +
                    " * 9.sınıfa yeni başlayan öğrencilerin ders seçimi ve değişikliği ders yılının ilk haftası içinde yapılır. \n" +
                    "* Seçmeli ders en az 10 öğrenci talebi doğrultusunda yapılır. \n" +
                    "* Uygulamalı dersler imkanlar ölçüsünde birbirini izleyecek şeklide planlanır. \n" +
                    "* Teorik dersler öğleden önce, uygulamalı dersler ise öğleden sonra verilmeye çalışılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kayıt Şartları ve İşlemleri", "* Ortaöğretime kayıt yaptırabilmek için 18 yaşını bitirmemiş olmak gerekir.\n" +
                    "* Kayıtlar, öğrencinin e-Okul/e-Mesem sistemi veya denklik belgesindeki bilgilerine göre yapılır. Adres tespitinde ulusal adres veri tabanı ikamet adres bilgileri esas alınır. Öğrencilerden kayıt için başka belge istenmez.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrenci Yerleştirme ve Nakil Komisyonu", "Birden fazla ortaöğretim kurumu bulunan okullar arasında koordinasyonu sağlamak üzere millî eğitim müdürlükleri bünyesinde her ders yılı sonunda öğrenci yerleştirme ve nakil komisyonu kurulur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kontenjan Belirleme", "* Fen liseleri, sosyal bilimler liseleri, spor liseleri, güzel sanatlar liseleri, proje uygulayan eğitim kurumları ile Anadolu teknik programlarında bir şubeye alınacak öğrenci sayısı 30’dur.\n" +
                    "*  Spor liselerinde 9 uncu sınıfa her yıl alınacak öğrenci sayısı 5 şube, güzel sanatlar liselerinde ise her bir alana alınacak öğrenci sayısı 2’şer şube olması esastır. \n" +
                    "* Anadolu liselerinde, Anadolu imam hatip liselerinde, mesleki ve teknik Anadolu liselerinin Anadolu meslek programlarında, çok programlı Anadolu liselerinde bir şubeye alınacak öğrenci sayısının 34 olması esastır. Ancak öğrenci kayıt alanındaki öğrenci sayısının yoğunluğu ve zorunlu hâllerde okulun fiziki şartları da dikkate alınarak bu sayı 40’a kadar artırılabilir. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Devamsızlık, Geç Gelme ve İlişik Kesme", "* Geç gelme birinci ders saati için belirlenen süre ile sınırlıdır. Ancak her 5 defa geç kalma yarım gün devamsızlıktan sayılır.\n" +
                    "* Devamsızlık süresi özürsüz 10 günü, toplamda 30 günü aşan öğrenciler ders puanları ne olursa olsun başarısız sayılırlar. \n" +
                    "* Öğrencinin devamsızlık yaptığı süreye ilişkin özür belgesi veya yazılı veli beyanı, özür gününü takip eden  en geç 5 iş günü içinde okula bildirilmeli. \n" +
                    "* Zorunlu hallerde okul yönetimince özür belgesi teslimi 20 iş gününe kadar uzatılabilir. \n" +
                    " * Günlük toplam ders saatinin 2/3 ü ve daha fazlası 1 gün devamsızlıktan sayılır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Nakil ve Geçişler", "Nakil haftalık yapıldığında haftanın, aylık yapıldığında her ayın son iş gününde değerlendirilir. ", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Nakil ve Geçişler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Fen, sosyal bilimler, Anadolu ve Anadolu imam hatip liselerine nakil ve geçişler", "* Okulların her birinin kendi arasında ve fen liseleri ile sosyal bilimler liselerinden Anadolu liselerine her sınıf seviyesinde ve okullar arasında 10. sınıf öğrencileri için temmuz ayının sonuna kadar yapılır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Mesleki ve teknik Anadolu liseleri, mesleki ve teknik eğitim merkezleri ile çok programlı Anadolu liselerine nakil ve geçişler", "* Okulların her birinin kendi arasında veya okullar arasında alan/dal bulunmak kaydıyla her sınıf seviyesinde sürekli, alan/dal bulunmaması hâlinde 10. sınıfta alan, 11. sınıfta aynı alanda dal değiştirerek birinci dönem sonuna kadar,\n" +
                    "* Bu okulların dışındaki diğer okullardan bu okullara; 9 uncu sınıfta sürekli, 10 uncu sınıfta ise birinci dönem sonuna kadar, 10 uncu sınıf sonunda ise uygulamalı meslek derslerinden yaz tatili süresince yapılacak telafi eğitimine bağlı olarak Yönetmelikte belirtilen süre içerisinde yapılır. Aynı okul bünyesindeki program/alan/dallar arasında geçiş iş ve işlemleri bu fıkra kapsamında değerlendirilir.\n" +
                    "* Ortaöğretime yerleştirmeye esas puanla birlikte özel yetenek, mülakat, mülakat ve beden yeterliliği sınavıyla öğrenci alınan alanlar ile sağlık alanlarına diğer alan ve ortaöğretim kurumlarından nakil ve geçiş yapılmaz.\n" +
                    "* Bu okullara, akşam liselerinden nakil ve geçiş yapılmaz.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Ortaöğretim seviyesinde eğitim yapan askeri ve polis okullarından mesleki ve teknik ortaöğretim kurumu dışındaki diğer okullara nakil ve geçişler", "* Nakil ve geçiş şartlarını taşımaları kaydıyla birinci fıkranın (b) bendi, mesleki ve teknik ortaöğretim programı uygulayan okullara nakil ve geçişlerde ise ikinci fıkranın (b) bendi hükümleri uygulanır. Ancak bu okullardan Anadolu liselerine her sınıf seviyesinde nakil ve geçiş yapılır.\n" +
                    "* Uluslararası Bakalorya (IB) Programı uygulayan okullara, diğer okullardan nakil ve geçiş yapacak öğrenciler kontenjan dışı değerlendirilir.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Puanla Değerlendirme ", "85-100= Pekiyi \n" +
                    "70,00-84,99= İyi \n" +
                    "60,00-69,99 =Orta\n" +
                    "50,00-59,99 =Geçer\n" +
                    "0-49,99 = Geçmez\n" +
                    "Ortaöğrenimde en az 3 yıl boyunca bütün dönemlerde takdir alan,Üstün başarı belgesi alır. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınavlar", "* Sınavların şekli,sayısı,süresi; Zümre Öğretmenler Kurulunda belirlenir.\n" +
                    "* Haftalık ders saatine bakılmaksızın her dersten en az 2 sınav yapılır. \n" +
                    "* Zorunlu haller dışında sınav süresi 1 ders saatini aşamaz. \n" +
                    "* Bir günde zorunlu hâller dahil en fazla 3 yazılı ve uygulamalı sınav yapılabilir. Zorunlu hâl yoksa bir günde 2 sınavı geçmemek esastır.\n" +
                    "* Sınavların açık uçlu maddelerden oluşan yazılı yoklama şeklinde yapılması esastır. Ancak her dersin sınavlarından biri kısa cevaplı, doğru-yanlış, eşleştirmeli veya çoktan seçmeli testlerle de yapılabilir. \n" +
                    "* İşletmelerde ise beceri sınavı ders yılının son haftasında yapılır. \n" +
                    "* Sınav, Uygulama, Performans ödevi sonuçları sınavların yapıldığı tarihi takip eden 10 gün içinde öğrenciye duyurulur ve E-Okula işlenir. \n" +
                    "* Öğrenci velisi isterse 5 iş günü içerisinde yazılı olarak sınav sonuçlarına itirazda bulunabilir. \n" +
                    "* Okul yönetimi itirazı değerlendirip 5 gün içerisinde veliye bildirilir. \n" +
                    "* Her dönemde en az 1 performans, her ders yılında en az 1 proje hazırlamak zorundadır. \n" +
                    "* Öğrencinin bir dersten başarılı olması için ; İki dönem puanı Aritmetik ortalama en az 50 ya da birinci dönem ne olursa olsun 2.dönem notu en az 70 olması gerekir. \n" +
                    "* 3 dersten kalanlar Sorumlu olarak geçer, 6 dersten kalanlar sınıfta kalır. \n" +
                    "* Hazırlık sınıfında sınıf geçme, Türkçe ve 1.yabancı dil dersine göre değerlendirilir. Min. 70p \n" +
                    "* Okul birincileri ders yılı bitimini izleyen 5 iş günü içerisinde E-Okul’a işlenir. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Nöbetler", "* Nöbetler, öğretmenlere dersinin en az bulunduğu güne yazılmalıdır. \n" +
                    "* Nöbet görevi ilk dersten 30 dk.önce başlar,son ders bitiminden 30 dk.sonra biter.Bu süre Öğretmenler Kurulu kararıyla 15 dakikadan az olmamak kaydıyla kısaltılabilir. \n" +
                    "* Hamile öğretmenlere, hamileliğin 24.haftasından (6.ayından) itibaren ve doğumdan itibaren bir (1) yıl süre ile nöbet görevi verilmez. \n" +
                    "* İstekleri hâlinde hizmet yılı 20 yıldan fazla olan kadın öğretmenlerle 25 yıldan fazla olan erkek öğretmenler, nöbet görevinden muaf tutulabilirler. Ancak bu kapsamdaki öğretmen sayısının fazla olması nedeniyle nöbet görevinin aksaması durumunda bu öğretmenlere de nöbet görevi verilir.\n" +
                    "* Engelli öğretmenler ve engelli çocuğu bulunan öğretmenler nöbet görevinden muaf tutulur. Ancak, engelli öğretmenler ve engelli çocuğu bulunan öğretmenlerdenistekli olanların nöbetlerinin belirlenmesinde tercihlerine öncelik verilir.\n" +
                    "* Özel öğretim sınıflarında görev yapan özel eğitim öğretmenleri nöbet görevinden muaf tutulur.\n" +
                    "* Nöbetçi öğretmen çeşitli nedenlerden dolayı öğretmeni bulunmayan sınıfın düzenini ve öğrencilerin etüt çalışmasını yapmalarını sağlar.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurul, Komisyon ve Ekiplerin Oluşturulması", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Okullarda oluşturulacak kurullar", "* Öğretmenler kurulu\n" +
                    "* Sınıf veya şube öğretmenler kurulu\n" +
                    "* Zümre öğretmenler kurulu\n" +
                    "* Okul zümre başkanları kurulu\n" +
                    "* Okul öğrenci meclisi\n" +
                    "* Okul öğrenci ödül ve disiplin kurulu\n" +
                    "* Onur kurulu\n" +
                    "* Sosyal etkinlikler kurulu\n" +
                    "* Sayım kurulu\n" +
                    "Not: Okullarda ihtiyaca göre bilim, danışma, sanat, proje ve benzeri kurullar da oluşturulabilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Okullarda oluşturulacak komisyonlar", "* Kontenjan belirleme komisyonu,\n" +
                    "* Rehberlik hizmetleri yürütme komisyonu,\n" +
                    "* İhale komisyonu,\n" +
                    "* Muayene ve kabul komisyonu,\n" +
                    "* Kalite kontrol komisyonuyla diğer komisyonlar ilgili mevzuatı doğrultusunda kurulur ve görevlerini yürütür. \n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Okullarda oluşturulacak ekipler", "* Okul gelişim yönetim ekibi,\n" +
                    "* Sivil savunma ekipleri,\n" +
                    "* İş sağlığı ve güvenliği ekibi ve diğer ekipler ilgili mevzuatı doğrultusunda kurulur ve görevlerini yürütür.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrencilerin Ödüllendirilmesi ", "a) Teşekkür belgesi, (70,00-84,99) \n" +
                    "b) Takdir belgesi, (85-100) \n" +
                    "c) Onur belgesi, \n" +
                    "ç) Üstün başarı belgesi verilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrencilere Disiplin Cezaları", "* Kınama   (Okul müdürü kararı)\n" +
                    "* Okuldan kısa süreli uzaklaştırma    (Okul müdürü kararı)\n" +
                    "* Okul değiştirme   (İlçe öğrenci disiplin kurulunun kararı)\n" +
                    "* Örgün eğitim dışına çıkarma   (İl öğrenci disiplin kurulunun kararı)\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ödül ve disipline ilişkin iş ve işlemleri yürütmek üzere", "* Onur kurulu,\n" +
                    "* Okul öğrenci ödül ve disiplin kurulu,\n" +
                    "* İlçe öğrenci disiplin kurulu,\n" +
                    "* İl öğrenci disiplin kurulu,\n" +
                    "* Öğrenci üst disiplin kurulu oluşturulur.\n", Card_Ozellikleri.IKILI_BASLIK));

        } else if (isim.equals("210")) {

            list.add(new Card_Ozellikleri("MİLLİ EĞİTİM BAKANLIĞI EĞİTİM KURUMLARI SOSYAL ETKİNLİKLER YÖNETMELİĞİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Sosyal Etkinlikler Yönetmeliği", "* Sosyal etkinlik çalışmaları, öğrenci kulübü ve toplum hizmeti çalışmaları kapsamında yürütülür.\n" +
                    "* Her öğrenci, en az bir sanat veya spor dalında beceri kazanacak şekilde uygun bir öğrenci kulübü ile ilişkilendirilir ve bu kulübün çalışmalarına katılır.\n" +
                    "* Sosyal etkinliklerle ilgili gelir-gider iş ve işlemleri Okul Aile Birliği tarafından yürütülür.\n" +
                    "* Sosyal etkinlikler kurulunun etkinliklerle ilgili planlama ve kararları, eğitim kurumu müdürünün onayından sonra yürürlüğe girer.\n" +
                    "* Kurulun sekretarya işleri eğitim kurumu müdürlüğünce yürütülür.\n" +
                    "* Kurul, sosyal etkinlik başarı belgesi verilecek öğrencileri belirler, buna ilişkin listeyi eğitim kurumu müdürünün onayına sunar.\n" +
                    "* Çalışmalara katılan öğrencilere Sosyal Etkinlik Katılım Belgesi, çalışmalarda üstün gayret gösteren öğrencilere Sosyal Etkinlik Başarı Belgesi, katkı sağlayan öğretmen, veli, üniversite, kurum ve kuruluşlara ise eğitim kurumu müdürü tarafından Sosyal Etkinlik Teşekkür Belgesi verilir. \n" +
                    "* Açık öğretim okullarında öğrenim gören öğrencilerden ortaokul seviyesinde olanlar 15 yaşını, ortaöğretim seviyesinde olanlar 18 yaşını tamamlamamış olmak kaydıyla aynı düzeydeki istediği bir örgün eğitim kurumunda, yüz yüze eğitim alanlar ise bu eğitimi aldıkları eğitim kurumlarında isteğe bağlı olarak sosyal etkinliklere katılabilirler. Sosyal etkinlik çalışmalarında görev alacaklardan sertifika sahibi olanlara öncelik verilir.\n" +
                    "* Öğrenci kulüplerinin amaçları, çalışma esasları ve tanıtımına yönelik açıklamalar, eğitim kurumu yönetimi, sosyal etkinlikler kurulu, danışman öğretmenler ve sınıf/şube rehber öğretmenlerince yapılır.\n" +
                    "* Her öğrencinin en az 1 kulübe üye olması zorunludur.\n" +
                    "* Öğrencinin seçtiği kulüp, yaptığı çalışmalar ve belgeleri, e-Okul sisteminde yer alan Sosyal Etkinlik Modülüne işlenir.\n" +
                    "* Öğrencinin kulüp üyeliği, kulübe seçildiği öğretim yılıyla sınırlıdır.\n" +
                    "* Toplum hizmeti çalışmaları, gönüllülük esasına bağlı olarak Sosyal Etkinlikler Kurulunda alınan kararlar uyarınca danışman öğretmenin gözetim ve sorumluluğunda planlanır. Bu çalışmalar öğrenci kulüpleri, gönüllü öğrenci grupları, öğretmenler, veli ve ilgili diğer kurum ve kuruluşların katılımıyla yapılır.\n" +
                    "* Toplum hizmeti çalışmalarıyla ilgili giderler, okul-aile birliği gelirleri ile yapılan diğer aynî ve nakdî bağışlar yoluyla karşılanabilir.\n" +
                    "* Yapılacak toplum hizmeti çalışmaları, ilgili paydaşların görüşleri alınarak Sosyal Etkinlikler Kurulu tarafından belirlenir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Geziler", " * Sınıf veya şube rehber öğretmenleri, ders öğretmenleri veya danışman öğretmenlerce yapılması kararlaştırılan geziye ilişkin Veli İzin Belgesi  gezi öncesi görevli ve sorumlu öğretmenler tarafından alınır ve gezi dosyasına konur.\n" +
                    "* Eğitim kurumu gezilerinde; 1 kafile başkanı ve 40 öğrenciye kadar en az 1, en fazla 2 öğretmen görevlendirilir.\n" +
                    "* Sorumlu öğretmen sayısı, özel eğitime ihtiyacı olan öğrenciler için 10 öğrenciye kadar en az 2, okul öncesi eğitim kurumlarında her grup için en az 1 öğretmen olacak şekilde belirlenir. Ancak öğretim programının gerektirdiği veya öğretim programına dayalı protokol ya da proje kapsamında yapılan sosyal etkinliklere katılacak ilgili öğretmen sayısı ihtiyaca göre artırılabilir.\n" +
                    "* İmkânlar ölçüsünde sosyal etkinlikler kurulunca uygun bulunan velilerin de geziye katılımı sağlanır.\n" +
                    "* İl dışı ve yurt dışı gezilerde, okul öncesi çocukların velisi ile birlikte götürülmesi zorunludur. \n" +
                    "* Öğretim programları kapsamında yapılacak gezilerin ders saatleri içinde yapılmasına, diğer gezilerin ise dersleri aksatmayacak şekilde hafta sonu veya resmî tatil  ünlerinde düzenlenmesine özen gösterilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yarışmalar", "* Eğitim kurumu ve sınıf içi yarışmalar ile ilgili esaslar ve yarışma konuları, eğitim kurumu müdürünün başkanlığında ilgili kulüp danışman öğretmenlerinin de katılacağı sosyal etkinlikler kurulunca; okullar arası yarışma konuları ile yarışma esasları ise il/ilçe millî eğitim müdürlüklerince oluşturulan komisyonca belirlenir. Okullar arası yarışmalar, il/ilçe millî eğitim müdürlüklerinin bilgisi ve izni dışında düzenlenemez.\n" +
                    "* Zorunlu durumlarda temsil, yarışma ve benzeri etkinliklerde; en fazla 3 öğrenci için, sürücü ile birlikte bir öğretmenin rehberlik etmesi kaydıyla eğitim kurumunun yönetici ve öğretmenleri veya katılımcı öğrenci velilerinin adına kayıtlı 10 yaşından büyük olmayan,zorunlu mali sorumluluk (trafik) sigortası bulunan özel araçlarla  il sınırları içinde velinin yazılı izniyle taşıma yapılabilir. Buna ilişkin belgeler ilgili dosyada bulundurulur.\n" +
                    "* Uluslararası yarışmalarda; eğitim kurumlarında öğrenim gören öğrencilerden uluslararası bilim, kültür, güzel sanatlar, spor, halk oyunları ve beceri yarışmalarında bireysel veya ekip hâlinde derece alanlar ile bunların yetiştirilmesine katkı sağlayan personel ve eğitim kurumlarının ödüllendirilmesiyle ilgili iş ve işlemler, Millî Eğitim Bakanlığı Uluslararası Yarışmalarda Derece Alan Öğrencilerin Ödüllendirilmesine Dair Yönerge esaslarına göre yürütülür.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yayınlar", "* Eser inceleme ve seçme kurulu; Müdür ve müdür yardımcısının başkanlığında 2 öğretmen, ilgili sosyal etkinlikler öğrenci kulübü danışman öğretmeni ve temsilci öğrenciden oluşur. \n" +
                    "* Eser İnceleme ve Seçme Kurulunun yapmış olduğu inceleme, değerlendirme ve seçme işlemlerine ilişkin belgeler, yayımlanan eserlerin birer örneği ile duvar gazetelerinin kaldırılan nüshaları ilgili dosyasında 2 yıl süreyle saklanır.\n" +
                    "* Eğitim kurumu adına yayının sahibi, eğitim kurumu müdürüdür.\n" +
                    "* İlçe dışında yapılacak etkinliklerde eğitim kurumu müdürlüğü en az 3 gün önceden resmî yazıyla il/ilçe millî eğitim müdürlüğünü bilgilendirir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Katılım ve düzenlemeye ilişkin izin işlemleri ", "a) Okulda-İlçede-İlde etkinliklere; Eğitim Kurumu \n" +
                    "b) İl dışında etkinliklere; Mülki İdare Amirliği \n" +
                    "c) Yurt dışında etkinliklere; Valilik \n" +
                    "ç) Eğitim kurumu sosyal etkinliklerine; Eğitim Kurumu Müdürlüğü \n" +
                    "d) İlçe düzeyindeki sosyal etkinliklere; İlçe Milli Eğitim Müdürlüğü \n" +
                    "e) İl düzeyindeki sosyal etkinliklere; İl Milli Eğitim Müdürlüğü \n" +
                    "f) Birden fazla il katılacaksa ve Uluslar arası faaliyetlere; Bakanlılıkça izin verilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Müdürün görevleri", "* Müdür, sosyal etkinliklerin ilgili mevzuata uygun olarak EYLÜL ayında planlanmasından ve verimli olarak eğitim ve öğretim yılı içinde yürütülmesinden sorumludur.\n" +
                    "* Sosyal etkinlikler kurulunca eğitim kurumunda bir eğitim ve öğretim yılı süresince uygulanmak üzere eylül ayında hazırlanan Eğitim Kurumu Sosyal Etkinlikler Yıllık Çalışma Planı ve gelişen şartlara, oluşan istek ve ihtiyaçlara göre sosyal etkinliklerle ilgili sonradan yapılan ek planlamaları onaylar.\n" +
                    "* Sosyal etkinlikler kapsamında yapılan çalışmalara ilişkin düzenlenen Sosyal Etkinlik Katılım Belgesi, Sosyal Etkinlik Başarı Belgesi ve Sosyal Etkinlik Teşekkür Belgelerini imzalar.\n" +
                    "* Öğrenci kulübü ve toplum hizmeti ile ilgili örnek etkinlik çalışmalarını; eğitim kurumu panosu, gazete ve dergilerinde, gerektiğinde ilgili birimlerin resmî internet sayfalarında yayımlatabilir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf veya Şube Rehber Öğretmenin Görevleri ", "* Öğretmenler kurulunca belirlenen öğrenci kulüplerinin amaçları ve çalışmaları hakkında öğrencileri bilgilendirmek. \n" +
                    "* Öğrenci kulüplerine katılacak öğrencileri ilgi ve isteklerine göre belirlemek. \n" +
                    "* Belirlenen öğrencileri e-Okul sisteminde yer alan Sosyal Etkinlik Modülüne işlemek.\n" +
                    "* Öğrencilerin okul dışı etkinlikleri, kendi sınıf/şubesi ile birlikte yürüttüğü toplum hizmeti çalışmaları ve buna ilişkin belgeleri e-Okul Sistemi Sosyal Etkinlik Modülüne işlemek.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Danışman Öğretmenin Görevleri ", "* Kulüp ve toplum hizmetine katılan öğrenci listesini, Sosyal Etkinlikler Kuruluna vermek. \n" +
                    "* Kulübe seçilen öğrencileri kulübün amaçları ve çalışmaları hakkında bilgilendirmek.\n" +
                    "* Kulüp çalışmaları ile ilgili yazışmaları koordine etmek.\n" +
                    "* Öğrenci sosyal etkinliklerini ve buna ilişkin öğrencilere verilen belgeleri, e-Okul sisteminde yer alan Sosyal Etkinlik Modülüne işlemek.\n" +
                    "* Öğrencilerin sosyal etkinliklere katılmaları için Veli İzin Belgesinin alınmasını sağlamak.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğrenci kulübü temsilcisinin görevleri", "* Yapılacak faaliyetlerle ilgili görev dağılımını danışman öğretmene bildirir.\n" +
                    "* Kulüp çalışmalarıyla ilgili yazışmaları yapar, karar defterini tutar ve kulüp kapsamında yapılan çalışmalarla ilgili dokümanların dosyalanmasını sağlar.\n" +
                    "* İlkokullarda bu görevler, danışman öğretmen rehberliğinde yapılır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Diğer notlar", "* Törenlerin yürütülmesinden eğitim kurumu müdürü sorumludur. \n" +
                    "* Okullarda kutlanacak ulusal ve resmî bayramlar ile mahalli kurtuluş günleri; 29 Ekim Cumhuriyet Bayramı, 23 Nisan Ulusal Egemenlik ve Çocuk Bayramı, 19 Mayıs Atatürk'ü Anma ve Gençlik ve Spor Bayramı, 30 Ağustos Zafer Bayramı, Mahalli Kurtuluş Günleri.\n" +
                    "* Sosyal etkinlikler dosyası içerisinde; toplum hizmeti çalışmaları, ilgili kararlar ve tutanaklar ile birlikte öğrenci kulüplerinin toplantı karar defteri, evrak dosyası ve toplantı tutanakları bulunur.\n", Card_Ozellikleri.IKILI_BASLIK));
        }
        else if (isim.equals("211")) {

            list.add(new Card_Ozellikleri("MİLLİ EĞİTİM BAKANLIĞI ÖRGÜN VE YAYGIN EĞİTİMİ DESTEKLEME VE YERLEŞTİRME \n" +
                    "                                                    KURSLARI YÖNERGESİ\n", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Bilgi Notları", "* Kurslar, fizikî kapasitesi ve öğrenci/kursiyer potansiyeli yeterli olan resmî ortaokullar, imam-hatip ortaokulları, genel ilköğretim programı uygulanan özel eğitim ortaokulları, ortaöğretim kurumları ile halk eğitimi merkezi müdürlüklerine bağlı olarak açılır.\n" +
                    "* Kurs merkezleri ile kurslarda görevlendirilecek öğretmenler, yıllık planlanan kurslarda eylül ayının son haftasında, yaz dönemi kurslarında ise temmuz ayının ilk haftasında başlatılması esastır.\n" +
                    "* Örgün ve açık ortaöğretim kurumlarından mezun olanlara yönelik kursların halk eğitimi merkezlerince açılması esastır.\n" +
                    "* Açılan bir kursa, kurs açıldıktan bir ay sonrasına kadar öğrenci/kursiyer kaydı yapılabilir. Nakil, yurt dışından gelme gibi değişik nedenlerle okula kaydı yapılan öğrencilerin talepleri kurs merkezi müdürlüğünce değerlendirilir.\n" +
                    "* Yarıyıl tatili hariç ara tatillerde kurs yapılmaz.\n" +
                    "* Yaz döneminde açılan kursların süresi; 4 haftadan az 8 haftadan fazla, yıllık açılan kursun süresi ise 16 haftadan az 36 haftadan fazla olamaz.\n" +
                    "* Kurs dönemlerine göre programlanan kurs saatleri, kurs merkezinin imkânları ölçüsünde her bir kurs günü 2 saatten az, 8 saatten çok olmamak üzere planlanır. Derslerin 40’ar dakika olarak ayrı ayrı işlenmesi esastır.\n" +
                    "* Her bir kurs programına devam edecek öğrenci/kursiyer sayısının 10’dan az; bir kursun sınıf mevcudunun ise 24’den fazla olmaması esastır.\n" +
                    "* Kursların hangi gün ve saatlerde yapılacağını gösterir program ile program değişiklikleri kurs merkezi müdürlüklerince ilan edilir.\n" +
                    "* Açılan her bir kursta öğrenci/kursiyer sayısının; devamsızlık, nakil, kayıt silme ve benzeri nedenlerle 10’un altına düşmesi durumunda, kursun birleştirilmesinde veya kapatılmasında Milli Eğitim Müdürlüğünce karar verilir.\n" +
                    "* Öğrenci/kursiyer ve veliler ders seçimiyle birlikte öğretmen seçiminde de bulunabilirler.\n" +
                    "* Kurslarda görevlendirilecek kadrolu/sözleşmeli öğretmen sayısının yetersiz olması hâlinde millî eğitim müdürlüklerince aday öğretmen olarak atanabilme şartlarını taşıyanlar arasından ve/veya üniversite öğretim elemanlarından ek ders ücreti karşılığında ders okutmak üzere görevlendirme yapılabilir.\n" +
                    "* Kurslara kayıt yaptıran öğrencilerin/kursiyerlerin devamları zorunludur. Kurslarda okutulması gereken toplam ders saatinin özürsüz olarak 1/5’ine devam etmeyen öğrencilerin devamsızlık sınırını aştığı dersten kurs kaydı silinir.\n" +
                    "* Kurslar, kurs merkezi müdürlüğünce yönetilir. Kurslarla ilgili iş ve işlemleri yürütmek amacıyla 10 sınıfa/gruba kadar bir müdür yardımcısı, oluşturulan sınıfların/grupların 10’u geçmesi durumunda ikinci bir müdür yardımcısı daha görevlendirilir.\n" +
                    "* Öğrenci/kursiyerin devamsızlık yaptığı süreye ilişkin özür belgesi veya yazılı veli beyanı, özür gününü takip eden en geç 5 iş günü içinde kurs merkezi yönetimine velisi tarafından verilir ve kurs merkezi müdürlüğünce e-Kurs Modülüne işlenir. Zorunlu hallerde özür belgesinin teslim süresi kurs merkezi müdürlüğünce 10 iş gününü aşmamak üzere uzatılabilir.\n" +
                    "* Kurs onay işlemlerinden sonra e-Kurs Modülünden kurs onay çıktılarının il/ilçe millî eğitim müdürlüğüne onaylatmak.\n" +
                    "* Kurslarla ilgili olarak kurs merkezlerinde tutulacak defter ve dosyalar şunlardır;\n" +
                    " a) Öğrenci/kursiyer yoklama defteri\n" +
                    " b) Kurs ders defteri\n" +
                    " c) Gelen ve giden yazı dosyası\n" +
                    " ç) Kurs ders plânları dosyası\n" +
                    " d) Denetim defteri\n" +
                    "* Bu Yönerge kapsamında yapılan iş ve işlemler elektronik ortamda da yürütülebilir.\n", Card_Ozellikleri.IKILI_BASLIK));

        }
        else if (isim.equals("31")) {

            list.add(new Card_Ozellikleri("EĞİTİM ÖĞRETİMİN PLANLANMASI", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("A) PLAN", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a) Plânlı çalışmanın yararları", "1) Öğretimin planlanması, öğretmenin eğitim-öğretimde neyi, niçin ve nasıl okutacağını düşünmesini sağlayarak verimi arttırır.\n" +
                    "2) Konuların zamanını ve süresini düzenler.\n" +
                    "3) Planlı çalışma, öğretmen ve öğrencileri dağınıklıktan kurtarır, onlara güven kazandırır.\n" +
                    "4) Amaçları gerçekleştirecek en uygun yöntem, teknik, araç ve gereçlerin seçilmesini derslere hazırlıklı girilmesini sağlar.\n" +
                    "5) Planlama, öğrencilerin ilgi, ihtiyaç ve yeteneklerine göre yetişmesini sağlar.\n" +
                    "6) Planlı çalışma eğitim-öğretim değerlendirilmesinin sağlam ve güvenilir olmasını sağlar.\n" +
                    "7) Öğretmen ve öğrencilere düzenli ve birlikte çalışma alışkanlığı kazandırır.\n" +
                    "8) Eğitim faaliyetlerinde düşünceye açıklık kazandırır.\n" +
                    "9) Eğitim öğretim süreçlerine yön verir, uygulamanın tutarlılığını sağlar.\n" +
                    "10) Öğretmene yol gösterir. Öğretmen ve öğrencilerin öğretimi daha bilinçli yönlendirmelerini sağlar.\n", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("b) Plân yapmanın ilkeleri", "1) Planlar; çağdaş eğitimin gereklerine uygun olarak öğrenci merkezli, bireyselleşmiş öğretim, tam öğrenme, aktif öğrenme-öğretme ve disiplinler arası çalışmaları esas alan uygulunabailir etkinliklere dayalı olmalıdır.\n" +
                    "2) Plan; öğretim programlarında konuların işlenişinde kullanılacak; yöntem, teknik, araç, gereç, gezi, gözlem ve deneyler göz önünde bulundurulmalıdır.\n" +
                    "3) Her plan belli bir süreyi kapsamalıdır.\n" +
                    "4) Plan; öğretimin seviyesine, konuya, öğretim dalına ve amacına uygun olmalıdır.\n", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("c) Plân çeşitleri", "Eğitim-öğretim çalışmalarında ünitelendirilmiş yıllık plân ve ders plânı olmak üzere iki çeşit plân hazırlanır.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Plân çeşitleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Ünitelendirilmiş yıllık plân ", "Ünitelendirilmiş yıllık plan, öğretim yılı süresince ders vermekle yükümlü olunan sınıflarda, program uyarınca belli üniteleri ya da konuları hangi aylarda ve yaklaşık ne kadar zamanda işleyeceklerini gösteren duruma göre zümre öğretmenler kurulu ya da şube öğretmenler kurulu tarafından ortak hazırlanarak ders yılı başında okul yönetimine verilen çalışmadır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Ünitelendirilmiş yıllık plânın yapılışı ", "a) Zümre öğretmenler kurulu ve şube öğretmenler kurulunda gezi, gözlem, inceleme, deney, ödev ve değerlendirme çalışmalarının belli hafta veya günler de toplanıp toplanmadığını araştırılır, bu konuda ortak önlemler alınmasını sağlanır.\n" +
                    "b) Öğretmenler geçmiş yıllardaki uygulamaları da gözden geçirerek okulun durumuna göre plânlarını, kendileri veya zümre öğretmenler kurulu ya da şube öğretmeler kurulundaki diğer öğretmenlerle beraber yaparlar.\n" +
                    "c) Hazırlanan plân okul müdürüne öğretim yılının başlamasından itibaren 15 gün içinde onaylattırılır.\n" +
                    "d) Öğretmen, ünitelendirilmiş yıllık plânın onaylanmış bir örneğini yararlanmak üzere yanında bulundurur. \n" +
                    "e) Öğretmenler, özel eğitim gerektiren çocukların ihtiyaçları ve öğrenme hızları doğrultusunda BEP geliştirme birimi ile iş birliğine giderek plânlarını gücleştirirler. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Ders plânı ", "Bir ders için o dersle ilgili eğitim programlarında yer alan ve birbirleriyle ilişkili öğrenci kazanımlarını bir ya da birkaç ders saatinde işlenecek konu örüntüsünü, konuya ilişkin deney, tartışma soruları, proje ve ödevleri, uygulama çalışmalarını, ders araç-gerecini içine alan birinci derecede sorumlu olduğu, zümre öğretmenleri ile şube öğretmenlerinin ortak katkısıyla ders öğretmenlerince önceden hazırlanan plândır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Ders plânının hazırlanması ", "a) Dersin doğası ve öğretim basamağındaki diğer derslerle olan ilişkisi, \n" +
                    "b) İşlenecek konu örüntüsü, \n" +
                    "c) Öğrencinin kazanımları ve hedef davranışları, \n" +
                    "d) Konunun işleneceği tarih ve olası süre, \n" +
                    "e) Konunun en etkin biçimde işlenebilmesi için gerekli olan eğitim araç-gereç ile başvurulacak kaynakları, \n" +
                    "f) Öğrenme-öğretme süreçlerine yönelik etkinlikler, gerekiyorsa güvenlik önlemleri, deney ve gözlemi, \n" +
                    "g) Konunun işleneceği sınıftaki öğrencilerin bireysel özellikleri ve farklılıklarının öğretim sürecinde göz önünde bulundurma, \n" +
                    "h) İhtiyaçlarını belirleme ve öğrenme-öğretme yaşantılarında değerlendirme süreci, \n" +
                    "i) Öğrenme-öğretme sürecini değerlendirmeye yönelik ölçme etkinlikleri ve değerlendirme yaklaşımı saptanır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5) Ortak hükümler ", "a) Her öğretmen istenildiğinde ünitelendirilmiş yıllık plân ve günlük ders plânını okul müdürü ile denetleme yetkisi olanlara göstermek zorundadır.\n" +
                    "b) Okul müdürleri öğretmenlerin çalışmalarında bu Yönerge esaslarına uyup uymadıklarını denetler.\n" +
                    "c) Ünitelendirilmiş yıllık plân ve günlük ders plânları, okulun yöneticileri, zümre öğretmenleri, şube öğretmenleri ve ders öğretmenlerinin ortak katkılarıyla hazırlanır. Günlük plânların tek tip olması zorunlu değildir.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("B) DERS PLANI HAZIRLAMA AŞAMALARI", null, Card_Ozellikleri.UST_BASLIK));

            list.add(new Card_Ozellikleri("a) Hazırlık Basamağı", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Dikkat çekme", "* Öğrenme dikkatle başlar. Sınıfta öğrencilerin duyu organlarına çok sayıda uyarıcı gelir. Bu uyarıcılardan kendine uyan, ihtiyacını karşılayanlardan birine zihinsel olarak odaklaşır. Bu zihinsel olaya dikkat adı verilmektedir. \n" +
                    "* Duyu organlarına gelen bir uyaranın şiddeti (yüksek ses, renk vb.) dikkati etkiler. Öğrenme etkinliklerinin düzenlenmesinde yapılan ve öğrenciye ilginç gelebilecek uygulamalar dikkatin çekilmesi ve sürdürülmesini sağlar. Öğrencilerin dikkatleri üç değişik biçimde çekilebilir:\n" +
                    "a) Sözel uyarıcılar: Öğrencilerin gelişim özelliklerine, kazandırılacak davranışlara göre derse giriş yaparken konuyla ilgi kurulabilecek günlük bir örnek olay, anı, fıkra anlatılabilir. Bir problem durumundan söz edilebilir.\n" +
                    "b) Görsel uyarıcılar:  Konu ile ilgili bir afiş, tepegözle yansıtılan bir ilginç bir şekil, grafik, şema veya slayt gösterimi ile derse başlanabilir. \n" +
                    "c) Görsel ve sözel uyarıcılar: Hem görsel hem de sözel uyarıcılar bir arada sunulabilir. Bunu için dramatizasyon, oyun rol oynama yöntemleri kullanılabilir, sesli ve görüntülü video filmler gösterilebilir. Gösterilen film veya slaytlar en can alıcı yerlerinden kesilerek sorularla öğrencilerin dikkatleri çekilebilir. Bu etkinliklerin süresi 4,5 dakikayı geçmemelidir. Görsel ve sözel uyarıcıların aynı anda kullanılması diğerlerine göre daha dikkat çekicidir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Güdüleme", "* Bir Fransız atasözünde bu şöyle anlatılır; “Bir atı suya zorla götürebilirsiniz ama ona zorla su içiremezsiniz.” Eğer karşınızdakinde öğrenme isteği yoksa ona hiç bir şey öğretemezsiniz. \n" +
                    "* Öğrenme öğrenen merkezlidir. Dolayısıyla öğrenme sürecinin etkin düzenlenebilmesi öğrenenin aktif katılımına bağlıdır. Öğrencilerin başarılarını etkileyen başlıca nedenlerden biri de konuya ilgi duymamalarıdır. Öğretmen dersin ilk dakikalarında bir şekilde öğrencilerin konuya ilgili olmasını sağlamalıdır. \n" +
                    "* İşlenecek konuyla ilgili olarak öğrencilerin bildikleri bilgilere zıt fikirler ortaya atılarak bir problem durumu oluşturulabilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Gözden geçirme (Hedeften haberdar etme)", "* Öğrenciler dersin sonunda ne öğreneceklerini başta bilirlerse onu elde etmek için düzenlenen etkinlikleri takip eder ve bu etkinliklere isteyerek katılırlar. Bu amaçla ders sonunda öğrencilere duyurulur. \n" +
                    "* Ancak dersin hedefleri ile ilgili olan bu öğrenmeleri öğrencilerin anlayacağı bir şekilde somut olarak ortaya koymak gerekir. Hedefin, öğrencilerin anlayabileceği somutlukta ifade edilemediği durumlarda motive edici olmazlar. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Geçiş (Öğrenilenler arasında ilişki kurma)", "* Her yeni öğrenme bir önceki öğrenmeye dayalı bir sonraki öğrenmeye basamak oluştur. Öğretmenin yeni bilgileri verirken önceki öğrenmelerden hareket etmesi öğrenmeyi kolaylaştırır ve öğrenmede süreklilik sağlar. \n" +
                    "* Bu amaçla öğretme öğrenme etkinlikleri düzenlenirken öncelikle öğrencilerin konuyla ilgili ön şart öğrenmelerinin düzeyi bilinmeli, öğretim etkinlikleri her öğrencinin bulunduğu seviyeden hareket edilerek düzenlenmelidir. \n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("b) Sunu Basamağı", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) İçeriği sunma", "Karmaşık bilgileri anlamlı küçük parçalara bölünerek öğrencilere verilmesi bilginin daha kolay özümsenmesine yardımcı olur. Bilgilerin verilme hızı öğrencinin öğrenme hızını aşmamalıdır. Hızlı bilgi sunumu öğrencilerin bilgiyi işleme kapasitelerini aşacağından anlama olmaz ve öğrenme sürecinden kopmalar meydana gelir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Ara özet", "Derste ara özetlemeler ve ders sonu genel özetleme olmak üzere iki tür özetleme yapılır. Ara özetlemeler, sunulan her konunu (her küçük adımın) arkasından yapılır. Özetleme belirli bir periyotta ve giderek artan bir aralıkta sonraki derslerde de yapılmalıdır. Araştırmalar aralıklı yapılan özetlerin bilgilerin hafızada kalma süresini artırdığını göstermiştir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Tekrar yapma", "Tekrar öğrenilenlerin daha uzun süre hafızada kalmasına yardımcı olur. Ders süresince verilen bilgiler zaman zaman tekrarlanmalıdır. Özellikle zor konuların kavranmasında ve becerilerin kazandırılmasında tekrar gereklidir. İnsan bir beceriyi tekrarlamadan öğrenemez. Tekrar belirli zamanlarda değil dersin değişik zamanlarında yapılmalıdır. Konu niteliğine ve öğrenenin yeteneklerine bağlı olmakla beraber, ara sıra yapılan tekrarlar sık sık yapılanlara göre daha etkilidir.\n" +
                    "\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("c) Uygulama Basamağı ", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Genellemeler yapma", "Verilen örneklerin yaşamdan, öğrencinin çevresinden alınması öğrendikleri bilgileri karşılaştıkları durumlara daha kolay uygulamalarını sağlar. Örneklerin birbirinden farklı olması genellemelerini kolaylaştırır. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Dikkati sürdürme", "Öğrencilerin dikkatleri uzun süreli değildir. Ders süresince dikkatler çeşitli iç ve dış faktörler nedeniyle dağılabilir. Düz bir anlatımla öğrencilerin dikkatleri uzun süreli olmaz. Dikkatte süreklilik sağlamak için farklı öğretim etkinlikleri düzenlemek gerekir. Öğretim etkinliklerini çok iyi plânlamalıdır. Ayrıca, dersini sunarken, öğretim etkinliklerini öğrencilerin ilgilerini çekecek şekilde düzenlemeli, öğrenciyi aktif yapan birden çok yöntem ve tekniği bir arada kullanarak çoklu bir öğrenme ortamı oluşturmalı, dersini öğretim materyalleriyle zenginleştirmelidir. ", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Alıştırmaları planlama", "Alıştırma bir ölçme ve değerlendirme etkinliği olmadığı için dersin sonunda yapılmamalıdır. Alıştırma, dersin sunuşunda her bilgi biriminden sonra öğrencilerin, öğrendikleri bilgiyi uygulayabilecekleri bir durumu ifade eder. Bu şekilde öğrencilere öğrendikleri bilgiyi uygulama fırsatı verilerek hem bilgileri kalıcı hale getirilir, hem de eksik ve yanlışlıklarını görmesi sağlanarak kendisine düzeltme imkanı tanınmış olur. Yapılan alıştırmalarla öğrenilen bilgiler daha uzun süre bellekte kalırlar. Resim, Beden Eğitimi, Müzik gibi becerileri geliştirmeye yönelik ders alanları ile deney ve problem çözümü gibi konularda da bu bölüm daha detaylı düzenlenir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Geri bildirimleri planlama", "Öğrenciler yaptıkları alıştırmalar ve verdikleri cevaplarla ilgili öğretmenin tepkisini bilmek, görmek isterler. Öğrenciler neyi doğru neyi yanlış yaptıklarını bilmesi yeni öğrenme ve alıştırmalarında daha dikkatli davranmalarına yardımcı olur. Geri bildirimler öğrenciyi kırıcı olmamalı, onları  öğrenmeye güdülemelidir. Sınıf içinde öğrencilere sürekli geri bildirimlerde bulunmak dikkat ve öğrenme isteğine süreklilik kazandırır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("d) Ölçme ve Değerlendirme Basamağı", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Son Özet", "Bu bölüme kadar bir ders saati içinde sunulması planlanan konunu sunumu, uygulama ve alıştırmaları, geri bildirim ve düzeltmeleri yapılmıştır. Son bir özetleme ile dersin ana noktaları vurgulanır, burada dersin hedefi ile dersin ana noktaları arasındaki ilişkiyi öğrencinin görmesi sağlanır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Düzey Belirleme", "Değerlendirme çalışmaları öğrencilerin düzeylerinin belirlenmesi amacıyla da kullanılabilir. Bu amaçla alınan dönütler gözlem formlarına işlenerek öğrencilerin başarı gelişimleri, eksikleri izlenebilir. Davranışlara istenilen düzeyde ulaşılamaması durumunda, düzeltme işlemleri; \n" +
                    "a) Öğretme öğrenme durumunun tekrarı,\n" +
                    "b) Bireysel öğrenme ile eksikliği tamamlama\n" +
                    "c) Öğrenme-öğretme durumunu düzeltme şeklinde yapılır. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Tekrar Güdüleme", "Dersin sonunda öğrencilere sonraki öğrenmeleri için istek uyandırılır. Güdülemedeki temel amaç sonraki öğrenmeler için ilginin devamlılığını sağlamaktır.", Card_Ozellikleri.ALT_BOLUM));

        }
        else if (isim.equals("32")) {
            list.add(new Card_Ozellikleri("ÖĞRENME ORTAMLARI", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri(" Öğretim Yapma", "1) Dikkat çekme ve ilgi.\n" +
                    "2) Önceden öğrenilenlerle konu alanı arasında bağ kurmak.\n" +
                    "3) Öğrencinin ihtiyacı ile konu alanı arasında bağ kurmak.\n" +
                    "4) Öğrenciye amaçlara ulaşma yollarını bildirmek.\n" +
                    "5) Öğrenciye dersin amacını bildirmek.\n" +
                    "6) Öğrencileri öğretim etkinliğine katmak.\n" +
                    "7) Alan uzmanına bilgi sunudurmak.\n" +
                    "8) Dersi özetlemek.\n" +
                    "9) Dersi değerlendirmek ve eksikleri, yanlışları gidermek.\n" +
                    "10) Öğrenciyi bir sonraki derse hazırlamak.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri(" Çeşitli Öğretim Yöntemleri", "* Gözlem gezisi yoluyla öğretim yapmak\n" +
                    "* Ödev vermek\n" +
                    "* Oyun yöntemini kullanarak öğretim yapmak\n" +
                    "* Proje yöntemiyle öğretim yapmak\n" +
                    "* Ekiple öğretim yapmak\n" +
                    "* Deneysel öğretim yapmak\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretimi Yönetme", "1) Öğrencilerin kendilerini ifade edebilecekleri bir ortam oluşturmak.\n" +
                    "2) Olumlu ve olumsuz davranışları ve uygulanacak kuralları belirlemek.\n" +
                    "3) Öğrencileri olumlu davranış yönünde motive etmek.\n" +
                    "4) Olumsuz davranışı oluşturan durumu iyileştirmek.\n" +
                    "5) Öğretim ortamını düzenlemek;\n" +
                    "a) Psikolojik ortam: Eğitim-öğretimde sınıfın iklimi, havası diye bilinen psikolojik ortam, bütün durum ve çalışmalardan etkilenen ve onları etkileyen bir özelliğe sahiptir. Dershanenin yapısı, iyi döşenmiş olması, rahatlığı, bakımlı olması, öğrenci, veli ve öğretmende ferahlık sağlar. Böylece sınıf, çğrenci, veli ve öğretmen için çekici hale gelir.\n" +
                    "b) Fizyolojik ortam: Öğrencilerin başarısına doğrudan etki eden fiziki ortamı etkileyen faktörler; Öğrenci sayısı, yerleşme ve oturuş düzeni, aydınlatma, ısıtma, gürültü, temizlik, araç-gereç durumu, sınıfın boyası ve görünümü.\n" +
                    "c) Sosyal ortam\n" +
                    "6) Sınıfta öğretim ortamı oluşturmak.\n" +
                    "7) Zamanı yöneltme ve öğrencilerin hızına göre öğretimi ayarlamak.\n" +
                    "8) İletişim düzeni kurmak.\n" +
                    "9) Öğrenci devamını kontrol etmek.\n" +
                    "10) Öğrencileri birbirine kaynaştırma ve belirli amaçlar yönünde güdülemek.\n" +
                    "11) Öğrenci ve öğrenci gruplarının sorunlarının çözümüna yardımcı olmak.\n" +
                    "12) Öğrencilerin liderlik özelliklerini geliştirmek.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretim Araç-Gereçlerini Seçerken;", "* Öğretim yöntemi\n" +
                    "* Öğretim hedefleri\n" +
                    "* Öğrenci özellikleri\n" +
                    "* Öğretim ortamı\n" +
                    "* Araçların özellikleri\n" +
                    "* Gereçlerin tasarım özellikleri\n" +
                    "* Öğretmenlerin rurumları, becerileri\n" +
                    "* Maliyet, zaman ve elde edebilme\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıfta Sıraların Düzenlenmesinde Kullanılan Başlıca Yaklaşımlar", "* Geleneksel sınıf yerleşimi\n" +
                    "* Bireyselleştirilmiş sınıf yerleşimi\n" +
                    "* Tek gruplı yerleşim düzeni\n" +
                    "* Çok gruplu yerleşim düzeni\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İyi Bir Plan ", "Öğrenci merkezli, uygulanabilir etkinliklere yer verir. Çevresel ve bireysel farklılıkları dikkate alır. Esnek bir yapıya sahiptir. Uygun yöntem ve teknikler içerir.", Card_Ozellikleri.IKILI_BASLIK));
        }
        else if (isim.equals("33")) {

            list.add(new Card_Ozellikleri("SINIF YÖNETİMİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Sınıf Yönetiminin Amaçları", "* Zamanın etkili bir biçimde kullanabilmesini sağlamak.\n" +
                    "* Öğrencinin derse devamsızlığını en aza indirgemek.\n" +
                    "* Sınıf kurallarını belirleyip öğrencilere benimsetmek ve uygulatmak.\n" +
                    "* Sınıfta öğrencide motivasyonu sağlamak.\n" +
                    "* Sınıfta etkili bir iletişim ortamı oluşturmak.\n" +
                    "* Sınıf yaşamının kolaylaştırılmasına yönelik öğrenci-öğrenci, öğrenci-öğretmen ilişkilerini düzenlemek.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf Yönetiminin Boyutları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Boyut (Fiziksel Düzen)", "Sınıf alanının büyüklüğü, öğrenci sayısı ve oturma düzeni önemlidir. Isı, ışık, ses, renk ve havalandırma düzenleri sınıf yönetimini doğrudan etkiler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Boyut (Plan ve Program Etkinlikleri)", "Plandaki etkinliklerin öğretmen merkezli veya öğrenci merkezli oluşu sınıf yönetimini etkiler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Boyut (Zaman Düzenleme)", "Öğretmenler ders esnasında, öğrencilerin dinlenmesi, düşünmesi veya eğlenmesi için mola zamanı oluşturur. Ayrıca öğrencilerin teneffüs hakkı elinden alınmamalıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Boyut (İlişki Düzenleme)", "Öğretmen – öğrenci ve öğrenci – öğrenci ilişkileri mantıklı, demokratik ve insani kurallarla belirlenmelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5. Boyut (Davranış Düzenleme)", "Davranışlar olumlu veya olumsuzdur. Olumsuz davranışlar hem ortaya çıkmadan önce önleyici tedbirlerle hemde çıktıktan sonra yapılacaklarla düzenlenir.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınıf Yönetiminin Öğeleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a. Sınıf Liderliği", "Öğretmenin etkili bir lider olması; öğrencilerle iletişim kurma ve öğrenciyi motive etme becerisine sahip olmasıyla mümkündür. Öğretmenin Liderlik tarzları, onun kişisel özelliklerinin bir yansımasıdır. Öğretmenin, emreden, sert, teşvik edici, yumuşak, dikkatli, şakacı, serbest bırakmayı seven vb. öğrencilerin yetenekleri onun liderlik tarzını belirler. Öğretmen otoriter, demokrat ya da vurdumduymaz bir lider olabilir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b. Sınıf Atmosferi", "Sınıfın fiziksel ve psikolojik çevre düzenlemesiyle ilgilidir. Sınıf çevresi öğrenci davranışı üzerinde doğrudan etkilidir. Çekici bir sınıf atmosferi öğrencileri öğrenmeye yönlendirir. Öğretmen psikolojik açıdan, sınıfta güven veren bir ortam oluşturmalıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("c. Disiplin", "Ceza kavramı ile asla karıştırılmamalıdır. Ceza yıkıcı davranışa tepkidir. Disiplin ise; yıkıcı davranış ve bundan doğan tepkiyi önlemek içindir", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınıf Ortamının Değişkenleri", "* Kural ve beklentilerin açıklığı\n" +
                    "* Ödül ve teşvik\n" +
                    "* Öğretebilme yeteneği\n" +
                    "* Yüksek beklentiler\n" +
                    "* Öğrencilerin derse katılımını sağlama\n" +
                    "* Okul – Aile ilişkileri\n" +
                    "* Grup normları\n" +
                    "* Öğretmenlerin kendi aralarındaki ve yönetimle ilişkileri\n" +
                    "* Fiziksel Çevre\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf Dışı Değişkenler", "* Çevre\n" +
                    "* Aile\n" +
                    "* Okul\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf İçi Değişkenler", "a. Fiziksel Ortam\n" +
                    "b. Eğitim Programları\n" +
                    "c. Kaynaklar/Araç ve Gereçler\n" +
                    "ç. Zaman Yönetimi\n" +
                    "d. Sınıfın Kuralları\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sınıf içi Motivasyon Stratejileri", "1) Öğrencilerin İlgilerini Anlayabilme\n" +
                    "2) Konunun Kullanabilirliğini Açıklama\n" +
                    "3) Öğrencilerin Başarı Beklentisi Geliştirmelerine Yardımcı Olma\n" +
                    "4) Dersi İlginç Hale Getirme\n" +
                    "5) Öğrencilerde İstek Uyandırma\n" +
                    "6) Ödüller Kullanma\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretmenler ve Öğrenciler Arasındaki İlişki Tipleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Otoriter Öğretmen", "Otoriter bir sınıfta, öğretmen kendini etkin rolde tek başına görür ve öğrencileri açıklama ve bilgileri alan pasif alıcılar olarak düşünür. Otoriter öğretmenler katı uygulamaları denetim merkezli yaparlar. Öğrencilerin etkinliklerini yakından yönlendirirler. Sınıfları için planlamayı yaparlar ve emredici davranırlar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Muhalefetsiz Öğretmen", "Öğrenciler ne yapmak istediklerine ve nasıl yapacaklarına karar verirler. Muhalefetsiz öğretmenler karşıt uçlara giderler. Öğrencilerin seçimlerine ve etkileşimlerine karışmamayı taahhüt ettiklerinden, öğrenci yönlendirmesi ve ders planlamasından kasıtlı olarak çekinirler, böylece gerçekten hiçbir şekilde liderlik etmezler. Sınıftadırlar ve soruları yanıtlayabilirler. Fakat gerekli olarak öğrencilerin kendi önceliklerini izlemelerine izin verirler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Demokratik Öğretmen", "Demokratik öğrenme-öğretme durumunda öğretmenler demokratik grup liderleri rolündedirler. Ana amaçları öğrettikleri alanda önemli sorunların çalışmasında öğrencilere liderlik etmektir. Öğretmenin düşünceleri öğretmen ve öğrenci eleştirisine bağlıdır. Bu şekilde hem öğretmen hem öğrenci öğrenir.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("İstenmeyen Davranışların Önlenmesine Yönelik Yaklaşımlar", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) İnsancı (Karışmacı Olmayan) Yaklaşım", "Bu yaklaşımın temelinde insanın doğru yapacağına inanmak ve güvenmek vardır. Öğrencinin iyi niyetli ve güvenilir olduğunu, kendini kontrol etmesi gerektiğini ve uygun bir fırsat  verildiğinde bunu yapabileceğini varsayar. Eğer insan yanlış yapıyorsa bunu düzeltmek için dış etkenlerden  çok insanın iç dünyasındaki anlayış ve kavrayışı uyandırarak kendi kendine doğruya ulaşmasını sağlanmalıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Pazarlık Yaklaşımı", "“Her şeyin bir bedeli vardır.” anlayışına dayalıdır. Öğrenci sınıfta istenmeyen bir davranışta bulunursa sorumluluğunu almak ve sonuçlarına katlanmak zorundadır. Öğretmen istenmeyen davranışları değiştirmek ve düzeltmekle görevlidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Davranışçı Yaklaşım", "Bu yaklaşım temelinde davranışçı ekol vardır. Yaklaşım, sınıfta istenmeyen davranışların değiştirilmesine dayanır. İstenmeyen davranışların oluşmasına göre farklı stratejiler kullanılır. Bunlar, sorun davranışı gözlemlemek, pekiştireç vermek, istenmeyen davranışı söndürmek, öğrencilerle anlaşmak, yaklaşık istendik davranışları kabul etmek ve derse dönmektir. ", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Pekiştireç", "    İstendik davranışın arkasından verilen ve davranışın artmasını ya da kalıcı olmasını sağlayan herhangi  bir uyarıya pekiştireç denir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Pekiştirme", "    İzlediği davranışın gerçekleşme olasılığını arttıran veya davranışın sürmesini sağlayan uyaranların ortama eklenmesi veya çekilmesi sürecine pekiştirme denir.", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("Pekiştirme", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Olumlu pekiştirme", "Br davranışı izleyen ortamda bir uyarının eklenmesiyle o davranışın ilerde yapılma olasılığının artmasıdır. Gülümsemek, aferin demek, para vermek, şeker vermek v.b.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Olumsuz pekiştirme", "Bir davranışı izleyen durumda ortamda bir itici uyaranın çekilmesiyle o davranışın ilerde yapılma olasılığının artmasıdır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Pekiştireç Türleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Birincil Pekiştireçler (Öğrenilmemiş Pekiştireçler)", "Doğal yaşamı sürdürmek için gerekli olan ve biyolojik önem taşıyan yiyecek, içecek, barınma, uyku gibi uyaranlar olup, öğrenme olmadan edinirler. Daha çok okul öncesi dönemde kullanılırlar. Eğitim düzeyi arttıkça kullanılabilirlikleri azalmaktadır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. İkincil Pekiştireçler (Öğrenilmiş Pekiştireçler)", "Öğrenme sonucunda pekiştirici özellik kazanmış pekiştireçlerdir. Yaşamsal bir önem taşımamalarına rağmen davranışların arttırılmasında ve sürdürülmesinde etkili biçimde kullanılabilirler. Birincil pekiştireçlerle kullanımı sonucu tek başlarına pekiştireç olma özelliği kazanabilirler\n" +
                    "I. Nesnel Pekiştireçler: Eşya, yiyecek, oyuncak ya da araç-gereç ve materyaller v.b.\n" +
                    "II. Etkinlik Pekiştireçleri: Şarkı söylemek, yap-boz oynamak, şiir okumak, tv izlemek gibi sözel ya da bedensel bir uğraşı gerektiren pekiştireçlerdir.\n" +
                    "III. Sosyal Pekiştireçler: Gülümsemek, alkışlamak, baş ile oynamak, göz kırpmak gibi sözsüz ifadeler; kucaklamak, başını oksamak, yüzüne dokunmak gibi bedensel iletişim; sosyal ortamlarda yakınlık ve övgü içeren sözcükler sosyal pekiştireçlerdir.\n" +
                    "IV. Sembol Pekiştireçler: Kendi başlarına anlamı olmayan ama başka pekiştireçlere dönüştürülebilne sembollerdir. Para, gazete kuponları, jeton, marka v.b.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınıfta Disiplin Sağlama", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Disiplin Sorunu Çıkmasını Önleyici Yöntemler", "a. Planlı çalışmak\n" +
                    "b. Akıcı etkinlik\n" +
                    "c. Tutarlılık\n" +
                    "ç. Öğretmen kontrolü\n" +
                    "d. Kurallar belirlemek\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Disiplin Sorununa Tepki Yöntemleri", "a. Görmezlikten gelmek\n" +
                    "b. Fiziksel yakınlık\n" +
                    "c. Göz teması ve sözsüz uyarıcılar kullanmak\n" +
                    "ç. Yeniden yönlendirmek\n" +
                    "d. Vazgeç ifadeleri ve uyarıcılar kullanmak\n" +
                    "e. Güçlü vazgeç ifadeleri kullanmak\n" +
                    "f. Öğrenciyi yalnız bırakmak veya yerini değiştirmek\n" +
                    "g. Sözel azarlama ve mesajlar vermek\n" +
                    "h. Eleştirmek\n" +
                    "ı. Sessizlik zamanı vermek\n" +
                    "i. Öğrenci ile konuşmak\n" +
                    "j. Problemi tanımak ve çözmek\n", Card_Ozellikleri.ALT_BOLUM));


            list.add(new Card_Ozellikleri("Sınıf Yöntemi Yaklaşımları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Geleneksel Yaklaşım", "* Öğretmen merkezlidir.\n" +
                    "* Öğretmen sınıfın mutlak hâkimidir.\n" +
                    "* Sınıf kuralları öğretmen tarafından belirlenir ve bu kurallara öğrencilerin sorgulamadan uyması beklenir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Tepkisel Yaklaşım", "*İstenmedik davranışlara anında tepki verilir.\n" +
                    "*Temel amaç, istenmedik durum veya davranışın değiştirilmesidir.\n" +
                    "*İstenmedik davranışın yok edilmesinde ödül ve cezaya sıklıkla başvurulur.\n" +
                    "*Gruptan çok bireye yönelim vardır.\n" +
                    "* Tepkisel yaklaşımdan sıklıkla yararlanan bir öğretmenin, sınıf yönetimi konusunda yetersiz olduğu yorumu yapılabilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Önlemsel Yaklaşım", "* Sorun oluşturabilecek durumlar için daha sorun ortaya çıkmadan önce gerekli tedbirlerin alınır.\n" +
                    "* Bireyden çok gruba yönelim vardır.\n" +
                    "* Hata yapmama anlayışına dayanır.\n" +
                    "* Temel amaç sınıfta sorunların ortaya çıkmasına olanak vermeyen düzenlemeleri oluşturmaktır.\n" +
                    "* Sınıf kurallarının belirlenmesi öncelikle önlemsel yaklaşımla ilişkilidir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Çağdaş Yaklaşım", "*Öğrenci merkezlidir, öğretmen rehberdir.\n" +
                    "*Demokratik bir sınıf ortamı söz konusudur.\n" +
                    "*Öğretmen ve öğrenciler sınıf kurallarını birlikte belirler\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5) Gelişimsel Yaklaşım", "*Öğrencilerin ilgi, ihtiyaç, yaş hazırbulunuşluk ve gelişimsel özellikleri dikkate alınır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6) Bütünsel Yaklaşım", "*Diğer sınıf yönetimi yaklaşımlarının bir arada kullanılmasıdır. \n" +
                    "*Öncelikle gelişimsel ve önlemsel yaklaşımlardan yararlanılır, en son çare olarak tepkisel yaklaşıma başvurulur.  \n" +
                    "*Hem gruba hem bireye yönelim vardır.\n" +
                    "*Okul - aile işbirliğini temele alır.\n", Card_Ozellikleri.ALT_BOLUM));

        }

        else if (isim.equals("34")) {

            list.add(new Card_Ozellikleri("ÖĞRETİM İLKE, STRATEJİ, YÖNTEM VE TEKNİKLERİ", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Kavramlar", "Öğretim ilkeleri: Eğitimin hedeflerinin gerçekleştirilmesinde, öğrenme-öğretme etkinliklerinin planlamasında ve uygulanmasını rehberlik eden temel düşüncelerdir.\n" +
                    "Strateji: Hedeflere ulaşılmasını sağlayan ve yönteminbelirlenmesine yön verem genel bir yaklaşımdır.\n" +
                    "Yöntem: Bir konuyu öğretmek ya da öğrenmek için seçilen ve izlenen yoldur.Yeni bilgi kazandırmaktır.\n" +
                    "Teknik: Bir yöntemi uygulamaya koyma biçimidir. Öğrenilen bilgilerin tekrarını sağlar.\n" +
                    "Öğretim Kuramları: Bir bilginin nasıl aktarılacağı ile ilgili teoriler üretir.\n" +
                    "Öğrenme Kuramları: Bireyin nasıl öğrenildiği ile ilgilenilmektedir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretim İlkeleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Çocuğa (öğrenciye) görelik ilkesi", "Ders programının hazırlanmasında veya dersin işlenmesinde öğrencinin fizyolojik ve psikolojik özelliklerinin, bireysel farklılıklarının esas alınmasıdır. Bu ilkeye ‘’ çocuğa uygunluk’’ veya öğretimi ‘’bireyselleştirme’’ ilkesi de denir", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Bilinenden bilinmeyene ilkesi", ": Öğrencinin o zamana kadarki bilgi ve tecrübelerinden hareket etmek, yeni bilgi ve tecrübelerin bunlar üzerine kazandırılmasıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Somuttan soyuta ilkesi", "Çocuktaki zihin gelişimi somuttan soyuta doğru olmaktadır. İnsan her zaman somut olarak gördüğü, algıladığı şeyleri, onların soyut kavramlarla anlatılmasından daha kolay öğrenir. Bu nedenle, öğrenci mümkünse ders konusu olan eşya ve nesnelerle doğrudan karşı karşıya getirilmeli; bu mümkün olmadığı zaman o nesne veya olayın modeli, fotografı veya başka bir simgesi gösterilmelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Yakından uzağa ilkesi", "Öğrenciye öğretilecek bilgilerin düzenlenmesinde, örneklerin verilmesinde, hem doğal hem de sosyal olarak onun en yakın çevresinden hareket etmelidir. Bu, sadece yer ve yaşayış açısından değil zaman açısından da böyledir. Yakın zamandan uzağa, yakın aile ve okul çevresinden uzağa, yakın köy-kasaba-bölge-ülke çevresinden uzağa ilkesi birçok derste rahatlıkla kullanılabilir ve bu ilkeye uyma, öğrenmenin düzeyini yükseltir. \"Çevreye görelik\", \"topluma görelik\" gibi bazı ilkeler de bu çerçevede düşünülebilir. İlköğretimde şu tür bir sıra izlenmelidir. Öğrencinin okulu ve yakın çevresini tanıtıcı bilgiler; köyü veya kasabasıyla ilgili bilgiler ve son olarak ilçesi, ili, bölgesi, yurdumuz ve dünya ile ilgili bilgiler verilmelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5) Tasarruf (ekonomiklik) ilkesi", "Her türlü eğitim-öğretim faaliyeti en az zaman, en az emek ve enerji sarf edilerek, en yüksek verim elde edilecek şekilde düzenlenmelidir. Bunun için de, öğretim baştan sona her yönden plânlanmalıdır. Plânsız ve metodsuz olarak yapılan dersler çok sınırlı olan öğretim zaman ve imkânlarını israf edeceği gibi, istenilen düzenli bir öğrenme de sağlanamaz. Hem öğretmen öğretirken hem de öğrenci öğrenirken ekonomik ve pratik metod ve teknikler bulmalı ve hattâ konuya ve seviyeye uygun olarak kendi tekniklerini geliştirmelidirler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6) Açıklık ilkesi", "Öğrenci, derste işlenen tüm konuları somut olarak görebilmeli; bu mümkün olmuyorsa resmini, sesini, grafiği, modelini v.s. görsel-işitsel olarak algılayabilmelidir. Eğer öğretmen sadece sözel anlatıma dayalı olarak ders işliyorsa, öğrencinin anlayacağı kelime ve cümle yapıları ile son derece açık ve anlamlı bir ders işlemelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("7) İş ilkesi", ": Bu ilke öğrencilerin aktif bir şekilde derse katılmalarını, pasif bir dinleyicilikten ziyade soru soran derse katkı sağlayarak ders esnasında derse katkı yapılmasını sağlayan bir ilkedir. Özellikle ilköğretimde iş eğitimi dersleri bu ilke esasında yürütülmektedir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("8) Hayata yakınlık ilkesi", "Okul ve öğretim ortamı hayattan kopuk, yapay bir ortam olmamalı; hayata yakın, oradaki gerçeklikten uzak olmayan, öğrencinin hayatla bağlantısını koparmayan bir yaşantı sunmalıdır. Okul öğrencileri hayat için hazırladığına göre, oradaki öğretim de hayatın doğrudan kendisi olmalıdır. Ders konuları, anlatım sırasında verilen örnekler hayatın içinden seçilmelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("9) Bütünlük ilkesi", "G. Kerschensteiner'in üzerinde durduğu bu ilke, çocuğun eğitilecek yönlerinin bir bütün olarak alınıp değerlendirilmesini ister. Çocuk bedensel ve ruhsal kuvvetler (düşünce, duygu, irade gibi) bakımından bir bütün olarak ele alınmalı ve her yönü dengeli olarak eğitilmelidir. Zaten bedensel ve ruhsal kuvvetler sürekli olarak birbirlerini etkilerler ve birbirine bağlıdırlar. Sadece bedeni geliştirip zihni ve ahlâkî yönler geliştirilmezse veya bunun tersi durumlarda dengesiz; hem topluma hem de kendine zararlı olabilecek insanlar yetişmiş olur.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Öğretim Stratejileri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Sunuş yoluyla öğretim stratejisi (Asubel)", "Temel özellikleri:\n" +
                    "* Öğretmen ve öğrenci arasında yoğun bir etkileşim olmalıdır.\n" +
                    "* Bol örnek verilmesi, grafik, şema, resim gibi görsel uyarıcıların kullanılması gerekir.\n" +
                    "* Genelden özele doğru (tümdengelim) bir sıra izler.\n" +
                    "* Öğretimin adım adım ilerler.\n" +
                    "Kullanılan Teknikler:\n" +
                    "* Büyük grup tartışması\n" +
                    "* Küçük grup tartışması\n" +
                    "* Münazara\n" +
                    "* Karşıt Panel\n" +
                    "* Panel\n" +
                    "* Forum(açık oturum)\n" +
                    "* Beyin fırtınası (Fikir taraması)\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Buluş yoluyla öğretim stratejisi (Bruner)", "Temel özellikleri:\n" +
                    "* Öğrencinin kendi etkinliklerini ve gözlemleri yoluyla yargıya varmasını teşvik etmektedir.\n" +
                    "* Öğrencilerin bir bilim adamı gibi düşünmesini sağlamaktır.\n" +
                    "* En önemli üstünlüğü öğrencilerin merakını ve güdülenmesini artırmak, bağımsız olarak problem çözmeye yönlendirmektir.\n" +
                    "* Öğrencinin merakını artırmak için belirsizlik meydana getirilir.\n" +
                    "* Öğrenci bilginin ve konunun ana yapısını kavramak için etkin olmalı, anahtar ilkeleri kendisi oluşturmalıdır.\n" +
                    "* Öğretmenin rolü paketlenmiş bilgileri sunmak değil, öğrencinin kendisinin öğrenebileceği ortamı ve süreci oluşturmaktır.\n" +
                    "* Tümevarımsal öğrenme özelliği gösterir.\n" +
                    "* Örnekten-kurala stratejisi de denir.\n" +
                    "Buluş yoluyla öğretim uygulaması:\n" +
                    "1) Öğretmenin örnekler sunması\n" +
                    "2) Öğrencinin örnekler sunması\n" +
                    "3) Öğretmenin ek örnekler vermesi\n" +
                    "4) Öğrencilerin ek örnekleri betimlemesi ve öncekilerle karşılaştırması\n" +
                    "5) Öğretmenin örnek olmayan durumları sunması\n" +
                    "6) Öğrencilerin zıt örnekleri karşılaştırması\n" +
                    "7) Öğretmenin, öğrencilerin belirlediği özellik-ilke ve ilişkileri toparlaması\n" +
                    "8) Öğrencilerin özellik-ilke ve ilişkileri ifade etmeleri\n" +
                    "9) Öğretmenin öğrencilerden orijinal örnekler istemesi\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Araştırma-inceleme yoluyla öğretim stratejisi", "2-8 öğrencinin bir araya gelerek bir problemi ya da bir konuyu araştırmak ve rapor etmek amacıyla yürütülen, öğrencilerin sosyal etkileşime girmeleri ve birlikte çalışma alışkanlığı kazanmalarını sağlayan yöntemdir.\n" +
                    "* Diğer ikisine göre daha öğrenci merkezlidir.\n" +
                    "* Pronlem çözme aşamaları kullanılır.\n" +
                    "* Tümdengelim ve tümevarım yoluyla öğretim yapılır.\n" +
                    "* Bilimsel yöntem ve tutum kazandırır.\n" +
                    "* Kaynaklara nasıl ulaşacağını gösterir.\n" +
                    "* Benzer problemlerin çözümünde kullanılır. (transfer)\n" +
                    "* Öğretmen yönlendiricidir.\n" +
                    "* Sonuçta yeni bir öneri ya bir proje taslağı ya da ürün ortaya çıkar.\n" +
                    "* Bireysel ve grupla uygulanabilir.\n" +
                    "* Sınıf dışı uygulamalarla birlikte daha etkilidir.(deney, gözlem v.b.)\n" +
                    "* Zaman alıcıdır.\n" +
                    "Araştırma-inceleme yoluyla öğretimde kullanılan teknikler\n" +
                    "* Örnek olay\n" +
                    "* Problem çözme\n" +
                    "* Gösteri\n" +
                    "* Rol oynama\n" +
                    "* Kubaşık öğrenme (iş birliğine dayalı öğrenme)\n" +
                    "* Proje çalışma\n" +
                    "* Gezi-gözlem\n" +
                    "* Soru-yanıt\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Öğrenme-Öğretme Modelleri, Kuram ve Yaklaşımları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a. Programlı öğrenme (Skinner)", "Öğretimin bireyselleştirilmesini ve hatanın en aza indirilmesini amaçlar. 3 önemli unsuru; Program-materyal-öğrenci’ dir.\n" +
                    "* Davranışçı (edimsel) yaklaşımı benimsemiştir.\n" +
                    "* Öğrencinin öğrenmeye aktif olarak katılmasını, sistemli bir ilerleme yapmasını ve öğrenmenin sürekli kontrol edilmesini sağlayan bireysel bir yöntemdir.\n" +
                    "* Öğrenme malzemesinin, öğrenciyi son amaca ulaştıracak adımlar biçiminde düzenlenmesidir.\n" +
                    "* Üst düzey davranışların / bilgilerin kazandırılmasında etkili değildir.\n" +
                    "* En önemli yararı dönüt ve düzeltmeyi hemen yapmasıdır.\n" +
                    "Programlı eğitimin ilkeleri:\n" +
                    "1. Küçük adımlar ilkesi: Öğretilecek içerik küçük parçalara bölünerek basitten karmaşığa doğru sıralanır.\n" +
                    "2. Etkin katılım ilkesi: Program öğrenciye içerik hakkında soru sorar, öğrenci de bu sorulara cevap vererek etkin katılım sağlanır.\n" +
                    "3. Başarı ilkesi: Öğrenci kendisine yöneltilen konuyla ilgili ve düzeyine uygun soruları başaramadığı zaman diğer konu birimine geçemez. Başarılı öğrencilere pekiştireç verilir.\n" +
                    "4. Anında düzeltme ilkesi: Öğrenciye, verdiği cevaplarla ilgili anında geri bildirim verilir.\n" +
                    "5. Bireysel hıza göre ilerleme ilkesi: Öğrencinin, kendi ilgi ve yeteneğine göre öğrenme hızını ayarlayabilmesidir. Bu yolla bireysel farklılıklar dikkate alınarak öğretim bireyselleştirilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b. Tam öğrenme (Bloom)", "Davranışçı ve bilişseldir. Sistem yaklaşımına dayalı bir modeldir.\n" +
                    "* Temel varsayımı; ek zaman ve öğrenme olanakları sağlandığında, herkes her şeyi öğrenebilir. Öğrenemeyen öğrenci yoktur, öğretemeyen öğretmen vardır. Bloom’a göre öğrencilerin başarılı olmaları yeteneklerine değil, öğretim niteliğine bağlıdır.\n" +
                    "* Doğrusallık ve aşamalılık önemlidir.\n" +
                    "* Öğretmen merkezlidir.\n" +
                    "* İyi seviye öğrenen öğrenciler sürekli olarak geriden gelen öğrencileri bekler. B u da sistemi ve uygulamayı yavaşlatır.\n" +
                    "Tam öğrenme modelinin ana değişkenleri:\n" +
                    "1. Öğrenci nitelikleri: Öğrenme sürecini tamamlamak için gerekli olan tüm bilgi, beceri ve yeteneklerdir.\n" +
                    "2. Öğretim Hizmetinin Niteliği: İpucu, pekiştirme, katılım ve dönüt, düzeltme etkinlikleridir.\n" +
                    "3. Öğrenme ürünleri: Öğrencinin öğrenme hızı, duyusal özellikleri ve becerileridir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("c. Okulda öğrenme (Carroll)", "Her öğrenci aynı düzeyde öğrenebilir. Ancak öğrenciler hızlı ya da yavaş olabilir. Caroll, öğrenmede önemli olan belirleyici değişkenin zaman olduğunu vurgu yapmıştır. Davranışçı ve bilişseldir. Sistem yaklaşımına dayalı bir modeldir.\n" +
                    "1.Öğrenci ile ilgili öğeler;\n" +
                    "* Yetenek: Öğrencinin bir konuyu öğrenmek için ihtiyaç duyduğu süredir.\n" +
                    "* Öğretimden yararlanma yeteneği: Öğrencinin bir konuyu anlayabilmesi için gerekli olan hazırbulunuşluğa sahip olma düzeyidir.\n" +
                    "* Sebat (sabır): Öğrencinin gönüllü olarak öğrenmeye harcadığı zamandır.\n" +
                    "2.Öğretmenle ilgili öğeler;\n" +
                    "* Fırsat: Öğrenmeye verilen zamandır ve sunulan olanaklardır.\n" +
                    "* Öğretimin niteliği: Yeteneğe bağlı olarak sürenin dışında ek zaman kullanmadan öğretmedir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("ç. Yapılandırmacılık", "Bireyin nasıl anladığını ve öğrendiğini açıklayan bilginin doğasına ilişkin bir anlayıştır.Temel hareket noktası pragmatizmadır (Bir bilginindoğruluğu yararlı olduğu kadardır). Aktif öğrenme ve işbirlikli öğrenme özelliklerini de içerir. Öğrenci merkezlidir.\n" +
                    "Felsefesi ve kuramcıları: Yeniden kurmacılık ve ilerlemecilik eğitimfelsefesi akımlarına dayanır. Dewey, Piaget, Glaserfeld, Vygotsky, Gestalt ve Bruner önemli isimleridir.\n" +
                    "Bilgiye ve öğrenmeye yaklaşımı: Bilgi kesin değil, süreksiz ve değişkendir. Ezberlemeye ve bilginin hazır verilmesine karşıdır. Herkesin bildiği doğrudur. Bilgi ve öğrenme çok boyutludur. \n" +
                    "Öğrencinin rolleri: Ezberlemez, rekabet etmez, işbirliği yapar. Öğrenci bilgiyi kendisi oluşturur, sogulama yapar.\n" +
                    "Öğretim süreci: Programlar tümdengelim, içerik öğrenci sorunlarına göre oluşur. Açık uçlu sorular ile düşünme becerileri gelişir. Sarmallık, öğrenme halkası,   3E-5E-7E uygulamaları kullanılır.\n" +
                    "Düşünme becerileri: Iraksak düşünme, yaratıcı ve eleştirel düşünme, yansıtıcı düşünme.\n" +
                    "Değerlendirme: Öğretimle iç içedir ve zordur. Tümel değerlendirme yapılır ve portfolyo kullanılır.\n" +
                    "Öğretmen: Uygun ortam hazırlar ve öğrenmeyi kolaylaştırır.Çocuğu bilgiye ulaştıran arabulucudur. Öğrenci özelliğini ve girişimciliğini, dersi yönlendirmelerini kabul eder, izin verir.\n" +
                    "Yapılandırmacı öğrenme aşamaları: \n" +
                    "1. Aşama: Önceki bilgiler harekete geçirilir; Hazırbulunuşluk düzeyi ve güdülenme sağlanır. Soru-cevap tekniği kullanılır.\n" +
                    "2. Aşama: Yeni bilginin kazanılması sağlanır; Bilginin ezberlenmesi yerine anlama ve oluşturma hedeflenmelidir. Öğrencilerin ‘bütünü’, onun ‘ilgili parçalarını’ ve parçalardan ‘tekrar bütünü görmesi’ gerekir. Bilgi yüzeysel ve genişliğine değil, ‘derinliğine’ öğrenilmelidir.\n" +
                    "3. Aşama: Bilginin anlaşılması sağlanır; Özümleme ve uyum kurma sağlanır.\n" +
                    "4. Aşama: Bilgi uygulaması yapılır; Bilgi işlevsel ve yalnızca öğrenildiği sınıfta kalmamalı benzer problem durumlarında uygulanabilir, aktarılabilir olmalıdır.\n" +
                    "5. Aşama: Bilginin farkında olmasına bakılır; Öğrenci bilgisini hangi durumda kullanılabileceğini anlamalıdır. Bu nedene bilginin farklı durumlarda kullanılarak drama, proje çalışması, örnek olay incelemesi gibi zenginleştirilmiş öğretme-öğrenme etkinlikleri gerçekleştirilmelidir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("d. 3E-5E-7E Uygulamaları", "Temelinde, Piaget’in öğrenmeyi denge, dengesizlik, yeniden denge şeklinde açıklaması üzerine kurulmuştur.\n" +
                    "I. 3E modeli: \n" +
                    "Denge-İnceleme: 5E modelindeki girme ve keşfetme basamaklarını kapsar.\n" +
                    "Dengesizlik-Kavram Tanımı: 5E modelindeki açıklama/anlamlandırma basamağını kapsar.\n" +
                    "Yeniden Dengeleme-Kavramın Uygulanması: 5E modelindeki derinleştirme ve değerlendirme basamaklarını kapsar.\n" +
                    "II. 5E modeli: \n" +
                    "Denge\n" +
                    "1.Girme: Ön öğrenmelerin değerlendirilmesi, merak uyandırılması, hazırbulunuşluğun ortaya çıkartılması gibi etkinlikleri kapsamaktadır. Öğretmen kavramları, ilkeleri kesinlikle hazır olarak vermez. Sorduğu sorularla öğrencilere hatırlatmaya çalışır. Ön bilgilere erişim sağlanır, merak uyandırılır, öğrencilere ”neden” sorusu sordurulur, öğrenciler motive edilir ve öğrencilerin ilgisi çekilir.\n" +
                    "2.Keşfetme: Öğrenci bir problem durumuyla karşılaştırılır ve bu problemi çözmesi beklenir. Öğrencilerle laboratuvar etkinlikleri yapılır ve birlikte çalışılır, öğrenciler kendi kararlarını kendileri verir ve bir problem durumunda soru ve fikir üretir.\n" +
                    "Dengesizlik\n" +
                    "3.Açıklama/Anlamlandırma: Öğrenci problemin nasıl çözüldüğünü, problemi nasıl formüle ettiğini, çözüm yollarının neler olduğunu ve nasıl transfer ettiğini ortaya koyar. Öğretmen süreçte ipuçları verir. Öğrencilere ulaştıkları yargıları hakkında sorular sorulur, sınıfta tartışma yürütülür, daha fazla soru üretilir ve yeni tanımlar araştırılır.\n" +
                    "Yeniden Dengeleme\n" +
                    "4.Derinleştirme: Öğrenci yeni bir problem durumuyla karşılaştırılır. Bu problem çözülürken kavramlara ilişkin alt kavramlara dair yeni formüller elde eder. Bu bölümde, öğrencilerin kavramsal anlama yetenekleri geliştirilir, öğrencilerin yeni deneyimlerle daha derinlemesine ve geniş anlama yeteneği geliştirilir.\n" +
                    "5.Değerlendirme: Öğrenci ve öğretmen birlikte gerçekleştirir. Süreç yönelimli bir değerlendirme vardır. Değerlendirme bölümünde, öz değerlendirme, öğretmen gözlemi, performans değerlendirme, portfolyo ve rubrik yer almaktadır.\n" +
                    "III. 7E modeli:\n" +
                    "1. Girme: Öğretmenin öğrencileri öğrenmeye odaklayarak öğrencilerin derse aktif olarak katılımını sağladığı ve öğrencilerin konuya olan ilgi ve meraklarının artırıldığı aşamadır. Öğrenci ön bilgileri ve ne düşündükleri ortaya çıkartılır. Öğrenciler yeni anlatılacak konuyla ilgili düşünmeye sevk edilmektedir.\n" +
                    "2. Keşfetme: Öğrenciler ön bilgilerinden yola çıkarak yeni konu hakkında araştırma ve gözlem yapar. Düşünüp hipotez üretir. Öğrencilerin yeni karşılaştıkları olayı keşfetmek ve gözden geçirmek için sorgulama yöntemi kullanılmaktadır.\n" +
                    "3. Açıklama/Anlamlandırma: Öğrenciler farklı bilgi kaynakları kullanarak öğretmen rehberliğinde seçilen kavramların açıklamalarını ve tanımlarını grup tartışmaları ile yapmaya çalışırlar. Öğretmen sorduğu sorularla onlardan daha derin açıklamalar yapmalarını ister.\n" +
                    "4. Derinleştirme: Öğrenciler ön bilgileri ve keşfettikleriyle öğretmenin açıklamalarını sentezleyip yeni bilgiyi farklı bir durumda kullanarak hayata geçirmesi sağlanır. Öğrencilerin daha önceki etkinliklerde edindikleri kavram ve becerileri yeni durumlara uygulamaları için cesaretlendirildiği aşamadır.\n" +
                    "5. İlişkilendirme: Öğrenci edindiği bilgiyi farklı disiplinlerle ve gerçek hayatla ilişkilendirip sağlamlaştırır. Öğrencilerin mevcut kavramları, günlük hayattan örnekler kullanarak daha ileri düzeydeki olaylarla ve diğer alanlardaki kavramlarla ilişkilendirebilmeleri için rehberlik edilen aşamadır.\n" +
                    "6. Fikir Alış Verişi: Öğrenciler birbirleriyle bilgilerini paylaşarak öğrenmenin kapsamını genişletir. Uygulanan etkinliklerin her anında grup arkadaşları ile etkileşim içinde olan öğrencilerin, diğer gruplar ile yeni gruplar oluşturarak fikir alış-verişinde bulundukları bir aşamadır.\n" +
                    "7. Değerlendirme: Bu aşamada öğretmen yeni kavram ve becerileri uygulayan öğrencileri inceleyerek bilgi ve becerilerini ölçer ve davranış değişikliklerinin sebeplerini açıklamaya çalışır. Öğretmen öğrencileri grup çalışmalarına teşvik eder ve değerlendirmeyi gerçekleştirebilmek için “Neden bu şekilde düşündün?”, “Bunun için delilin nedir?”, “Bu konu hakkında ne biliyorsun?” ve “Bu olayı nasıl açıklarsın?” gibi sorular sorar. Öğrenciler ise delillerini ve açıklamalarını kullanarak bu sorulara cevap vermeye çalışır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("e. Aktif öğrenme", ":  Beyin fırtınası, eğitsel oyun ve rol oynama gibi öğrenci katılımını önemseyen etkinliklerle geleneksel ders anlayışını ileri bir noktaya götürmeyi amaçlayan öğrenme yaklaşımıdır. Bu yaklaşımda; öğrencilere öğrenmelerini doğrudan etkileyecek seçimler yapabilme olanağı tanınır, iyi organize edilmiş, uygun ve ulaşılabilir kaynaklar önerilir, planlama için çalışma çerçevesi sağlayan genel bir günlük program oluşturulur.                                              \n" +
                    "    Öğrenciler kendi etkinlikleri üzerine düşünmeleri, yetişkinler ve arkadaşları ile bunları tartışmaları için cesaretlendirilir. Öğretmenler de dikkatli gözlem yaparak ve yerinde destek sağlayarak öğrenmeleri kolaylaştırırlar. Aktif öğrenme ilkelerine dayalı bir sınıf ortamında katılımı arttırma, canlı ve eğlenceli bir öğrenme, daha derin ve unutulmayan bilgi, bilgiyi kullanma, uygulamaya dönüştürme için cesaretlendirme, iş birlikli çalışma gibi özellikler yer alır. Aktif öğretimde öğrenciler kendi kararlarını alabilirler, kendi çalışmalarını yönetebilirler. Öğrenciler: araştırma, merak etme, güdüleme, çaba gösterme, dikkatini açık tutma gibi özellikleriyle dikkat çekerler. Aktif öğrenmenin 5 temel niteliği; Güven, Enerji, Özdenetim, Gruba ait olma, Farkında olma ‘dır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("f. İşbirliğine dayalı öğrenme", "İşbirlikli öğrenme için gerekli koşullar;\n" +
                    "1. Grup ödülü\n" +
                    "2. Olumlu bağımlılık\n" +
                    "3. Yüz yüze etkileşim\n" +
                    "4. Bireysel sorumluluk ve değerlendirilebilirlik\n" +
                    "5. Sosyal beceriler\n" +
                    "6. Grup süreçlerinin değerlendirilmesi\n" +
                    "7. Başarı için eşit fırsat\n" +
                    "İşbirlikli öğrenme türleri;\n" +
                    "* Öğrenci Takımları – Başarı Grupları Tekniği: 4-5 kişilik heterojen gruplar oluşturulur. Herkes birbirine yardımcı olur ve birbirinin öğrenmesinden sorumludur. Süreç sonunda küçük sınavdan alınan puanlar grup puanı olarak belirlenir ve grup ödüllendirilir. Grup ödülü ya da bireysel ifadecilik anahtar kelimelerdir.\n" +
                    "* Takım Turnuva Tekniği: Heterojen gruplar oluşturulur. Her takım turnuva için üyelerini hazırlar. Öğretmen grup öğrencilerine konuyu sunar ve malzemeyi verir. Her hafta turnuva sınavı yapılır. Süreç sonunda en yüksek puanı alan grup turnuvayı kazanır.\n" +
                    "* Takım Destekli Bireyselleştirme: Testlerle öğrencilerin bireysel yetenekleri ölçülür ve geliştirilmeye çalışılır. Takım üyeleri farklı ünitelere çalışır. Her öğrenci diğer öğrencinin cevabını yanıt anahtarı olarak kullanır. Final testi hiçbir şekilde yardımlaşmadan yapılır.\n" +
                    "* Ayrılıp Birleşme Tekniği: Heterojen gruplar oluşturulur. İşlenen konular bölümlere ayrılır. Gruplardaki herkes bir bölümün uzmanı olarak görevlendirilir. Her gruptan bir üye alınır ve yeni bir grup oluşturulur. Aynı bölüm uzmanlarından oluşan bu yeni grup kendi bölümlerine çalışırlar. Bunlar öğrendiklerini döner ve kendi gruplarına anlatırlar. Bütün gruplar tüm konulardan sınav olur. Sonuçlar bireysel olarak puanlanıp grup olarak notlandırılır.\n" +
                    "* Takım Etkinliği: Materyal verilir ve herkes bireysel çalışır. Test yapılır ve bireysel yanıtlanır. Sonra grup üyeleri cevapları tartışılır. Öğretmen yanıtları verir ve grup tekrar tartışır.\n" +
                    "* Karşılıklı Sorgulama: Öğretmen konuyu sunduktan sonra öğrenciler ikili ya da üçlü gruplara ayrılır. Öğretmenler öğrencilere soruların nasıl sorulması gerektiği konusunda bilgi verir. Birbirlerine konuyla ilgili soru sorarlar ve yanıtlarını verirler. Sorular genellikle öğrenciyi düşünmeye yöneltecek biçimde düzenlenir.\n" +
                    "* İkili Denetim: Dörder kişilik gruplarda önce ikişerli birbirlerini denetleyerek çalışma yapraklarındaki soruları yanıtlarlar. Sonra ikişerli alt gruplarla ikili gruplar yanıtları karşılaştırır.\n" +
                    "* Akran Öğretimi: Yetişkinlerle iletişim kurmakta ve çalışmakta güçlük çeken öğrencilere verilir. Her ikisi de öğrencidir. Daha iyi bilen öğrenci az bilen öğrenciyi çalıştırır. \n" +
                    "* Dedikodu: İkişerli gruplar oluşturulur, tartışılır. İkişerli gruplar bütün sınıftaki kişilerle eşleşene kadar devam ettirilir\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("g. Proje tabanlı öğrenme", "1. Aşama: Konuyu ve alt konuları belirleme, grupları kendi içinde organize etme.\n" +
                    "2. Aşama: Grupların proje planlarını oluşturması.\n" +
                    "3. Aşama: Projeyi uygulama.\n" +
                    "4. Aşama: Sunuyu Planlama.\n" +
                    "5. Aşama: Sunu yapma.\n" +
                    "6. Aşama: Değerlendirme.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("h. Çoklu zeka kuramı", "1. Sözel zeka (Dilbilimsel): Sözcükleri ve dili kullanma yeteneğidir. Yazma, sözcüklerin anlamlarını öğrenme, etkili konuşma, sözlük kullanma, bir tartışmayı yönetme, sunu yapma gibi etkinlikler bu zekanın kapsamı içindedir.\n" +
                    "2. Matematiksel zeka (Mantıksal): Gruplayarak, sınıflayarak ve soyutlayarak öğrenirler. Akıl yürütme ilkelerini etkin kullanırlar. Muhakeme becerileri üst düzeydedir. Eleştirel düşünce mevcuttur. Neden sonuç ilişkisini ararlar. Deterministtirler. Bilimsellik arayışı vardır. Sorgulayıcıdırlar. Araştırma inceleme, problem çözme, proje tabanlı öğrenmeler uygundur.\n" +
                    "3. Görsel zeka (Uzamsal): Üç boyutlu düşünme yeteneğinin sonucudur. Hayal güçleri kuvvetlidir. İmgeleştirme kapasiteleri yüksektir. Nesneler arası ilişkileri çabuk görürler. Görünmenin arkasındaki görünmeyenleri görürler. Görsel metaforları (benzetmeler) kullanırlar.\n" +
                    "4. Müzikal(Ritmik): Ritim ve melodilerle öğrenirler. Çok sık kullanılan bir zeka alanı değildir. Simetri arayışı vardır.\n" +
                    "5. Bedensel (Kinestetik): Duygu ve düşüncelerin aktarımında bedenlerini etkin bir biçimde kullanırlar. Taklit yetenekleri oldukça güçlüdür. Söylenenlerden çok yapılanlar hatırlanır. Beden dilini etkin bir şekilde kullanırlar. Psikomotor becerilerin ortaya konmasında başarılı tiplerdir.\n" +
                    "6. Bireysel (Öze dönük): Bireyin kendisini anlama, duygu ve düşüncelerini yönlendirme gücünü ortaya koyar. Yalnız kalmaktan, bireysel çalışmalardan, özgün projelerden zevk alırlar.Bağımsızlık arayışı vardır. Kendileri hakkında eleştirel düşünebilirler. Yansıtıcı düşünmeye sahiptirler. Özgüven ve özsaygıları yüksektir.Kopya ve taklitten uzaktırlar. İzlerken öğrenme baskındır. Kendilerini çok iyi tanıdığı için insanları da çok iyi tanırlar.\n" +
                    "7. Sosyal (Kişilerarası): İnsan ilişkilerinde, kendini ifade etmede ve empatide başarılıdırlar. İşbirliğiyle öğrenirler. Yüksek iletişim becerileri vardır. Yakın ve samimi ilişkiler kurarlar.\n" +
                    "8.Doğa (Varoluşçu): Tabiata karşı bakışın belirlendiği zeka alanıdır. Sürekli doğada denge arayışı vardır. Çevreye karşı hassastırlar.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("ı. Yaşam Boyu Öğrenme ", "İlkeleri\n1. Süreklilik\n" +
                    "2. Değişim\n" +
                    "3. Kendi kendine öğrenme\n" +
                    "4. Araştırmacılık\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("i. Kaynaştırma Eğitimi", "Amacı; Çocuğu normal hale getirmek değil, onun ilgi ve yeteneklerini en iyi şekilde kullanmasını sağlamak ve toplum içinde yaşayabilmesini kolaylaştırmaktır. 3 tür uygulaması vardır.\n" +
                    "1. Tam zamanlı kaynaştırma: Özel eğitime ihtiyacı olan öğrencinin kaydı normal sınıftadır; öğrenci tam gün boyunca normal sınıfta eğitim almaktadır. \n" +
                    "2. Yarım zamanlı kaynaştırma: Özel eğitime ihtiyacı olan öğrencinin kaydı özel sınıftadır; özel eğitim sınıfı öğrencisi başarılı olabileceği derslerde kaynaştırma sınıfında eğitim almaktadır.\n" +
                    "3. Tersine kaynaştırma: Yetersizlikleri olmayan bireyler istekleri doğrultusunda özellikle okul öncesi eğitimde, çevrelerindeki kaynaştırma uygulaması yapan özel eğitim okullarında açılacak sınıflara kayıt yaptırabilirler.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Öğretim Yöntemleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Anlatım Yöntemi", "Anlatım Yönteminin Yararları \n" +
                    "* Aynı anda çok sayıda kişi bilgilendirilir. \n" +
                    "* Öğrencilere dinleme alışkanlığı kazandırır. \n" +
                    "* Kısa zamanda çok sayıda bilgi verilebilir. \n" +
                    "* Uygulaması kolay ve ekonomiktir. \n" +
                    "* Öğrencilere, konuya ilişkin genel bir bakış açısı kazandırır. \n" +
                    "* Kısa zaman diliminde uygulandığında, öğrencileri derse güdüler ve dikkatleri toplamaya yardımcı olur. \n" +
                    "Anlatım Yönteminin Sınırlılıkları \n" +
                    "* Öğretmen-öğrenci etkileşimi zayıftır. \n" +
                    "* Edilgen durumda kalan öğrencinin derse ilgisi azalır. \n" +
                    "* Öğretimin değerlendirilmesinde, öğrenciden dönüt alma olanağı yoktur. \n" +
                    "* Dersi sıkıcı hale getirerek davranış sorunlarını arttırır. \n" +
                    "* Öğrencilerin ilgi, beklenti ve gereksinimlerinin karşılanıp karşılanmadığını belirlemek güçtür.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Gösteri (Demonstrasyon) Yöntemi", "Gösteri Yönteminin Yararları \n" +
                    "* İş ve eylem basamaklarını standardize ederek, öğrenmeyi kolaylaştırır. \n" +
                    "* Özellikle beceri öğretiminde yararlıdır. \n" +
                    "* Görerek ve işiterek öğrenme olanağı sağlar. \n" +
                    "* Soru-cevap ve tartışma gibi yöntemlerle kullanıldığında öğrenciden dönüt almayı kolaylaştırır. \n" +
                    "* Kalabalık sınıf ortamlarında başarı ile uygulanabilir ve öğrencilerin derse ilgisini arttırır.\n" +
                    " Gösteri Yönteminin Sınırlılıkları \n" +
                    "* Uzun bir hazırlık dönemi ve zaman gerektirir. \n" +
                    "* Soru-cevap, tartışma ve rol oynama gibi yöntemlerle desteklenmezse, yeterli ve kalıcı bir öğrenme gerçekleşmez. \n" +
                    "* Öğrencinin edilgen durumda olması, sınıftan dönüt almayı güçleştirir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Gözlem Gezi Yöntemi", "Gözlem metodu, her çocukta var olan araştırmaya eğiliminin değerlendirilmesi olarak ortaya çıkmıştır. Eğitim-öğretimde gözlem, varlık ve olayların kendi tabiî ortamlarında plânlı ve amaçlı olarak incelenmesi demektir.mPsikoloji bilimi gözlemi, dikkatin dış dünyadaki olay ve varlıklara yönelmesi olarak tanımlamaktadır.   Gözlem metodu genelde eğitsel ders gezileri olarak da adlandırılır. Çünkü çoğu kez öğrencileri fabrika, müze, kütüphane, çeşitli devlet kurumları, dağ, orman, göl gibi yerlere götürerek oralarda doğrudan gözlem yaptırılarak bilgi toplanabilir. Bunun yanında gözlem sınıflarda da yapılabilir. Sınıfa getirilecek bir kuş, bir maden parçası, bir model, bir tablo, film vs. incelendikten sonra gözlem sonuçları alınabilir. Öğretimde daha fazla duyuyu etkileyen metod daha iyi olduğuna göre, yapılacak gözlemlerin öğrencilerin daha fazla duyusuna hitap etmesi sağlanmalıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Grup Tartışması Yöntemi", "Panel: Bu yöntemde oluşturulan bir grubun üyeleri belli bir konu ya da sorun üzerinde araştırma yaparlar. Buldukları verileri incelerler ve bu ön hazırlıktan yararlanarak görüşlerini sırayla açıklarlar. Genellikle öğretmen ya da bir akran panel başkanlığını üstlenir. Toplantıda ayrılan süre bitinceye kadar başkan konuşmacılara (eşit sürelerle) konuşma hakkı tanır. Yine öğretmen isterse panelden sonra konuyu tüm sınıfta tartışabilir.\n" +
                    "Münazara: Birbirine zıtbgörüşler içeren bir konuda iki faarklı grup oluşturulur be her grup kendi görüşünü belli zaman birimleri içinde tarafsız bir dinleyici grubuna anlatır. Amaç, kendi tarafının görüşlerini doğrı, diğer tarafındakileri yanlış göstermektedir. Münazarada genellikle bir de dinleyici grup olur. Bu grup beğendikleri konuşmacıları alkışlayarak jüriyi etkilemeye çalışırlar. Fazla bilimsel olmamakla birlikte bir fikri savunma, söz ustalığı, çabuk cevap hazırlama gibi yetenekleri geliştirdiği için sıklıkla kullanılan bir yöntemdir.\n" +
                    "Sempozyum: Önceden belirlenmiş ve hattâ yazılı olarak tartışmaya katılacaklara duyurulmuş bir konu üzerinde, uzman kişiler tarafından konunun değişik yönlerinin genelde 15 dakikalık sunumlar olarak büyük dinleyici kitleye sunulmasıdır. Oturuma katılacak kişiler 5-6 kişi olabilir. Uzman kişilerin sundukları ve çoğu zaman yazılı olarak da düzenleme kuruluna verdikleri konuşmalarına tebliğ denir. Bazı sempozyumlarda tebliğlerin hepsi yazılı olarak sunulmaz, o anda özet olarak da verilebilir. Daha sonra sempozyum kitabı içinde ayrıntılı olarak yayınlanır.\n" +
                    "Kollekyum (Zıt panel): İki gruptan birinin sadece soru soran, diğerinin ise cevap veren rollerini üstlenmesi ile olur. Genelde soru soran grup, dinleyicilerden olur; cevap veren grup ise uzmanlar kuruludur. Soru soran grup da daha önce konu üzerinde bir hayli hazırlık yaparlar. Sorular genelde dinleyici grubun o konudaki ilgi ve ihtiyaçlarına göre şekillenir. Sınıfın yarısı soru soran, diğer yarısı da cevap veren grubu oluşturabilir. Soruların ve cevapların belli bir konuda olması gerekir. Eğer iyi düzenlenirse, öğrencilerin ilgisinin canlı olduğu bir ders yapılabilirç Tehlikesi ise, çalışkan birkaç öğrencinin gerek soru gerekse cevap grubunda aktiviteyi ele alarak diğerlerinin pasif kalmasıdır.\n" +
                    "Büyük grup tartışması: Bu yöntemde öğretmen konuyu tüm sınıfın katıldığı bir tartışma ortamında işler. Tartışmanın yürütücüsü yine öğretmendir. Sorular sorar, öğrencilerin görüşlerini açık duruma getirir ve konuyu daha iyi anlamaları için sık sık özetler.\n" +
                    "Forum: Küçük bir grubun belli bir konuda geniş bir kitleye uzman bilgisi aktarması (panel) ve daha sonra da dinleyicilerden gelecek sorulara cevap vermesidir. Dinleyicilerin soruları bazen kısa sözlü soru olarak alınır. Ancak bu arada uzun açıklamalar yapılarak konu dağıldığı için, forum yöneticisi soruları yazılı olarak alınır ve hangi kişinin konu alanına giriyorsa o kişiye verecek kısaca cevaplandırılmasını sağlar. Sık sık forum toplantıları bir geniş grup tartışmasına dönmektedir.\n" +
                    "Seminer: Yükseköğretimde sıklıkla kullanılan bir yöntem değişik biçimlerde uygulanmaktadır. En yaygın kullanım biçimi ise yazılan bir tez ya da çalışma üzerinde grupça tartışılmasıdır. Üzerinde görüşülecek yazılı materyal iki-üç hafta önceden grup üyelerine dağıtılır. Böylece grup üyeleri çalışmanın üzerinde enine boyuna inceleme yapma olanağına kavuşurlar.\n" +
                    "Açık Oturum: Biçim olarak panele benzeyen bu toplantı biçiminde, kişilerin tebliğvari sunuları yoktur. Konu üzerinde çeşitli defalar söz alarak konuşabilirler. Eğer açık oturuma katılanlar sayısı geniş tutulursa veya söz hakkı vermede herkese eşit davranılmazsa, sık sık hoş olmayan ve kontrolü zor durumlar meydana gelebilir.\n" +
                    "Vızıltı grupları: Vızıltı grupları çeşitli şekillerde oluşturulur. Örneğin; ‘’vızıltı 22’’ de 2 öğrenci bir konu üzerinde 2’şer dakika konuşur. ‘‘vızıltı 66’’ de 6 öğrenci bir konu üzerinde 6’şer dakika tartışır. Bu tür grup tartışması 4 ile 36 dakika arasında arasında sürebileceği için vızıltı gruplarına ‘’kısa süreli tartışma grupları’’ da denilmektedir.\n" +
                    "Fikir Taraması: Kısa süreli tartışma grupları türünden olan fikir taramasında 4-9 kişiden oluşan gruplarda belli bir konu üzerinde 5-10 dakika konuşur. Burada önemli olan husus yaratıcı düşünce ve soruna değişik çözümler getirmedir. Öğretmen fikir taramasından çeşitli biçimlerden yararlanabilir. Örneğin; bir ders ya da tartışma ölü noktaya gelir sessizlik başlarsa en iyi yol fikir taramasını başlatmaktır. Bazen de derse eğlenceli bir başlangıç yapmak için bu yönteme başvurabilir. Fikir taramasında önemli olan basit bir sorun üzerinde mümkün olduğu kadar kısa bir süre durmaktır.\n" +
                    "Çember: Bu tekniğin uygulanabilmesi içinkazandırılacak davranışların en az kavrama düzeyinde ve öğrencilerin tartışacakları konunun bilgi ve becerelerine sahip olması gereklidir. Öğrenci sayısı genellikle 10-15 civarında olmalıdır. Önce tartışmayı ve zamanı yönetecek bir lider seçilir, sonra tartışmada görüşleri belirleyip yazacak bir sekreter  saptanır. Öğrenciler çember şeklinde oturtulur. Önceden hazırlanan sorular teker teker öğrenciye sorulur ve onların yanıtlarına sekreter tarafından not verilir. Her öğrenciye her defasında 1-2 dakikalık süre verilir. Tartışmanın sonunda ana noktalar vurgulanır. Doğru yanıtlar yoksa öğrencilere ipucu verilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5. Laboratuvar Yöntemi", "İlke ve yöntemlerin pratikte uygulanması için kullanılan bir tekniktir.El becerisini geliştirmek,gerekli bilgiyi elde etmek,düşünme gücünü ve gözlem becerisini geliştirmek amacıyla kullanılır. Laboratuar çalışmalarını; a)Planlama , b)Uygulama ,c)Özetleme ve değerlendirme olmak üzere üç aşamada ele alabiliriz. Diğer tekniklerin çoğuna oranla masraflıdır. Diğer teknikler kadar bilgi edinilmeye uygun değildir. Laboratuarlar genellikle az sayıda öğrencinin aktif olabileceği büyüklüklerde olduklarından bir kısım öğrenciler pasif kalabilirler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("6. Örnek Olay İncelemesi", "Örnek olaylar görsel, yazılı birçok kaynaktan derlenebilir. Öğrenciler veya öğretmen, bir trafik kazasını, bir çevre sorununu, bir spor kavgasını veya dostluğunu, tıbbî veya hukukî bir olayı sözel olarak veya resim, film gibi tekniklerle sınıfa getirirler. Kısa bir sunumdan sonra öğrenciler bu konu hakkındaki fikirlerini, yani olayın nedenlerini, gelişimini ve mümkün sonuçlarını ortaya koyup tartışırlar. Seçilen olay iyi bir olay ise bunun geliştirilip yaygınlaştırılması yolları, kötü bir olay ise bunun engellenmesi ve düzeltilmesi yolları hep beraber ortaya konmaya çalışılır", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("7. Problem Çözme Yöntemi", "Problem çözme yöntemi ile öğretim yaklaşımı, aslında bilimsel araştırma metodlarını işaret etmektedir. John Dewey'nin \"yapıcı ve yaratıcı düşünce\" modeline göre, problem çözmede su ana asamalar esas olmalıdır;\n" +
                    "Problemi tanıma,\n" +
                    "Geçici hipotezler formüle etme,\n" +
                    "Veri toplama, organize etme, değerlendirme ve açıklama,\n" +
                    "Sonuca ulaşma,\n" +
                    "Sonuçları test etme.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("8. Diğer Öğretim Yönemleri", "İş Başında Eğitim: Özellikle beceri gerektiren işlerde çalışacak yada çalışmakta olan bireyleri, işin gereklerine uygun olarak yetiştirmek amacıyla yaygın olarak kullanılan yöntemdir.\n" +
                    "Ekiple Öğretim: İki ya da daha fazla sayıda öğretmen ve diğer görevli kişilerin, öğretim etkinliklerini planlama, sunma ve değerlendirme anlamlı ve sistematik bir işbirliği içinde çalışmalarıdır.\n" +
                    "Programlı Öğretim: Bireysel, kendi kendine öğrenme yöntemi olarak kabul edilmektedir. Bilginin özel parçalara veya temel öğelere ayrılarak belirli bir sayıya göre düzenlenip bireysel esasa göre düzenlenmesidir.\n" +
                    "Mikro Öğretim: Önceden belirlenmiş kritik öğretim becerilerinin kontrollü bir ortamda öğretmen adaylarınca kazanılmasına yönelik bir eğitim teknolojisi uygulaması olarak tanımlanabilir. Bu yöntemde öğrenciler, kalabalık sınıfın karmaşık ortamıyla karşılaşmadan, bu ortamın öğelerini parçalar halinde deneyerek öğrenirler.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Bir Öğretim Metodunun Seçimini Etkileyen Faktörler", "1. Dersin muhtevası\n" +
                    "2. Öğrencilerin özellikleri\n" +
                    "3. Öğretmenin özellikleri\n" +
                    "4. Öğretim araç-gereçlerinin durumu\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Öğretim Teknikleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Beyin Fırtınası Tekniği", "Bir gruba ait öğrencilerin, açık fikirli olarak, bir konu, olay veya problem durumu hakkında düşünmelerini ve mantıklı olup olmadığı endişesine kapılmadan olabildiğince çok sayıda fikir üretmelerini istemek olarak tanımlanabilir. Bu tekniğin Etkili bir beyin fırtınası veya tersine beyin fırtınası sürecinin oluşabilmesi, başlıca dört faktöre bağlıdır.\n" +
                    "* Beyin fırtınası esnasında öğrencilerin ileri sürdükleri fikirler asla eleştirilmemelidir.\n" +
                    "* Beyin fırtınası esnasında öğrencilerde sınırsız düşünme özendirilmelidir.\n" +
                    "* Beyin fırtınası esnasında öğrencilerin fikirlerinde genellikle nitelik yerine nicelik aranmalıdır.\n" +
                    "* Öğrencilerin beyin fırtınasını gerçekleştirmelerindeki amaçları, gelişme ve geliştirme olmalıdır.\n" +
                    "Beyin Fırtınası Tekniği Faydaları\n" +
                    "* Öğrencilerde yaratıcı düşünmeyi geliştirir.\n" +
                    "* Öğrenciler, kısa zamanda belli bir konuya ilişkin olarak çok sayıda fikir ve düşünce üretirler.\n" +
                    "* Beyin fırtınası, öğrencileri öğrenmeye motive eder.\n" +
                    "* Kullanımı oldukça kolaydır ve pek fazla hazırlık gerektirmez.\n" +
                    "Beyin Fırtınası Tekniği Sınırlılıkları\n" +
                    "* Beyin fırtınası esnasında her öğrenciyi ayrı ayrı değerlendirmek oldukça zordur.\n" +
                    "* Ortaya atılan her fikrin yazılması zorunluluğu fikirlerin akış hızını yavaşlatabilir.\n" +
                    "* Öğrencilere yapıcı eleştiride bulunmak için fazla zaman yoktur.\n" +
                    "* Beyin fırtınasının yönlendirilmesi için iyi bir başkan ve not tutan bir üye olmazsa başarı azalır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Soru-Cevap (Sokrat Metodu) Tekniği", "Soru sormak her türlü öğrenmenin başıdır. Kafasında herhangi bir konu hakkında soru oluşturan kişi, artık meselenin farkına varmış, onun çözüm yolunu aramaya başlamış demektir. Ona, rasyonel ve bilimsel yolla soruya cevap arama yolu öğretilirse, o problemi güzel bir metodla çözebilecek demektir.\n" +
                    "* Soru, her zaman öğretimdeki temel iletişim araçlarından biri olmuştur. Başka metodların içinde ara sıra kullanılan soru-cevap tekniğinden ayrı; dersi baştan sona soru-cevap tarzında işleme demektir.\n" +
                    "* Öğrencinin hatırlama, yargılama, değerlendirme, karar verme ve yaratıcı düşünmesini sağlar.\n" +
                    "* Öğrencinin derse aktif olarak katılmasını sağlar.\n" +
                    "Soru-cevap tekniğinin yararları\n" +
                    "* Sınıf içinde hem öğretmenle hem tartışma arkadaşlarıyla sağlıklı iletişim kurmayı sağlar.\n" +
                    "* Soru, herkesin zihnindeki değişik cevapların, fikir ve görüşlerin ortaya çıkmasını, bunların demokratik bir biçimde ifade edilmesini; buradan da kişilerin tahammül, hoşgörü ve çoksesliliğe alışmalarını sağlar. Öğrenci, \"başkalarının mantığı\" ile de düşünmeye alışır. Zaten demokratik bir ortam da, çevredekilerin fikirlerini alarak, onları doğru yorumlayarak karşılıklı işbirliği içinde olur.\n" +
                    "* Kişinin kendi kendini değerlendirmesini sağlar.\n" +
                    "* Öğrenciyi güdüler, sosyalleştirir; ona öğrendiklerini uygulama ve yorumlama imkânı verir.\n" +
                    "Soru-cevap tekniğinin sınırlılıkları\n" +
                    "* Konunun çok fazla dağıtılması, dersin \"kaynatılması\" ve dolayısıyla programın yetiştirilememesidir.\n" +
                    "* Sorular iyi ifade edilemez ise, anlaşılmaz, kasıtlı ve yönlendirici olursa öğrencinin serbest düşünmesi engellenmiş olur.\n" +
                    "* Sorulara cevap veremeyen öğrencinin kendine güveni azalır.\n" +
                    "* Zamanla öğrenci bildiği konularda bile konuşmamaya başlar. Dolayısıyla sınıfta derse aktif katılanların sayısı düşer; ders de öğretmenin bazı öğrencilerle oynadığı bir tiyatro, sınıfın geneli de seyirci haline gelir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Rol Oynama Tekniği", "Rol oynama tekbiğindebir fikir, durum ya da olay bir grup önünde dramatize edilir. Grubun üyeleri yalnızca dinlemek ya da tartışmak yerine olayın nasıl oluştuğunu izler ve konunun ayrıntısına inerler.\n" +
                    "* Bu yöntem ileöğrenciler bizzat katıldıkları ve hoşlendıkları eylemlerden daha fazla tecrübe edilinirler, hislerini ve tutumlarını açıklama imkanına sahip olurlar. Öğrencilerin yaratıcı tutum ve davranışları gelişir. Yine bu yöntemin uygulanması ile öğrenci derste daha iyi güdülenir. Öğrencler yüz yüze gelecekleri gerçek durumlar için hazırlanırlar.\n" +
                    "* Rol oynama tekniği faydalarının yanı sıra uygulanması esnasında çeşitli sınırlılıklarda beraberinde getirir. Bu yöntemin uygulanması küçük grup gerektirir. Sınıfın tamamı görevlendirilemez. Zaman gerektirir. Öğrenciler rolleri oynarken sık sık aşırıya kaçarlar. Bu durum sınıf atmosferini bozacağı gibi öğrenmeyi de olumsuz etkiler.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Benzetişim (Simülasyon) Tekniği", "Sınıf içinde öğrencilerin bir olayı gerçekmiş gibi ele alıp üzerinde çalışma yapmalarına olanak sağlayan bir öğretim tekniğidir.Diğer bir deyişle öğrenmeyi desteklemek amacıyla gerçeğe uygun olarak geliştirilen bir model üzerinde yapılan bir öğretim yaklaşımıdır.\n" +
                    "* Gerçek durumların önemli boyutları ya bir modelde özel olarak ya da diyagram halinde, resimler ve diğer sembolik yollarla belirlenmektedir.Uygulamada zaman ve mekan genel olarak sınırlanmakta yaratılmak istenilen gerçek durumun anlamlı yönleri seçilmektedir.Benzetim tekniği bir düşünce değil bir hareket bir olaydır.\n" +
                    "* Öğrenciler bu olaya katılırlar, ona şekil verirler.Rolleri, işlevleri, görev ve sorumlulukları vardır.Problem çözme, karar verme durumundadırlar.Yani analiz, sentez ve değerlendirme yapmak durumundadırlar.\n" +
                    "* Pilotların uçuş öncesi yapay koşullarda eğitim görmeleri, uçak bombardıman timlerinin ve astronotların eğitimi, tıpçıların kadavra üzerinde çalışmaları bu tekniğe örnektir.Görüldüğü gibi benzetim tekniği hemen her alanda etkinlikle kullanılabilmektedir.\n" +
                    "* Özellikle öğrenciyi gerçek ortamda, gerçek araçlarla yetiştirmenin güç, tehlikeli ve maliyetinin fazla olduğu durumlarda gerçeğin bir modeli üzerinde yetiştirme en etkin yoldur.Böylece savurganlığın ve olabilecek kazaların önüne geçilmiş olunmaktadır.Daha önemlisi öğrenci rahat bir ortamda gerçek durumun baskısı olmaksızın öğrenmektedir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Drama (Bağımsız rol yapma) Tekniği", "Öğrencilerin hangi durumda nasıl davranmaları gerektiğini yaşayarak öğrendikleri bir uygulamadır. Dramada birey kendi açısından yaklaşır ve ne yapması gerektiğine ilişkin (doğaçlama) rol oynar. Problem çözme ve iletişim kurma yeteneğini geliştirir. Öğrencinin kendi duygu ve düşüncelerini, başka bir kişiliğe girerek ifade etmesini sağlayan bir tekniktir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Mikro Öğretim Tekniği", "Öğrenci tarafından yapılan (kısa süreli olarak) bir davranışın gözlenmesi, gözlemin kayıt edilip öğrenciye hatalarının bildirilmesi ve davranışın belli bir yeterlik düzeyine gelene kadar öğrenciye tekrar ettirilmesi ve her tekrarda hataların belirtilip düzeltilmesi yoluyla öğrencilerin davranışı belli bir yeterlik düzeyinde kazanması amaçlayan bir öğretim tekniğidir. ‘’ Öğret-yeniden öğret ’’ süreci gerçekleştirilir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Eğitsel Oyunlar Tekniği", "Eğitsel oyunlar, öğrenilen bilgilerin pekiştirilmesini ve daha rahat bir ortamda tekrar edilmesini sağlayan etkinliklerdir. Eğitsel oyunlarla derste konular daha ilgi çekici duruma getirilebilir, etkin olmayan öğrencilere, derse katılma olanağı sağlanır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Altı Şapka Tekniği", "Yaratıcı düşünme becerilerini geliştirmede kullanılan bir grup tartışması tekniğidir. Düşünme öğretiminde kullanılır. Eleştirisel ve çok yönlü düşünmeyi sağlar. Bu teknikte altı değişik renklerde şapkalar ve anlamlarını temsil eden düşünceler bulunmaktadır.\n" +
                    "Beyaz şapka: Tarafsız bir şekildebilgiyi temele alarak düşünür.\n" +
                    "Kırmızı şapka: Önsezilere dayalı olaylara duygusal tepki vermeyi temel alır.\n" +
                    "Siyah şapka: Olaylara eleştirisel ve karamsal yönden bakar.\n" +
                    "Sarı şapka: Olaylara iyimser ve yapıcı yönden bakar.\n" +
                    "Yeşil şapka: Olaylara yeni ve farklı çözüm yolları bulmak, yaratıcı ve yenilikçi fikirler üretmeye dayalı düşünür.\n" +
                    "Mavi şapka: Olayların tüm olası yönleriyle gören ve değişkenleri kontrol altında tutan bakış açısıdır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Görüş Geliştirme Tekniği", "Görüş geliştirme, belirgin çelişkiler ve kutuptanmış tutumları kapsayan konuların öğretiminde öğrencilerde görüş geliştirmek için kullanılan bir tartışma yöntemi olarak tanımlanabilir. Bir konuda yapılan düşünce alışverişinde, tartışmasında kişinin kendi görüşünü diğer görüşlerden de yararlanarak geliştirmesini ve savunmasını ya da değiştirmesini, karşı çıktığı görüşü benimsemesini sağlayan bir öğretme – öğrenme tekniğidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Vızıltı (Fısıltı) Grupları Tekniği", "Öğrencilerin gruptaki öğrenci sayısı kadar dakika konuşma yapmasıyla gerçekleşir. Vızıltı 55 kişilik bir gruptur ve her grup 5’er dakika konuşur.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kartopu (PİRAMİT) Tekniği", "Tüm öğrencilerin katılımını sağlayan bir tekniktir. Öğretmen bir konu verir ve tüm katılımcıların önce bireysel olarak bu konuyu düşünmelerini ister. Ardından iki kişilik ekipler oluşturulur ve bu ekipler düşüncelerini birbirleriyle paylaşırlar. Daha sonra çiftlerin oluşturduğu dörtlü ve sekizerli gruplar şeklinde kademeli olarak ilerleyen ve finalde herkesin karşısında sunum yapılan bir tartışma tekniğidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Köşeleme Tekniği", "Öğrencilere yöneltilen bir soru veya sorun karşısında çok kısa alternatifler alınır. Daha sonra her bir alternatif için bir köşe(masa) oluşturulur. Aynı alternatifi savunan öğrenciler köşeye toplanır ve kendi içlerinde konuyu tartışırlar. Düşüncelerini ve gerekçelerini savunan bir raporhazırlarlar ve her gruptan bir temsilci çıkarak grubun tezini sınıfa açıklar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Akvaryum Tekniği", "Sınıfın ortasına 2-4 öğrenci çıkarılır ve diğer öğrenciler bu öğrencilerin etrafında bir daire oluşturacak şekilde otururlar. Yaklşaık 10 dakika kendi aralarında bir konu hakkında tartışır veya deneyimlerini paylaşırlar. Herkes düşüncelerini ifade eder. Bu sırada diğer öğrenciler aynı bir akvaryumu izler gibi konuşan arkadaşlarını izler ve gözlem yaparlar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Rulman (Top Taşıma) Tekniği", "Sınıf iç içe iki çember oluşturulacak şekilde düzenlenir. Sandalyelerde oturulan dış çemberde yer alanlar içe, iç çemberde yer alanlar dışa bakacak şekilde otururlar. Öğretmen tarafından verilen bir konu veya anlatılan bir senaryodan sonra karşılıklı gelen iç ve dış çember öğrencileri birbirlerine düşünce ve çözümlerini anlatırlar. Belirlenen süre dolduğunda dış çemberdeki öğrenciler sandalyelerinden kalkarak bir yandaki sandalyeye otururlar. \n" +
                    "    Karşısına yeni bir arkadaşı gelen öğrenciler yine düşünce ve çözümlerini paylaşırlar. Bu uygulama 3 – 4 kere tekrarlanabilir. Böylece öğrenciler farklı kişilerin değişik düşüncelerini ve çözümlerini öğrenerek zengin bir bakış açısı kazanabilirler.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Dedikodu Tekniği", "Öğrencilerin konuyu kavramaya çalışmasını, o konuda düşünmesini ve konu hakkındaki çeşitli düşüncelerini öğrenip onları değerlendirmesini sağlar. Öğrenciler ikişerli gruplara ayrılır, verilen konuyu ya da sorıuyla ilgili düşüncelerini birbirlerine söylerler. Ve eşler sürekli birbirinden ayrılıp yeni ikililer oluştururlar. Diğer grup arkadaşlarının fikrini yeni grup arkadaşlarına söylerler. Bu, eş değiştirip fikirlerin yaygınlaştırılması, durumun tekrarlanması teknik için önemlidir. Sürecin sonunda fikirler sınıf içinde tartışılır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Mahkeme Tekniği", "Bir konu üzerinde öğrencilere düşünmeye yöneltmek, iyi anlaşılmayan noktaları açıklamak ve verilen bilgileri pekiştirmek amacıyla kullanılan bir tekniktir. Sınıfta sanal bir mahkeme kurulması şeklinde uygulanan bu teknik birçok öğrencinin etkinliğe katılımını sağlar. Belirlenen konuya yönelik sınıf ortamında bir mahkeme kurulur. Taraflar, sanıklar, şahitler seçilir. Karşılıklı görüşlerini savunan öğrenciler tartışma ortamı oluşturarak jüri ve hakim karşısında davalarını haklı gösterme çabasına girerler.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Konuşma Biletleri Tekniği", "Öğrencilerin eşit konuşma sürelerine sahip olmasına önem verilir. Bunu sağlayabilmek için her bir öğrenciye üç bilet verilir. Her bir biletin belirli konuşma süresi (yolculuk süresi) vardır. Öğrenciler biletleri bitene kadar konuşabilirler. Bileti biten öğrencilerin konuşma hakkı sona erer.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Tombala Tekniği", "Konunun sözcükleri ya da kavramları tombala kartlarına yazılır. Bazıları boş bırakılır. Hazırlanan kartlar öğrencilere dağıtılır. Öğretmenin söylediği, tanımladığı sözcük ya da kavram kapatılır. Tombala oyununda olduğu gibi ilk sırayı dolduranlar birinci çinko, ikinci sırayı dolduranlar ikinci çinko ve üçüncü sırayı dolduranlar da tombala yapmış olurlar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Arkası Yarın Tekniği", "Arkası yarın tekniğinde öğretmen bir hikâye okurken veya bir film izletirken daha önceden belirlediği bir noktada hikâyeyi durdurur. Bundan sonra ne olabilir, niçin gibi sorular sorar\n" +
                    "ve çok sayıda öğrenciden yanıtlarını gerekçeli olarak alarak tahtaya yazar. Görüşler alındıktan sonra hikâye veya film devam ettirilir ve öğrenci tahminleri ile karşılaştırılır, öğrencilerin nerede yanıldıkları onlara buldurulur. Her bölümden sonra sınıfta tartışma açılmalı ve bir sonuca varılmalıdır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Balık Kılçığı Haritası (Neden-Sonuç Diyagramı) Tekniği", ": Ishikawa  diagramı olarak da bilinen balık kılçığı tekniği, bir problemin nedenlerini ve alt nedenlerini ortaya çıkarmaya yardım eder. Ayrıca, tüm öğrencilerin derin ve nesnel bir görüş kazanmalarını ve problemin çeşitli bölümleri arasında ki önemli ilişkileri görmesini, öğrencilerin daha derin bir şekilde bir problem üzerinde yoğunlaşmasını sağlar. Öğrencilerin düşüncelerini organize etmeye yardım eder; ancak, problem için çözümler sağlamaz. Bu teknik; birlikte çalışmayı, gerçeği aramayı, değişik görüşlere açık olmayı ve karşıt görüşlerin ortaya çıkmasını sağlar.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kavramsal Karikatür (Konuşma Balonu – Çizgi Karakter) Tekniği", "Bir konuyu tamamen öğretemeyen, kavram ya da olay hakkında tartışma başlatıp araştırmaya sevk etmeyi amaçlayan bir tekniktir. Karikatür, tartışma ortamı yaratmak için uyaran olarak kullanılır. Birbirinden farklı görüşlerin yer aldığı bir grup tartışmasını oluşturma fikrini temel almaktadır. Öğrencilerin derse ilişkin bilgi ve becerilerini pekiştirmek ve kalıcılığını sağlamaya yardımcı olur. Öğrenciler, öncelikle dersin temel kavram ve ilkelerine dayalı bir konu ile ilgili yanlış ve doğru ifadeleri oluşturmaktadır. Belirlenen bu ifadeler, insan veya hayvan figürleri kullanılarak bir poster üzerinde resimlendirilmekte ve öğrenciler, tartışmalarını bu poster üzerinde yapmaktadırlar. Tartışma sonrasında oluşan sonuçlar hazırlanan çalışma kağıdı üzerinde belirtilmektedir. Çalışma kağıdında, posterde belirtilen ifadelerden hangisinin doğru olduğu işaretlenmekte daha sonra yanıtın gerekçesi belirtilmektedir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Kavram Haritası Tekniği", "Kavramların; kendine özgü özelliklerinin veya diğer kavramlarla ilişkilerinin şekil ya da sözcüklerle önermeler şeklinde göstermek için tasarlanan şematik çizimlerden oluşan öğretim amacıdır. Analitik ve semantik düşünmeyi , sistematik sınıflama yapmayı sağlar. Öğretimin her kademesinde kullanılır. Ön bilgilerle yeni kavramların bütünleştirilmesini sağlar.\n" +
                    "Kavram haritası türleri;\n" +
                    "1. Örümcek Harita: Temel bir kavramı tanımlamak için kullanılmaktadır. Kavramın ana ve alt bölümlerini gösterir. Merkezdeki temel kavram nedir? Bununla ilgili özellikler nelerdir? Gibi sorulara yanıt aranır.\n" +
                    "2. Akış Çizgisi: Olayların akışını ve akış esnasında bu olaylar arasındaki ilişkileri gösteririr.\n" +
                    "3. Zincir Kavrama Haritası (Olaylar Zinciri Dizinleri): Herhangi bir kavramın aşamalarını, bir işlemin basamaklarını, olayların sırasını ve sonuçlarını açıklamak için kullanılır.\n" +
                    "4. Sınıflama Haritası: Öğrenilen bilgileri sistematik olarak sınıflamayı amaçlar. Bütünü genelden özele doğru mantıklı panolara ayıran şemadır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("İstasyon Tekniği", "İstasyon Yöntemi, bütün sınıfın her aşamada (her  istasyonda) çalışarak bir önceki grubun yaptıklarına katkı sağlayarak bir basamak ileri götürmeyi, yarım kalan işi tamamlamayı öğreten bir tekniktir. Sınıfın tamamı 2-8 istasyona bölünür. Kaç istasyon varsa o kadar grup oluşturulur. Bu istasyonlar slogan yazma, afiş hazırlama, öykü yazma gibi istasyonlar olabilir. Her istasyona gidecek öğrenciler belirlenir. Her gruba bir istasyon şefi atanır (öğretmen de üstlenebilir). Şef gruba kılavuzluk yapar, iş bitince ürünleri toparlar. Gruplar istasyonlara dağılır, her grup gittiği istasyonda 10 dakika çalışır. Süre sonunda gruplar yer değiştirir. Tüm grupların tüm istasyonda çalışması sağlanır. İstasyona gelen her yeni grup bir önceki grubun bıraktığı yerden devam eder. Süre sonunda tüm grupların işleri toparlanır. Yapılan çalışmalar sergilenir, öyküler okunur, afişler asılır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Analoji (Benzetim)/Metafor Tekniği", "Analoji, bilinmeyen bir olayı bilinen bir olayın koşullarında düşünerek, iki olay arasında karşılaştırma yaparak ve ilişkiler kurarak, bilinmeyen olayı anlama sürecidir.\n" +
                    "Bilinen durum “kaynak”, bilinmeyen durum ise ”hedef” tir. Hedefe ulaşmak için var olan kaynaklardan çağrışım yapılır. Örneğin, kan dolaşımının trafik akışına benzetilmesi. Somut benzetmelerde kullanılır.\n" +
                    "Metafor ise soyut benzetmelerde kullanılır. Örneğin, Öğretmen beynin görevini anlatırken Türkiye haritası üzerinde Ankara’yı beynin yerine koyarak anlatmaya çalışması gibi.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Altı Ayakkabılı Uygulama Tekniği", ": Uygulama becerisi ve analitik düşünme yeteneği kazandırmayı amaçlayan tekniktir. Altı şapkalı düşünme tekniği düşünme biçimi, altı ayakkabılı uygulama tekniği ise düşüncelerin uygulandığı bir teniktir. Ayakkabıların renklerine göre anlamları:\n" +
                    "Lacivert (Resmi) Ayakkabı : Resmiyeti temsil eder. Rutin işler mümkün olduğunca mükemmel biçimde uygulanır.\n" +
                    "Mor (Binici) Çizmeler: Yetkiyi ifade eder. Kişi kendi yeteneği ile değil otoriteden aldığı resmi yetki ile hareket eder.\n" +
                    "Kahverengi (Yürüyüş) Ayakkabı: Karmaşık durumları temsil eder. Pratikliği gerektirir. Uygulamaya dönük davranış ve esneklikten faydalanılarak sonuca varılır.\n" +
                    "Gri (Spor) Ayakkabı: Gri renk net olmayan durumları, spor ayakkabı da resmi olmamayı ve rahatlığı simgeler. Bilgi toplarken rahat bir biçimde çok yöntü olmayı ve tarafsız davranmayı gerektirir.\n" +
                    "Turuncu (Lastik) Çizmeler: Tehlike, aciliyet ve krizi ifade eder. Odaklanma ve öncelik oluşturma duygusu en önemli özelliğidir.\n" +
                    "Pembe (Ev) Terlikler: İnsancılığı, duyarlılığı ve sıcaklığı temsil eder. Korumayı, acımayı, insanların duygu ve hassasiyetlerine karşı duyarlı olmayı çağrıştırır.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınıf Dışı Öğretim Teknikleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Gezi", ": Sınıftaki konularla ilgili olarak yapılan planlı ziyaretlerdir. Öğrenciye kazandırılacak davranışlar öğrencilerle birlikte belirlenmelidir. Gezi yapılacak yer bu hedef davranışlara göre önceden belirlenmelidir. İzinler alınmalı, gezi yapılacak yerde sorulacak sorular önceden belirlenmelidir. Öğrencilerle birlikte (hedefe ve belirlenen yere göre)gezi planı hazırlanmalıdır. Gezi plana göre yapılmalıdır. Geziden sonra, yapılan etkinlikler ve sonuçlar gezinin amaçları doğrultusunda sınıfta tartışılmalıdır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Gözlem", ": Gerçek yaşamdaki olayların, nesnelerin, insanların, bir plan dâhilinde izlenmesi ile gerçekleşen bir tekniktir. Tabiatta var olan bir şeyin kendi şartlarında incelenmesine “gözlem” denir. Tabiattaki bir olay, durum ya da varlık araştırmacının oluşturacağı şartlarda incelenirse bu “deney”dir. Gözlem tekniği öğrencilere inceleme olanağı tanımasının yanı sıra gözlem yapılan konuyu kavramayı sağlar. Sistematik olmalı ve bir formatı (gözlem formu ve fişi) olmalıdır. Gözleme başlamadan önce hedefler önceden belirlenmelidir. Öğrencilere gözlenecek durum ya da olay ile ilgili önceden bilgi verilmelidir. Farklı öğrenciler aynı durum ya da olayı gözlemeli sonuçlar karşılaştırılmalıdır. Gözlemci gözlemi yaparken doğal ortamı bozmamalı, böyle bir durum söz konusu olursa gözlem gizli gerçekleştirilmelidir. Gözlem sonuçları vakit kaybetmeden kaydedilmelidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Görüşme", "Sınıfta işlenen konularla ilgili bilgileri genellikle uzmanlardan elde ederek öğrenmeyi sağlar.\n" +
                    "Bu teknik öğrencinin uzmanlarla dışarıda görüşmesiyle gerçekleşeceği gibi, sınıfa uzman getirerek de gerçekleşebilir. Sınıfa uzman getirilerek gerçekleşen görüşme tekniğine kaynak kişiden yararlanma ismi de verilir. Görüşme tekniğinde amaçlar (hedefler) doğrultusunda sorulacak sorular önceden belirlenir ve bir zaman sınırı konulur.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Ödev", "Ödev, öğretmenler tarafından çocukların ders dışı zamanlarda hazırlamaları için verilen; bazen derse hazırlık ve çoğu kez de derste öğrenilenleri pekiştirme, tekrar, genişletme ve tamamlamayı bazen de değerlendirmeyi amaçlayan çalışmalardır. Bireysel farkları ve hızı dikkate almayı sağlar. \n" +
                    "Yazılı olmakla beraber sözlü ev ödevleri de bulunabileceği gibi, bireysel olmakla beraber grup halinde yapılan ev ödevleri de bulunabilir. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5. Sergi", "Yazı, şiir, heykel, resim gibi ürünlerin uygun şekilde yerleştirilerek gözler önüne konulması, incelemeye sunulmasıdır. Öğrenciler, hem ürünleri hazırlarken hem de ürünleri incelerken öğrene bilme fırsatı bulurlar. Öğrenicinin öğrenme sürecindeki etkinliklerini paylaşma amacıyla yapılır. Sergiler, grup bilincini ve grupla çalışma alışkanlığını geliştirir. Motivasyonu arttırır. Ürün ve süreç değerlendirmeye olanak tanır.", Card_Ozellikleri.ALT_BOLUM));
        }

        else if (isim.equals("35")) {

            list.add(new Card_Ozellikleri("ÖLÇME VE DEĞERLENDİRME", null, Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("Eğitim Süreci İçinde Ölçme ve Değerlendirmenin Yeri", "*  En yaygın anlamıyla eğitim “insan davranışlarında kendi yaşantısı yoluyla istendik yönden değişiklikler meydana getirme sürecidir” İnsan öğrendiklerinin büyük bir kısmını aile ve okul çevresinde edinir. İnsanın eğitim sürecinin amaçları, yöntemi, içeriği belirlenmiş ve özel bir çevrede ve eğitimi meslek edinenlerin rehberliğinde gerçekleşen kısmına Planlı Eğitim denir. Böyle bir eğitim sürecinde önce bazı soruların cevapları bulunur. Bunlar aşağıda gösterilmiştir.\n" +
                    "* Dikkatlice incelendiğinde “ölçme ve değerlendirme sürecinin” böyle bir eğitim etkinliğinde yerini kolayca görebiliriz:\n" +
                    "1)   Niçin eğitileceğiz?  (Eğitimin Amacı)\n" +
                    "2)   Ne Öğreneceğiz?  (Eğitimin İçeriği)\n" +
                    "3)   Nasıl kazandıracağız?  (Eğitimin Yöntemi)\n" +
                    "4)   Nerede eğiteceğiz? ( Eğitimin Ortamı)\n" +
                    "5)   Ne kadar öğrenildiğini, amaçlara ne oranda ulaşıldığını nasıl anlayacağız?  (Ölçme ve Değerlendirme)\n" +
                    "Eğitim sürecinde ölçme ve değerlendirmenin fonksiyonları şöyle özetlenebilir;\n" +
                    "Değerlendirme; \n" +
                    "* Öğrenciye davranışını nasıl  değiştireceği hakkında bilgi verir.\n" +
                    "* Yeterince başarılı olan öğrenciyi motive eder.\n" +
                    "* Öğrenci hakkında verilecek kararlara dayanak olur.\n" +
                    "* Öğretmenin kendi öğretiminin ne derecede etkili olduğunu kestirmesine yardım eder.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ölçme Türleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Doğrudan Ölçme", "Doğrudan ölçmede, ölçme konusu olan özelliğin kendisiini dolaysız olarak ölçebiliriz. Örneğin, boy ve ağırlığın ölçülmesini ele alalım. Uzunluk ve ağırlık, kendileriyle aynı türden bir araçla, bir birimle ölçülür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Dolaylı Ölçme", "Bazı özellikler doğrudan ölçülemez. Doğrudan ölçülemeyen özellikler, onlarla ilgili olduğu bilinen ya da ilgili olduğu sanılan başka bir özellik gözlenerek, dolaylı olarak ölçülürler. Örneğin, sıcaklık ve zekâ, dolaylı olarak ölçülür.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Ölçek Kavramı ve Ölçek Türleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Sınıflama Ölçekleri", "* Gözlemin en basit biçimi, nesneleri, belli bir yönden benzeyip benzemediklerine göre sınıflamaktır. Bu, nesneler arasındaki farklılık ve benzerliklerin çok kaba saptanması işlemidir.\n" +
                    "* İnsanların kadın-erkek, evli-bekar-dul-boşanmış kategorilerine ayrılması sınıflamaya iyi bir örnektir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Sıralama Ölçekleri", "* Bu tür ölçekler, belli bir özelliğe sahip oluş miktarı bakımından nesneleri bir sıraya koymakla elde edilir. Bu ölçekte nesneler, bir özelliğe en az sahip olandan en çok sahip olana ya da en çok sahip olandan en az sahip olana doğru sıralanır ve sonradan her bir sıraya bir sayı verilir.\n" +
                    "* Öğrenciler, boy sırasına ya da herhangi bir sınavdan aldıkları puana göre başarı sırasına konulabilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Eşit Aralıklı Ölçek", "* Ölçülen özelliğin belli bir başlangıç nokrasına göre ve belli bir özelliğe sahip oluş miktarına göre eşit aralıklarla sıralanmasını ifade etmektedir. \n" +
                    "* Eşit aralıklı ölçeklerde birimlerin eşit olması ve sıfırın izafi bir sıfır olması gerekmektedir. Bu ikisinde biri dahi olmazsa eşit aralıklı ölçek olmaz.\n" +
                    "* Termometrenin 0 dereceyi göstermesi sıcaklık olmadığını belirtmez. Buradaki sıfır izafi yani keyfi sıfırdır.\n" +
                    "* Dolaylı ölçme türüne girmektedir. Oran hesapları yapılamaz. Ancak toplama ve çıkarma işlemleri ile aritmetik ortalama ve standart sapma hesaplanabilir.\n" +
                    "* Örnek; Bir dağın rakımını hesaplamak.(sıfır rakım dağ yok demek değildir bağıl sıfırdır.)\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Eşit Oranlı Ölçek", "* Ölçülen özellik hakkında en duyarlı ölçme sonuçlarını veren ve en çok bilgiyi sağlayan ölçek türüdür. \n" +
                    "* Sıfır, mutlak yani gerçek sıfırı ifade eder. \n" +
                    "* Gerçek oran hesabı vardır.\n" +
                    "* Her türlü istatistiki işlem yapılabilir. Toplama, çıkarma, çarpma, bölme yapılabilir.\n" +
                    "* Örnek; Kütüphanede bulunan kitap sayısını belirlemek. Bir masanın uzunluğunu ölçmek.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Ölçüte Göre Değerlendirme", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a) Mutlak Değerlendirme", ": Bu değerlendirme sisteminde puanlar, önceden belirlenmiş sabit kriterlere göre değerlendirilerek nota çevrilir. Bir öğrencinin başarısı, başka öğrencilerin başarısından bağımsız olarak değerlendirilir. Örnek; bir sınavda 70 puan alanların başarılı olarak değerlendirilmesi bir mutlak değerlendirmedir. Başarılı olabilme kriteri 70 puan olarak belirlenmiştir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b) Bağıl Değerlendirme", "Puanlar belirlendikten sonra değerlendirmenin bazı istatistikî verilere göre (ortalama, ortanca, en düşük puan gibi) yapılması durumudur. Bağıl değerlendirmede öğrencinin başarısı, bağlı bulunduğu sınıfın başarısıyla kıyaslanır. Örnek; başarılı olmak, sınıfın ortalamasından daha yüksek puan almak olarak değerlendiriliyorsa bu bir bağıl değerlendirmedir.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Amaca Göre Değerlendirme", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("a) Tanıma ve yerleştirmeye yönelik değerlendirme", "* Temel amaç, önkoşul eksikliklerinin belirlenmesi ve giderilmesidir.\n" +
                    "* Tam öğrenme desteklidir.\n" +
                    "* Eğitim sürecinin başında, süreç öncesinde hazırbulunuşlukların belirlenmesini hedefler.\n" +
                    "* Genelde öğrencilerin bir okula, kursa vs. seçilmesi için kullanılır.\n" +
                    "* Her türlü seçme ve seçme testi tanıma yerleştirme değerlendirmesidir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("b) Düzey Belirleyici (Özetleyici) Değerlendirme", "* Öğrencinin öğrenme düzeyinin belirlenmesinde kullanılır.\n" +
                    "* Örnek; Geçti, kaldı, başarılı, başarısız.\n" +
                    "* Dersteki kritik davranışları ölçen sorulardan oluşan başarı testleri kullanılır.\n" +
                    "* Hedefe ne kadar ulaşıldığına ve ders başarısının belirlenmesine yardımcı olur.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("c) İzleme ve Biçimlendirmeye Yönelik (Geliştirici) Değerlendirme ", "* Öğrenme eksikliklerinin belirlenmesi amacıyla yapılmaktadır.\n" +
                    "* Eksikliklerin kaynağının belirlenmesi, giderilmesi ve öğrenmelerin tamamlanmasına çalışılır.\n" +
                    "* Örnek; İzleme testleri, ünite testleri, formative testler, quizler, vizeler vs.\n" +
                    "* Testler öğrencilere not vermek amacıyla kullanılmaz.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Bir Ölçme Aracında Bulunması İstenilen Nitelikler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Geçerlik", "Bir ölçme aracının ölçmeyi amaçladığı özelliği, başka herhangi bir özellikle karıştırmadan, doğru olarak ölçebilme derecesidir. Başka bir deyimle bir ölçme aracının, geliştirilmiş bulunduğu konuda maksada hizmet etmesidir. \n" +
                    "Örnek; uzunluk ölçmek için geliştirilmiş bir araç olan metre, kişilerin boylarını ölçme maksadına hizmet eder; fakat kişilerin ağırlıklarını ölçme maksadına hizmet etmez.\n" +
                    "a) Kapsam geçerliği: Bir bütün olarak testin ve testteki her bir maddenin maksada ne derece hizmet ettiğidir. \n" +
                    "* Bir sınav testinin ölçmek istediği konulara kapsam denir.\n" +
                    "* Başarı testlerinin daima önceliğidir.\n" +
                    "* Hedeflerin sınavda örnek soru olarak karşımıza çıkmasıdır.Konular sınavda ne eksik ne de fazla olmalıdır.\n" +
                    "* Konuların genişliğine göre sorular dengeli bir şekilde sınav kağıdına dağıtılmalıdır.\n" +
                    "* Burada kapsam geçerliliğini kontrol etmek için farklı yöntemler uygulanabilir;\n" +
                    "Belirtke Tablosu: Kaç ders saati varsa ona oranla soru sayısını tablo ile belirlemek.\n" +
                    "Uzman Görüşü: En az iki uzmana hazırladığımız testi götürüyor ve onlardan öneri alıyoruz.\n" +
                    "İstatistiksel Yol: Bizim hazırladığımız test ile daha önceden hazırlanan bir test aynı gruba verilir. Aralarındaki korelasyon yakın ise sınavın kapsamı yüksektir. \n" +
                    "b) Yordama geçerliği: İstatistiksel teknikler kullanılarak ve bilinenlerden yararlanılarak bilinmeyen durumlar hakkında yapılan geleceğe yönelik tahminlerde bulunması işlemidir.\n" +
                    "c) Yapı geçerliği:\n" +
                    "* Testin istenilen yapıyı ölçme amacıdır.\n" +
                    "* Davranışın ölçme aracı uyuşmasıdır.\n" +
                    "* Çevre bilinci yüksek birinin , çöpü yere atmamasıdır.\n" +
                    "* Çalışmayan bir öğrenci sınavdan yüksek alırsa yapı geçerliliği düşüktür.Çünkü başarıyı ölçen bir testte başarılı olmayan bir öğrenci yüksek almıştır.\n" +
                    "d) Görünüş geçerliği: Bir testin gerçekten ne ölçtüğü ile ilgili değil, onun ne ölçüyor göründüğüyle ilgilidir. Örnek; Kapağında ‘’Fizik Testi’’ yazılı olan bir testin içinde fizikle ilgili sorular varsa, söz konusu testin görünüş geçerliliği vardır denir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Güvenirlik", "Bir testin, aynı gruba, aynı özellikte ilgili olarak arka arkaya yapılan ölçmelerde yaklaşık olarak aynı sayısal sonucu vermesi, o testin güvenilir olduğunu gösterir. Bir ölçme aracının ölçmek istediği özelliği hatasız ölçebilmesine güvenirlik denir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Kullanışlık", "Bir testin kullanışlığı, onun geliştirilmesi, çoğaltılması, uygulanması ve puanlanmasının kolay ve ekonomik olması demektir. Kısaca, bir sınavın uygulanmasındaki kolaylıktır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Hata Türleri ", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Sabit Hatalar", "* Ölçmede hata türleri içinde yer alan sabit hata, ölçümden ölçüme değişmeyen hata türüdür.\n" +
                    "* Her ölçümde hata aynıdır ve kaynağı bellidir.\n" +
                    "* Ayıklanabilir bir hata türüdür.\n" +
                    "* Örnek; Öğretmenin herkese 10 puan fazla vermesi. \n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) Sistematik Hata", "* Ölçmede hata türleri konusunun ikincisi olan sistematik hata türünde, hata belli oranda karışır. Hatanın kaynağı bellidir ve hata düzeltilebilir. İki türlü olmaktadır;\n" +
                    "* Biri yanlılık türüdür. Doğrudan geçerlilik ile ilgilidir\n" +
                    "* İkincisi sistemli kısmıdır. Güvenirlik ile ilgilidir.\n" +
                    "* Örnek; Yazısı güzel olanlara 10 puan fazla vermek. Ölçmek istediği değişkene başka değişken kattığı için geçerliliği etkiliyor. Hatanın yanlılık türünden kaynaklanmaktadır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Tesadüfi Hata", "* Ölçmede hata türlerinin sonuncusu olan tesadüfi hatada, hata kaynağı belli değildir.\n" +
                    "* Hata düzeltilemez.\n" +
                    "* Ölçme sonuçlarına nereden , hangi miktarda, nasıl  karıştığı bilinmeyen hatalar tesadüfi hatalardır.\n" +
                    "* Örnek; Bir öğretmenin yazılı kağıtlarını okurken bazı soruların cevaplarını görmemesi tesadüfi hatalara örnek teşkil eder.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Sınav Türleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Yazılı sınavlar", "* Öğrenciler cevap vermede bağımsızdır. \n" +
                    "* Diğer sınav türlerine göre daha az sayıda soru bulunur.\n" +
                    "* Hazırlanması kolay fakat puanlanması yorucu ve subjektif bir özelliğe sahiptir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Sözlü sınavlar", "* Bilinen en eski sınav türüdür.\n" +
                    "* Hazırlanması kolay fakat uygulanması çok uzun zaman alan bir sınavdır.\n" +
                    "* Sınavın uygulanmasında sorular birbirinden farklı sorulacağından soruların zorluk derecesi ve kapsamı bakımından dengesizliklere yol açmaktadır.\n" +
                    "* Düşünme süresi bakımından adaletsizlikler vardır.\n" +
                    "* Puanlama objektifliği en düşük olan tekniktir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Kısa cevaplı sınav", "* Cevabı bir cümle, bir kelime, bir rakam veya tarih gerektiren sorulardır.\n" +
                    "* En iyi hatırlama yeteneğini sınar.\n" +
                    "* Cevaplama bağımsızlığı yazılı sınavlara göre daha sınırlıdır.\n" +
                    "* Hazırlanması yazılı sınavlara göre daha kolaydır.\n" +
                    "* Puanlama objektifliği yazılı sınavlardan daha yüksektir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Doğru –Yanlış sınavları", "* Puanlaması kolay, çabuk ve objektiftir.\n" +
                    "* Öğrencinin soruyu doğru cevaplama olasılığı %50 ile yüksek bir orandır.\n" +
                    "* Çoktan seçmeli testlerin yaygınlaşması ile değeri azalmıştır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5. Çoktan seçmeli sınav", "* Yazılı, sözlü ve kısa cevaplı sınavlara göre daha çok sayıda soru vardır. Bu durum bu sınavların kapsam geçerliliğini ve güvenirliliğini yükseltir.\n" +
                    "* Bu sınavlarda öğrencinin okuma yeteneği önemli rol oynar.\n" +
                    "* Sınavın hazırlanması uzun fakat puanlaması kolaydır ve kısa sürer.\n" +
                    "* Çok çeşitli bilgi, beceri, tutum ve yeteneklerin ölçülmesine uygun bir tekniktir.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Başlıca Alternatif Ölçme ve Değerlendirme Araçları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Portfolyo (Öğrenci gelişim dosyası/Ürün dosyası) Değerlendirme", "* Öğrenci gelişim dosyaları, öğrencilerin kendileri için önceden belirlenmiş hedeflere ulaşmak için izledikleri yolları gösteren, yaptıkları çalışmaların ve kazanımlarının kanıtı olan ürünleri koydukları dosyalardan oluşur.\n" +
                    "* Portfolyo ile hem öğrenme süreci hem de öğrenme ürünleri birlikte değerlendirilir.\n" +
                    "* Öğrenci gelişim dosyaları bireyseldir ve ortak hedefler için kullanılamaz.\n" +
                    "* Öğrenci gelişimini ve sürecini izlemek, öğrenciye sorumluluk ve araştırma duygusu kazandırmak, öğrencilerin kendisini değerlendirebilmesine olanak sağlamak, öğrencinin kendi ilgi ve yeteneklerini keşfetmesini sağlamak, sunum ve sosyal becerilerin kazanılması gibi hedefler öğrenci gelişim dosyası kullanmanın amaçları arasında yer almaktadır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Akran Değerlendirme", "* Akran değerlendirme, öğrencilerin kendi arkadaşlarının çalışmalarını belirlenen ölçütlere göre değerlendirildiği değerlendirme türüdür.\n" +
                    "* Akran değerlendirme içinde yanlı davranma olabileceği için böyle bir sınırlılık da bulunmaktadır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Öz Değerlendirme", "* Öğrencilerin, başta belirlenmiş ölçütleri kullanarak belli bir konuda kendi çalışmalarını, bilgi, beceri, tutum ve davranışlarını kendi kendilerinin değerlendirmesidir.\n" +
                    "* Akran değerlendirmede olduğu gibi öz değerlendirme içinde de yanlılık söz konusudur.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Grafikler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Çizgi Grafiği", "İstatistikî verilerin grafikte yerlerinin nokta ile belirlenmesi ve bu noktaların birleştirilmesi esasına dayanır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Sütun Grafiği (Histogram)", "Verilerin, grafik üzerinde aralıklar temel alınarak sürunlar halinde gösterilmesidir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Daire Grafiği", "Verilerin, farklı değerlerinin görülme sıklığının veya büyüklüğünün orantılı olarak daire içerisinde dilimler halinde gösterilmesidir.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Merkezi Eğilim Ölçüleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Aritmetik Ortalama", "Aritmetik ortalama, verideki puanların toplamının verideki eleman sayısına bölünmesiyle bulunur.\n" +
                    "Örnek: Bir öğrencinin beş dersten aldığı notlar 50, 70, 80, 60, 90 olduğuna göre ortalamasını bulalım.\n" +
                    "Çözüm: 50 + 70 + 80 + 60 + 90 = 350 dir. Aritmetik ortalama = 350/5 den 70 elde edilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Tepe Değer (Mod)", "Bir veri grubunda en çok tekrarlanan değere mod denir. Her değer yalnız bir kez ya da tüm değerler eşit miktarda bulunuyorsa mod yoktur.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Ortanca (Medyan)", "Bir dağılımın tam ortasındaki puana, değere ortanca denir. Bir grubu iki eşit parçaya böler. Tam ortada iki değer varsa, ikisi toplanır ve 2’ye bölünür.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4. Yüzdelikler", "Ölçümlerin istenen bir yüzdesinin kendisinden aşağıda kaldığı değeri gösterir. Yüzdelik, ölçek üzerinde, altında ve üstünde belirli oranları bulundurması istenilen noktanın değerine karşılıktır.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Dağılım Ölçüleri", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Ranj", "Bir dizi ölçüm içerisinde en büyük değer ile en küçük değer arasındaki farktır.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Standart Kayma", "Bir dizi ölçüm içerisinde, ölçümlerin aritmetik ortalamadan ne derece uzağa yayıldığını puan biriminde gösteren istatistiktir.", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3. Çeyrek Kayma", ": Bir dizi ölçüm içerisinde puanlar küçükten büyüğe doğru sıralanır. Üçüncü çeyrek (%75) ile birinci çeyrek (%25) arasındaki farkın yarısına çeyrek kayma denir.", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Test Geliştirme Süreci", "* Test geliştirmenin ilk aşaması test puanlarının hangi amaçla kullanılacağına karar verilmesidir. Eğitsel başarı testleri çoğunlukla öğrencilerin öğrenmelerini izlemek ve değerlendirmek için kullanılır. \n" +
                    "* Güvenilir ve geçerli bir test elde etmenin en önemli yolu, test geliştirme sürecini planlı bir biçimde yürütmektir.\n" +
                    "* Testte bulunacak toplam soru sayısı, kullanılan soru tipi, süresi, güçlük derecesi, puanlama biçimi, istenen doğruluk derecesi  kararlaştırılmalıdır.\n" +
                    "* Cevapların puanlanması elle mi yoksa makineyle mi yapılacağı, soru kitapçığından ayrı bir cevap kağıdı kullanılıp kullanılmayacağı kararlaştırılmalıdır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Korelasyon ve Madde Analizi Kavramları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1. Korelasyon", "* Korelasyon, iki veya daha fazla değişken arasında bir ilişki olup olmadığını, eğer ilişki varsa bu ilişkinin miktarını ve yönünü sayısal olarak belirlememizi sağlayan istatistiksel bir tekniktir. İki değişken arasındaki ilişkinin derecesine ise korelasyon katsayısı denir.\n" +
                    "* Hesaplanan korelasyon katsayısı -1 ile +1 arasında değer alır. -1’den küçük ve +1’den büyük olamaz. Korelasyonun pozitif (+) olması durumunda değişkenler aynı yönde değişmiş demektir. Korelasyon katsayısının + olması iki değişkenin aynı yönde bir ilişkide olduğunu, negatif (-) olması ise iki değişkenin arasında ters yönde bir ilişki olduğunu gösterir.  Eğer değişkenlerdeki artış veya azalış birbirine bağlı değilse korelasyon sıfır olur. Bu da değişkenler arasında ilişki yok anlamına gelir.\n" +
                    "* Korelasyon katsayısının, mutlak değer olarak, 0,70 ile +1,00 arasında olması yüksek; 0,70 ile 0,30 arasında olması orta; 0,30 ile 0,00 arasında olması ise düşük düzeyde bir ilişki olarak yorumlanabilir.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2. Madde Analizi", "* Temelde belli niteliklere sahip olması istenen bir teste alınacak maddeleri seçme sorunuyla ilgilidir.\n" +
                    "* Objektif test maddelerine verilmiş olan cevapların analizi, test geliştirmede ve testi daha iyi hale getirmede etkili bir araçtır.\n" +
                    "* Madde analizinin esası, cevap kâğıtlarını iki gruba ayırmak ve her bir maddeye iki grupta verilmiş olan cevapları birbiriyle karşılaştırarak yorumlamaktır.\n" +
                    "* Madde analiziyle şu üç soru cevaplandırılmaya çalışılır;\n" +
                    "a) Maddenin güçlük derecesi nedir?\n" +
                    "b) Madde, başarılı öğrenci ile zayıf öğrenciyi birbirinden ayırt ediyor mu?\n" +
                    "c) Maddenin çeldiricileri, yeterli bilgiye sahip olmayan zayıf öğrencileri yanıltmış mı ?\n", Card_Ozellikleri.ALT_BOLUM));
        }

        else if (isim.equals("41")) {

            list.add(new Card_Ozellikleri("T.C. İNKILAP TARİHİ VE ATATÜRKÇÜLÜK", null ,Card_Ozellikleri.EN_UST_BOLUM));

            list.add(new Card_Ozellikleri("OSMANLI DEVLET’İNİN SİYASİ DÖNEMLERİ ", null, Card_Ozellikleri.UST_BASLIK));

            list.add(new Card_Ozellikleri("a. Kuruluş Dönemi (1299 – 1453) ", "Kuruluşundan Fatih Sultan Mehmed’in İstanbul’u fethine kadarki dönemdir.", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("b. Yükselme Dönemi (1453 – 1579)", "İstanbul’un fethinden, Vezir Sokullu Mehmed Paşa’nın ölümüne kadarki dönemdir. ", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("c. Duraklama Dönemi (1579 – 1699)", "Sokullu Mehmed Paşa’nın ölümünden, Karlofça Antlaşmasına kadarki dönemdir. Duraklama döneminin nedenleri;\n" +
                    "* Merkezi otoritenin bozulması; I. Ahmet döneminde sancağa çıkma usulünün kaldırılması şehzadelerin tecrübesiz olmasına neden olmuştur. Bu nedenle şehzadeler saray kadınlarının ve diğer görevlilerin etkisinde kalmıştır.\n" +
                    "* Tımar Sisteminin ve Eyalet Yönetiminin Bozulması; Artan nüfus, tımar sisteminin bozulması ve celali isyanlarının çıkması nedeniyle şehirlere göç artmıştır. Eyalet yönetiminde artan rüşvetle tayin edilme durumu tecrübesiz ve bilgisiz yöneticileri arttırmıştır.\n" +
                    "* Ordu ve Donanmanın Bozulması; Bozulan tımar sistemi ile eyaletlerdeki asker sayısı azalmış ve yeniçerilerin başına buyruk davranışları artmıştır. Askerlikten farklı işlerle uğraşmaya başlayan yeniçeri “Ocak devlet içindir” anlayışı yerine “Devlet ocak içindir ” anlayışını benimsemiştir.\n" +
                    "* Ekonominin Bozulması; Azalan gelir kaynaklarının ve artan masrafların ortaya çıkması ekonominin bozulmasına yol açmıştır. Uzayan, kaybedilen savaşlar, artan saray giderleri, sık sık dağıtılan cülus bahşişleri, coğrafi keşiflerle açılan yeni ticaret yolları nedeniyle İpek ve Baharat yolunun öneminin azalması ekonominin bozulmasını sağlamıştır.\n" +
                    "* Eğitim Sisteminin Bozulması; Yükselme döneminde en gözde eğitim kurumları iken medreselerin çağın gerisinde kalması, pozitif bilimlerin okutulmaması, rüşvet, adam kayırma, beşik uleması uygulamalar gibi nedenlerle eğitim sistemi zayıflamıştır.\n" +
                    "* Toplumun Yapısının Bozulması; Tımar sisteminin bozulmasıyla artan göçler, huzur ve güven ortamının bozulması, ahlaki, kültürel ve ekonomik açıdan bozulmalar devletin otoritesini zayıflatmıştır.\n" +
                    "* Toprak Sisteminin Bozulması; Tımar sisteminin bozulması, toprak sisteminin bozulması ve ardından çıkan celali isyanları ile ortaya çıkan göç ile tarımsal üretim azalmış ve işsizlik oranı artmıştır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("d. Gerileme Dönemi (1699 – 1792)", "Karlofça Antlaşmasından Yaş Antlaşmasına kadarki dönemdir. Gerileme Dönemi siyasi olayları;\n" +
                    "* Osmanlı – Rus İlişkileri; Prut Antlaşması (1711)\n" +
                    "* Osmanlı – Venedik ve Avusturya Savaşları; Pasarofça Antlaşması (1718)\n" +
                    "* Osmanlı – Rusya ve Avusturya Savaşları; Belgrad Antlaşması (1739)\n" +
                    "* Osmanlı – Rus ve Avusturya Savaşları; Ziştovi Antlaşması (1791) ve Yaş Antlaşması (1792)\n" +
                    "* Osmanlı – Fransa İlişkileri\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yüzyıl Islahatları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Lale Devri", "Osmanlı tarihinde PasarofçaAntlaşmasından sonra Patrona Halil İsyanına kadar ki geçen döneme Lale Devri (1718-1730) denilmiştir. İsmini ünlü lale bahçelerinden alan bu dönemde yapılan eğlenceler ve israflar fakir halkın tepkisine yol açmıştır. Bu dönemde girişilen imar ve kültür faaliyetlerinde Avrupa medeniyetinin tesirleri hemen kendini gösterir. Bu dönemde;\n" +
                    "* Avrupa’nın önemli merkezlerine ilk defa geçici elçilikler kuruldu\n" +
                    "* İbrahim Müteferrika ile Said Çelebi’nin teşebbüsleriyle İstanbul’a ilk defa Türk matbaası kuruldu. Dini kitapların basılmaması şartıyla coğrafya ve edebiyata ait kitaplar basılmıştır. Böylece matbaanın kurulması Batı’daki gelişmelerin tekip edilmesine ve yeniliklerin yayılmasına imkan vermiştir.\n" +
                    "* Yeniçerilerden oluşan itfaiye örgütü kurulmuştur. (Tulumbacılar)\n" +
                    "* Doğu klasiklerinden bazı eserler Türkçe’ye tercüman edilmiştir.\n" +
                    "* Kütüphaneler açılmıştır.\n" +
                    "* Çiçek aşısı getirildi.\n" +
                    "* Resim, minyatür, edebiyat ve az da olsa bilim alanında gelişmeler olmuştur.\n" +
                    "* Avrupa’nın Rokoko ve Banoda tarzı örnek alınarak mimari eserler yapıldı.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("I. Mahmut", "* Humbaracı ve Topçu Ocaklarının Batı tarzında teşkilatlandırılmasına girişilmiştir.\n" +
                    "* Askerlik sahasındaki yenileşme kareketleri başlangıçta mühendislerin sonradan Avrupa’lı uzmanların idaresinde yürütülmüştür.\n" +
                    "* Aslen Fransız olan Humbaracı Ahmet Paşa Topçu Ocağının modernleştirilmesiyle görevlendirilmiştir.\n" +
                    "* Subay yetiştirmek amacıyla Kara Mühendishanesi kurulmuştur.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("III. Mustafa", "* Maliyede ıslahat yapılmış ve iç borçlanmaya gidilmiştir.\n" +
                    "* Deniz subayı yetiştirmek amacıyla Deniz Mühendishanesi kurulmuştur.\n" +
                    "* Sürat topçu ocağı kurulmuştur.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("I. Abdülhamit", "* Topçu Ocağı’na bağlı Sürat Topçuları teşkilatı geliştirilerek mevcudunu artırmıştır.\n" +
                    "* Lağımcı ve Humbaracı Ocaklarının gelişmesi sağlanmıştır.\n" +
                    "* Tımarda düzenlenmeye geçilmiş ve yeniçerilerin sayımı yapılmıştır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("III. Selim", "* Yaptığı yeniliklerle köklü bir reformcu niteliği taşıyan ve bunu kavrayan ilk padişahtır.\n" +
                    "* Fransa, İsveç ve İngiltere’den değişik dallarda uzman subaylar getirilmiştir. Böylece Yeniçerilerin yanında modern eğitimli ve donanımlı Nizam-ı Cedid ordusu kurulmuştur. (1794) Bu ordunun subay ihtiyacını karşılamak için Mühendishane-i Berri-i Humayun açılmıştır. Ordunun giderleri için ise İrad-ı Cedid hazinesi oluşturuldu.\n" +
                    "* Avrupa’nın belli merkezlerinde sürekli elçilikler açılmıştır. 18.yüzyıl sonlarında Avrupada’ki gelişmeleri takip etmek için ve diplomatik ilişkiler bakımından elçilerin gönderilmesi zorunlu hale gelmişti. (Paris, Londra, Viyana ve Berlin)\n" +
                    "* Ülke parasının değerini korumak için yerli malına özen gösterildi.\n" +
                    "* Vezir sayısı sınırlandırıldı.\n" +
                    "* Resmi devlet matbaası kurulmuştur.\n" +
                    "* Nizam-ı Cedid ordusuna karşı Yeniçeriler Kabakçı Mustafa Paşa’nın Önderliğinde ayaklanmışlardır. Bu ayaklanma sonucunda III. Selim tahtından indirilmiş ve öldürülmüştür. III. Selim dönemindeki yeniliklere II. Mahmut döneminde de devam edilmiş olması yenileşme açısından önemli bir aşama olduğunu gösterir.\n" +
                    "Islahatların Genel Özellikleri:\n" +
                    "* Osmanlı Avrupa’nın gerisinde kaldığını anlamış ve artık Batı’nın üstünlüğünü kabul etmiştir.\n" +
                    "* Önceki döneme göre daha önemli ve esaslı ıslahatlar yapılmasına rağmen amaçlanan hedefler gerçekleşmemiş ve devleti çöküşten kurtaramamıştır.\n" +
                    "* Savaşların yenilgiyle sonuçlanması ve toprak kayıplarının devam etmesi sonucunda ıslahatların askeri alanda yapılmasına neden oldu.\n" +
                    "* Halkın ıslahat konusunda isteği olmamış ve ıslahatlar padişah ve devlet adamlarının istediği sonucunda gerçekleşmiştir.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("e. Dağılma Dönemi (1792 – 1918)", "Yaş Antlaşmasından Mondros Antlaşmasına kadarki dönemdir.", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("II. Mahmut Dönemi", "Tahta geçtiğinde iki önemli mesele vardır. Birincisi anarşi unsuru haline gelen yeniçeriler, diğeri ise ayanların itaat altına alınamamasıydı. İlk anda ayanların üzerine gitmeyi tercih etti. Bunun için ilk olarak Osmanlı ile Ayanlar arasında Sened-i İttifak antlaşması yapıldı.\n" +
                    "Sened-i İttifak (1808): Alemder Mustafa Paşa tarafından hazırlanıp Ayanlar ve padişaha onaylatılan sözleşmedir. Buna göre; Ayanların Padişah’a sadakatlari, devlet asker ve vergi vermeleri güvence altına alınıyor, buna karşın Ayanların varlığı ve bütün hakları kabul ediyordu. Ayrıca ayanlar halka adil davranacaklar, bulundukları yerlerde devlet adına asker ve vergi toplayabileceklerdi. Bu sözleşmeyle;\n" +
                    "* Padişahın yetkisi sınırlandırılmakta, kendi otoritesinin yanında bir başka gücü kabul etmektedir. Bu bakımdan bazı tarihçilere göre Magna Charta’ya benzetilmektedir.\n" +
                    "* Bu haklarını ayanlara vermesi, Osmanlı’nın ayanlara bile söz geçiremeyecek hale geldiğinin kanıtı olmuştur.\n" +
                    "Askeri Alanda Yapılan Yenilikler:\n" +
                    "* Alemdar Mustafa Paşa tarafından \" Sekban-ı Cedit\" adında askeri ocak kuruldu. Ancak yeniçerilerin isyanı sonucu bu askeri ocak kaldırıldı.\n" +
                    "* Yeniçerilerden seçilerek \"Eşkinci\" adıyla yeni bir askeri ocak kuruldu. Ancak bir süre sonra yeniçeriler biz talim istemiyoruz diyerek, bu ocağın yapılanmasına karşı çıktılar.\n" +
                    "* Bunun üzerine sarayda büyük bir divan kurulmuş , Yeniçeri Ocağının kaldırılmasına karar verilmiştir. Halk,Esnaf,Medrese öğrencileri kaldırılmasını desteklediler.                                                                                                                     \n" +
                    "* Yeniçeri Ocağı kaldırıldı. \" Vaka-i Hayriye \" ( Hayırlı Olay) denilmiştir. Böylece, yeniliklerin önündeki en önemli engellerden birisi kaldırılmış oldu. Bu olayla Merkezi otorite güçlenmiş ve padişahlar yönetime yeniden egemen olmuştur.                                                                                                                                                                                                                               \n" +
                    "* \"Asakir-i Mansure-i Muhammediye\" ( Muhammed'in askerleri) adıyla yeni bir askeri ocak kuruldu.                                    \n" +
                    "* Askeri Bando kuruldu. ( Mızıka-i Hümayun )\n" +
                    "Eğitim ve Kültür Alanında Yapılan Yenilikler: \n" +
                    "* Medreselerin yanında yeni okullar açıldı. (Avrupa tarzı okullar)\n" +
                    "* Takvim-i Vekayi adlı ilk resmi gazete çıkarıldı.\n" +
                    "* İlköğretim İstanbul'da zorunlu hale getirildi.\n" +
                    "* Rüştiye ( Ortaokul ) ve Mekteb-i Ulum-u Edebiye adlı ,yüksek öğretime öğrenci yetiştirme amaçlı okullar açıldı.\n" +
                    "Hükümet ve Yönetim Alanında Yapılan Yenilikler:\n" +
                    "* Divan Örgütü kaldırılarak, yerine bakanlık (nazırlık) kuruldu.\n" +
                    "* Müsadere usulüne son verdi. Mülkiyet hakkı tanıdı.\n" +
                    "* Postaneler açıldı, pasaport şart koşuldu.\n" +
                    "* Karantina servisleri açıldı.\n" +
                    "* Tımar ve zeamet kaldırılarak devlet memurları maaşa bağlandı.\n" +
                    "* Yeni meclisler ve komisyonlar kuruldu. Divan örgütü kaldırılarak buradaki görüşülen devlet işleri özelliklerine göre bu meclislerde görüşülmeye başladndı. Yeniçerilerin kaldırılması üzerine askeri işlerin düzene konulmasıiçin Şura-yı Askeri kuruldu. Bundan başka Meclis-i Vâlâ-yı Ahkâm-ı Adliyye ile Dâr-ı Şûrâ-yı Babıali kuruldu.\n" +
                    "* Devlet memurları dahiliye ve harciye diye ayrıldı.\n" +
                    "* Köy ve mahalle muhtarlıkları kuruldu.\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Abdülmecit Dönemi (1839-1861)", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Tanzimat Fermanı", ": I. Abdülmecit döneminde Mustafa Reşit Paşa’ya hazırlatılarak, Gülhane Parkında halka okunmuştur. Buna göre:                                                                                                                                                                                \n" +
                    "* Müslüman ve gayrimüslim halkın can, mal ve namus güvenliği devletin garantisi altında olacak.\n" +
                    "* Vergiler herkesin gelirine göre düzenli bir şekilde alınacak.\n" +
                    "* Kanun önünde herkes eşit olacak.\n" +
                    "* Müsadere kaldırılacak, özel mülkiyet gelecek. Miras olacak.\n" +
                    "* Mahkemeler açık olacak, hiç kimse haksız yere cezalandırılmayacak.\n" +
                    "* Rüşvet ve iltimas kaldırılacak.                                                                                                                                                        \n" +
                    "* Önemi; İlk defa bir Osmanlı padişahı sınırsız olan yetilerinin üstünde bir kanun gücünü tanımış oldu. Bu sebeple Tanzimat Fermanı Osmanlı Devleti’nde anayasallaşma sürecinin başlangıcı olarak kabul edilir. Hukukta Müslim- Gayrimüslim eşitliği sağlanmıştır. Askerlik görevi ocak hizmeti olmaktan çıkarılarak vatan görevi şekline dönüşmüştür. Osmanlıcılık fikrinin doğmasına zemin hazırlamıştır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("Osmanlı Devleti’nin Son Dönemi", "XIX. yüzyılda iç karışıklıklar ve dış baskılar nedeniyle Osmanlı Devleti büyük miktarda toprak kaybetmiştir. Ayrıca Balkanlarda milliyetçi nitelikli bağımsızlık isyanları Osmanlı Devleti’ni zor durumda bırakmıştır.\n" +
                    "Osmanlı Devleti’nin çöküşünü hazırlayan etkenler daha çok 19. Yüzyılda ortaya çıktı. Bu kötü gidişi önlemek için devlet adamları ve aydınların etkisiyle bir takım ıslahatlar yapıldı ve bazı fikir akımları ortaya çıktı. Devleti kurtarma çabalarını iki bölümde incelemek mümkündür;\n" +
                    "a. Yenileşme (Islahat) çabaları\n" +
                    "b. Düşünce akımları\n", Card_Ozellikleri.ALT_BOLUM));

            list.add(new Card_Ozellikleri("Islahatlar (Yenileşme Çabaları)", "* Osmanlı İmparatorluğu XVII. yüzyılda, kurumlarında ilk ıslahatları yaptı. Bu dönemde ll. Osman, IV. Murat, Tarhuncu Ahmet Paşa ve Köprülüler askeri ve mali alanlarda düzenlemeler yaptı. Osmanlı İmparatorluğu ilk defa Lâle Devrinde (1718 - 1730) Avrupa'nın etkisiyle ıslahatlara başladı. XVI, yüzyılda yapılan ıslahatlarda daha çok Avrupa'nın askeri yönü etkili oldu. Kurumların, işlevini yerine getirip getirmediği fazla dikkate alınmadı. \n" +
                    "* Toplum ve kurumların ilk defa yoğun bir şekilde ele alınması lll, Selim döneminde Nizam-ı Cedit ıslahatlarıyla oldu. ll, Selim, savaş tekniği, kurumlarda düzenleme, eğitim ve öğretim alanlarında Batı'yla entegre çalışmaları yaptı. Batıya ekonomik, ticari, askeri vb. alanlarda açılmayı planlayan padişah bir yandan da denge politikası izleyerek imparatorluğu ayakta tutmaya çalıştı.\n" +
                    "* ll. Mahmut, ıslahatlara karşı çıkan Yeniçeri Ocağını kaldırarak geniş bir ıslahat çalışmasına girdi. Türkiye'nin modernleşmesinde önemli rol oynayan ll. Mahmut devri ıslahatlarının temel amacı; sarsılan devlet otoritesini kurmak ve merkezi otoriteyi güçlendirmekti. ll. Mahmut, imparatorluğu çöküntüden kurtarabilmek için idari, askeri, ekonomik ve kültürel alanlarda ıslahatlar yaptı. Avrupa'dan faydalanmak için ilk defa Avrupa'ya öğrenci gönderdi.\n" +
                    "* 3 Kasım 1839'da Abdülmecit Tanzimat Fermanır'nı ilan etti. Bu ferman bir Osmanlı İnsan ve Yurttaş Hakları Beyannamesi niteliğindedir, Bu ferman değişikliğin başlangıcı olmuştur. Bu dönemde hukuk, ülke yönetimi, askerlik, eğitim ve kültür alanında yenilikler ve düzenlemeler yapıldı. Tanzimat Fermanı'yla batılılaşma sistemleştirilmeye başlanmıştır.\n" +
                    "* Osmanlı İmparatorluğu Avrupalı devletlerin müdahalelerini önlemek, azınlıkların isteklerini gerçekleştirmek amacıyla Islahat Fermanı'nı ilan etti (1856). Ancak ferman Hıristiyan azınlıklardaki millileşme ve laikleşme sürecini başlatmak ve Avrupalıların imparatorluğun içişlerine karışmalarını kolaylaştırmakta başka bir işe yaramadı.\n" +
                    "* Yeni Osmanlılar (Genç Osmanlılar) denilen aydınlar meşrutiyet düşüncesini savunmaya başladılar. Sonuçta, 1876'da ilk anayasa ilan edilerek Meşrutiyet dönemi başladı.\n" +
                    "* Osmanlı İmparatorluğu, Avrupalı devletlerin içişlerine karışmasını ve Hıristiyan azınlıkların imparatorluktan ayrılmasını engellemek için Mithat Paşa'nın hazırladığı 1. Meşrutiyet'i ll. Abdühamitin padişahlığı döneminde ilan etti (1876). Böylece Müslüman ve gayrimüslüm halk padişahın yanında ilk defa yönetime katıldı. Bu dönemde ilk anayasa yapıldı ve azınlıkların temsilcileri de meclise girdi.\n" +
                    "* 1877 -1878 Osmanlı - Rus savaşı başladıktan sonra padişah bu meclisi kapattı (14 Şubat 1878). Bu kararın alınmasında Meclisin etnik yapısının Medlis çalışmalarını etkilemesi özellikle etkili olmuştur. l. Abdülhamit yönetimine karşı İttihat ve Terakki Cemiyeti kuruldu.\n" +
                    "* İttihat ve Terakki'nin amacı, Kanun-u Esasi'nin (anayasanın) yürürlüğe konulmasını, Osmanlı Mebuslar Meclisi'nin açılmasını sağlamaktı. Cemiyet, 1908'de Rumeli'de büyük bir silahlı ayaklanma hareketine girişti. Ayaklanma bastırılamadığı gibi 23 Temmuz 1908'de Manastır, Selanik ve Rumeli'de hürriyet ilan edilmiş, bunun sonucu olarak ll. Abdülhamit, Kanun-u Esasiyi yeniden yürürlüğe koymuştur. ll. Meşrutiyet ilan edildi (1908).  \n" +
                    "* ll. Meşrutiyet ilan edilmesine rağmen beklenen faydalar gerçekleşmedi. Çünkü ittihatçıların Meclis-i Mebusan'ın açılmasından başka ciddi bir hazırlığı yoktu. Bu nedenle mecliste birçok konuda görüş ve karar birliği sağlanamadı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("II. Meşrutiyetin İlanının Sonuçları", "* Meşrutiyet yönetiminin ilk günlerinde iktidar boşluğu ve geçiş döneminin kargaşası yaşandı.\n" +
                    "* Bu dönemde ilk siyasi partiler kurularak faaliyet gösterdiler. Bu partilerin başlıcaları İttihat ve Terakki Partisi, onun ilk rakibi Ahrar (Hürler) Partisi ve ittihatçıların amansız düşmanı Hürriyet ve İtilaf Fırkası idi. Bu partiler sayesinde tarihimizde demokratik parlamenter sistemin ilk denemeleri yapıldı.\n" +
                    "* ll. Meşrutiyet'in ilanından sonra yapılan seçimlerle İttihat ve Terakki Partisi en güçlü siyasi teşkilat haline geldi.\n" +
                    "* Komutanlığını Mahmut Şevket Paşa'nın, Kurmay Başkanlığını Mustafa Kemal'in yaptığı “Hareket Ordusu” Selanik'ten İstanbula gelerek 31 Mart İsyanı'nı bastırdı. Bu isyanın bastırılmasından sonra padişahın yetkileri sınırlandırıldı, Kanun-u Esâsi'de değişiklikler yapıldı.\n" +
                    "* ll. Abdülhamit tahttan indirilerek yerine V. Mehmet Reşat tahta çıkarıldı (1909). 31 Mart Olayı Türk tarihinde rejime karşı yapılan ilk isyan hareketidir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Düşünce Akımları", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("1) Osmanlıcılık", "* Osmanlı Fikir Akımları içinde ilk olarak anlatacağımız akım Osmanlıcılık’tır. Tanzimat Fermanı ile uygulamaya konulan bu fikir akımının temeli 2. Mahmut dönemine kadar uzanmaktadır. Bilindiği üzere Fransız İhtilali ile milliyetçilik akımı hızla yayılmaya başlamıştı. Bunun üzerine Osmanlıcılık akımı ile, Osmanlı İmparatorluğu sınırları içinde yaşayan bütün milletleri dil, din, ırk ve mezhep ayırmaksızın herkesi kanun önünde eşit görmek ve kendilerini temsil etme hakkı vermek amaçlanmıştır.\n" +
                    "* Osmanlıcılık fikrini savunan Jön Türkler, herkeste eşitlik kavramı ile Osmanlı vatandaşı bilinci oluşturmayı amaçlamıştır. Bu amaçla birleşerek imparatorluğun dağılmasını önlemeyi hedeflemişlerdir.\n" +
                    "* Gerek Tanzimat Fermanı ve Islahat Fermanı gerekse Meşrutiyetin ilanı bu bilincin oluşmasını ve dolayısıyla Osmanlı İmparatorluğunun dağılmasını önleme amaçlıdır.\n" +
                    "* Tabi ki tüm bunlar Fransız İhtilali ile beraber gelen milliyetçilik akımının önüne geçememiştir. Osmanlı İmparatorluğu altında yaşayan uluslar bağımsızlık için ayaklanmaya devam etmiştir. Dolayısıyla Osmanlıcılık akımı bir işe yaramamıştır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("2) İslamcılık", "* Bu düşünce akımı 19. yüzyılın sonlarına doğru 2. Abdülhamit ile beraber devletin resmi politikası haline getirilmiştir. Bir diğer adı Ümmetçilik olan bu fikir akımı kötü gidişatın sebebinin dinden uzaklaşma olduğunu savunmuştur. Her ne kadar Arap milliyetçiliğini ve dağılmayı önleyemese de İslamcılık akımı, Osmanlı devleti içinde yaşayan Müslümanları bir arada tutmayı hedeflemiş ve böylece devletin bütünlüğünü sağlamaya çalışmıştır.\n" +
                    "* 1. Dünya Savaşında İngilizlerle Araplar aralarında anlaşmış ve Osmanlıya karşı beraber savaşmıştır. Bu da gösteriyor ki İslamcılık düşüncesi başarısız olmuş bir fikir akımıdır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("3) Türkçülük", "* Osmanlıcılık ve İslamcılık politikaları çözüm olmayınca 20. Yüzyılın başlarında Türkçülük ön plana çıkmaya başlamıştır. Türkçülük, devletin kurtuluşunun milli değerlere bağlı kalmak olduğunu ve bu değerleri korumak olduğunu belirtmiştir.\n" +
                    "* Türkçülük akımının fikir babası Ziya Gökalp’tir.\n" +
                    "* Bu akımın öne çıkmasının sebebi , Osmanlı sınırları içinde yaşayan Türkleri milli değerler etrafında bir araya getirilerek dağılmayı önlemekti.\n" +
                    "* Bu akım dağılmayı yine önleyememiştir. Ancak Türkiye Cumhuriyeti’nin doğmasında çok etkili olacaktır.\n" +
                    "* Bazı aşırı Türkçüler olayı büyüterek dünyadaki tüm Türkleri bir bayrak altında toplama amacı olan Turancılığı savunmuşlardır. Her ne kadar Osmanlı’nın dağılmasına engel olamasa da Turancılık, 1. Dünya Savaşı’nda Kafkas Cephesi’nin açılma amaçlarından biri olmuştur. Diğer bir deyişle Kafkas Cephesi’nin açılış amaçlarından biri Turancılık düşünce akımını hayata geçirmekti.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("4) Batıcılık", "* Bu fikir akımının temeli Lale Devri’ne kadar uzanmaktadır. Batıcılık, devletin bütünlüğünün ve kurtuluşunun ancak ve ancak Batının biliminden ve teknolojisinden faydalanarak bunları Osmanlı bünyesine alma ile olacağını savunmuştur. Tüm bunların doğrultusunda Batı tarzında yapılan yeniliklere öncelik verilmiştir. Diğer fikir akımları gibi bu düşünce de Osmanlı Devleti’ni kurtaramamıştır. Geç kalınması, tam olarak uygulanamayışı bunlarda etkendir.\n" +
                    "* Batılılaşma politikaları her ne kadar Osmanlı’yı kurtarmasa da, bu sırada elde edilen bilgi, birikim ve tecrübe modern Türkiye’nin doğuşuna katkı sağlayacaktır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("5) Adem-i Merkeziyetçilik (Teşebbüs-i Şahsi)", "* Bu akım Osmanlı içinde yaşayan vatandaşlara geniş özgürlükler verilmesini ve çeşitli etnik grupların federasyon gibi kendi siyasal yapısı içinde yaşamalarını savunmaktadır.\n" +
                    "* Adem-i Merkeziyetçilik düşüncesinin önde gelen savunucusu aynı zamanda Osmanlı hanedanına mensup olan Prens Sabahattin’dir.\n" +
                    "* Adem-i Merkeziyetçilik devlet politikası olarak uygulanmıştır.\n" +
                    "Akımların orak noktası; Hepsi de vatanın mevcut durumundan kurtarılmasını savunmuştur. Batıdan ve Batıcılık düşüncesinden etkilenmişlerdir.\n", Card_Ozellikleri.ALT_BOLUM));


            list.add(new Card_Ozellikleri("XIX. Yüzyıl Sonları ve XX. Yüzyıl Başlarında Osmanlı Devleti", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("I. Meşrutiyet (Kanuni Esasi): 23 Aralık 1876", "* II. Abdülhamid Dönemi\n" +
                    "* İlan edilmesine Genç Osmanlılar Cemiyeti etkili olmuştur. Mebusan Meclisinin ilk reisi Ahmet Vefik Efendi’dir.\n" +
                    "* II. Abdülhamid tarafından 14 Şubat 1878’de Osmanlı-Rus Savaşı bahane edilerek yürülükten kaldırılmıştır.\n" +
                    "* Halk ilk defa yönetime katılmıştır.\n", Card_Ozellikleri.ALT_BOLUM));
            list.add(new Card_Ozellikleri("II. Meşrutiyet (Kanuni Esasi): 23 Temmuz 1908", "* II. Abdülhamid Dönemi\n" +
                    "* İlan edilmesinde İttihat ve Terakki Cemiyeti etkili olmuştur.\n" +
                    "* Bu dönemde İslamcılık, Osmancılık ve Türkçülük gibi fikir akımları etkili olmuştur.\n" +
                    "* II. Abdülhamid İslamcılık fikrini savunmuştur.\n" +
                    "* Osmanlı Ahrar Fırkası, Ahali Fırkası,  Hürriyet ve İtilaf Fırkası gibi partiler kuruldu.\n" +
                    "* 31 Mart Vakası çıktı.\n" +
                    "* Ayaklanmayı bastırmak için Selanik’ten İstanbul’a gelen ‘’Hareket Ordusu’’nu komutanı Mahmut Şevket Paşa, Kurmay Başkanı Mustafa Kemal’dir.\n" +
                    "* Bu ayaklanma bastırıldıktan sonra II. Abdülhamid tahttan indirilmiş, yerine V. Mehmet Reşat padişah olmuştur.\n" +
                    "II.Meşrutiyetin ilanı sırasında yaşanan karışıklıklardan istifade eden;\n" +
                    "* Bulgaristan bağımsızlığını ilan etti.\n" +
                    "* Avusturya-Macaristan İmparatorluğu Bosna-Hersek'i ilhak ülkesine kattığını ilan etti. \n", Card_Ozellikleri.ALT_BOLUM));


            list.add(new Card_Ozellikleri("Trablusgarp Savaşı (1911-1912)", "* Osmanlı Devleti – italya ile Uşi Antlaşması (1912)\n" +
                    "* İtalya, alelacele gelişen sanayisi için hammadde ve pazar arayışına girmesi ilk nedendir.\n" +
                    "* Trablusgarp’ın konum itibariyle İtalya’ya yakın olması ve İtalya’nın burası üzerinden Afrika’ya bir sömürge kapısı açmak istemesi ve İtalya’dan daha fazla sömürgeye ve güce sahip olan İngiltere ve Fransa’nın , İtalya’yı kendi yanlarına çekmek için buraya saldırmasına göz yummaları bu savaşın çıkma sebeplerindendir.\n" +
                    "* Osmanlı artık zayıflamıştı ve gücü kalmamıştı. Bu yüzden buraya ne ordu, ne donanma ne de teçhizat gönderebilmişti. Hal böyle olunca Mustafa Kemal, Enver Paşa, Nuri Bey, Fuat Bey ve Fethi Bey gibi vatanseverlerden oluşan gönüllü subaylar gizlice Trablusgarp’a gitmişler ve yerli halkı örgütlemişlerdir.\n" +
                    "* Mustafa Kemal Derne ve Tobruk’ta, Enver Paşa da Bingazi’de İtalya’ya karşı başarılı olmuşlardır.\n" +
                    "* İtalyanlar, Osmanlıyı barışa razı etmek için Rodos ve On İki Ada ile Çanakkale Boğazı‘nı ablukaya almışlardır. \n" +
                    "* I. Balkan Savaşı’nın başlaması son damla olmuş ve Osmanlı barış istemek zorunda kalmıştır.\n" +
                    "* 1912 yılında Uşi Antlaşması (Ouchy) imzalandı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("I. Balkan Savaşı (1912)", "* Milliyetçilik akımı ile Avrupa devletlerinin Balkan devletlerini kışkırtmaları ve yardımda bulunmalarıdır.\n" +
                    "* Balkan devletlerinin Osmanlı Devleti’ne karşı birleşmelerinde en fazla Rusya’nın etkisi olmuştur.\n" +
                    "* Osmanlı Devleti’ne karşı ilk savaş ilan eden Balkan devleti Karadağ’dır. (8 Ekim 1912)\n" +
                    "* Bulgaristan; bağımsızlığını kazandıktan sonra etkin bir rol oynamaya hazırdı; Balkan Savaşlarının fikri de Bulgaristan'dan çıkmıştı. Balkan ulusları; Osmanlı Devleti'ne Makedonya'da ıslahat yapılması için kurmaca bir baskıda bulundular bu gerçekleşmeyince Karadağ; 1912'de Osmanlı Devleti'ne saldırdı.\n" +
                    "* Osmanlı Devleti; savaş yorgunluğu ve olumsuz şartlar nedeniyle tarihe 1. Balkan Savaşı olarak geçecek savaşı kaybetti. Bulgarlar, Çatalca'ya kadar geldi ve İstanbul'u tehdite başladılar. Sırplar, Karadağlılar ve Yunanlar; Makedonya'yı tamamen işgal ettiler. Arnavutluk bağımsızlığını ilan etti. Yunanlılar; Gökçeada ve Bozcaada dışındaki adaları işgal etti.\n" +
                    "* Bulgarlar Edirne’yi alarak Çatalca önlerine kadar geldiler.\n" +
                    "* On iki Ada dışındaki bütün Ege adaları Yunanlıların eline geçti.\n" +
                    "* Karışıklıktan faydalanan Arnavutluk bağımsızlığını ilan etti.\n" +
                    "* Osmanlı Devleti’nden ilk bağımsızlığını ilan ederek ayrılan Balkan Devleti Sırbistan en son ayrılan Balkan devleti Arnavutluk’tur.\n" +
                    "* Savaşın sonunda Londra Konferansı toplandı. (17 Aralık 1912) Bu sırada Enver Bey Başkanlığında bir grup subay Babıali Baskınını gerçekleştirmiş böylece İttihat ve Terakki Partisi iktidarı tamamen ele geçirmiştir.\n" +
                    "* Girit Yunanistan’a bırakıldı.\n" +
                    "* Bulgaristan sınırları Ege Denizi’ne kadar uzandı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri(" II. Balkan Savaşı (1912)", "* I. Balkan Savaşı’ndan sonra yapılan Londra Antlaşması sonucunda Bulgaristan’ın diğer Balkan devletlerine göre daha fazla toprak almasıdır.\n" +
                    "* Bulgaristan'ın daha fazla toprak almasını kabul etmeyen Yunanistan, Karadağ, Sırbistan ve 1. Balkan Savaşı'na katılmayan Romanya birleşerek, Bulgaristan'a karşı savaş açtılar.\n" +
                    "* Bulgaristan'ın çok güçlenmesi. Osmanlı Devleti'nden alınan Balkan topraklarının paylaşılamaması. Balkanlar'daki tüm devletler Bulgaristan'a saldırmıştır. Daha sonra cephe değişmiş, Bulgaristan ile Romanya, Yunanistan ile Sırbistan arasında savaş olmuştur.\n" +
                    "* Osmanlı Devleti Edirne ve Kırklareli'yi geri almıştır. Bulgaristan mağlup olmuştur.\n" +
                    "* Balkan devletleri, aralarında Bükreş Antlaşması'nı imzalayarak savaşa son vermiştir (10 Ağustos 1913).\n" +
                    "* Bu savaş sonucunda Osmanlı Devleti ile Bulgaristan arasında İstanbul Antlaşması (1913), Yunanistan arasında Atina Antlaşması (1913) imzalandı.\n", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("I. Dünya Savaşı (1914-1918)", "Savaşın Sebepleri;\n" +
                    "1. İngiltere ve Almanya arasındaki ekonomik alanda rekabet,\n" +
                    "2. Hammadde ile sömürge arayışı,\n" +
                    "3. Silahlanma yarışının hız kazanması,\n" +
                    "4. Fransız ihtilallerinin milliyetçilik akımı,\n" +
                    "5. Fransızların Alsals-Loren kömür yatakları bölgesini Almanya’dan geri almak isteği,\n" +
                    "6. Devletlerarası bloklaşma\n" +
                    "7. Avusturya ve Rusya’nın Balkanlardaki çıkar çatışmaları,\n" +
                    "8. Siyasi birliği geç tamamlanan Almanya ve İtalya’nın siyasi dengelerin değiştirilmesi\n" +
                    "9. Başlatan Olay: Avusturya-Macaristan veliahtı Ferdinand, Saraybosna’yı ziyareti esnasında Sırplı öğrenci Princip tarafından öldürüldü. (28 Haziran 1914) Avusturya-Macaristan bunun üzerine Sırbistan’a savaş açtı. Bu savaş, 1. Dünya Savaşı’nın başlangıcı oldu.\n" +
                    "Savaşan Ülkeler:\n" +
                    "İttifak Devletleri: Almanya, Avusturya, Macar İmparatorluğu, 1915’e kadar İtalya, Bulgaristan, Osmanlı Devleti\n" +
                    "İtilaf Devletleri: İngiltere, Rusya, Fransa, 1915’den sonra İtalya, Sırbistan, Japonya, Romanya, Portekiz, ABD, Brezilya, Yunanistan\n" +
                    "Osmanlı Devletinin Savaşa Giriş Nedeni: Almanya önce tarafsızlığını ilan eden Osmanlı Devleti’nin jeopolitik konumundan faydalanıp, yeni cephelerin açılması ve halifelik sıfatından yararlanmak için savaşa girmesini istedi. İtilaf Devletleri savaşa girmemesi için, Osmanlı Devletine maddi yardım yapılacağını ve kapitülasyonların kaldırılacağını açıkladı. İttihat ve terakki yönetimi Almanların savaşı kazanıp kaybedilen toprakların geri alınacağını düşünüp, tek yanlı olarak kapitülasyonların kaldırıldığını ilan etti. Alman Gemileri Goeben ve Breslav Rus limanlarını bombalayınca Osmanlı Devleti de savaşa girmiş oldu.\n", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("1.Dünya Savaşı’nda Osmanlı'nın savaştığı cepheler", "Kafkasya Cephesi: Doğu Anadolu’da Osmanlı Rusya’yla savaştı. 1914 Aralık ayında Ruslar Doğu Anadolu’ya saldırdı. Şiddetli soğuklar yüzünden, Enver Paşanın yönettiği karşı taarruz başarısız oldu ve Sarıkamış yöresinde askeri birliklerimiz çok kayıp verdi. 1916’da Ruslar Muş ve Trabzon’u ele geçirdi. Mustafa Kemal Çanakkale savaşlarından sonra, Muş ve Bitlis’i geri aldı. 1917’deki Rus ihtilali, Kafkasya cephesinde savaşın durmasına sebep oldu.\n" +
                    "Kanal Cephesi: Osmanlı, Mısır’da tekrar egemenlik kurmak, Süveyş Kanalı’nı da ele geçirmek istiyordu. Osmanlı bu kanalı alırsa, İngilizlerin sömürgeleriyle bağlantısı kesilecek, aldığı asker ve malzeme desteği önlenecekti. Bundan dolayı Almanların da etkisiyle, İngilizlerin elindeki Süveyş Kanalı’na Osmanlı Devleti 1915’de saldırı düzenledi, gerekli önlemler alınıp hazırlıksız olarak yapıldığı için İngilizler karşısında başarılı olunamadı. İngilizler, Sina Yarımadasını ele geçirip Suriye sınırına dayandı. (1916)\n" +
                    "Hicaz ve Yemen Cephesi: Osmanlı birliklerinin bir kısmı, kutsal yerleri korumak için İngilizlerle çarpıştı. Gerek olumsuz çöl koşulları, gerekse güçlü İngiliz kuvvetleri karşısında Sina’da bir sonuç alınamadı. İngilizlerin yanı sıra Araplarla mücadele zorunda da kaldı. İngilizler bu cephede üstünlük kazandı.\n" +
                    "Irak Cephesi: İngilizler, Osmanlı Devleti’nin İran’a girmesini ve Hindistan’ı tehdit etmesini önlemek; kuzeye çıkararak Ruslarla birleşmek amacındaydılar. Irak petrollerini de ele geçirmek isteyen İngiltere, Basra’ya çıkarma yaptı. Osmanlılar İngiliz Birliklerine karşı başarılı oldu. Kütlül amare denen yerde, İngilizler geri çekildi. (1915) Tekrar Basra’ya asker çıkaran İngilizler, 1917’de Bağdat’a girdiler.\n" +
                    "Suriye ve Filistin Cephesi: Osmanlılara bu cephede Yıldırım Ordular Grup Komutanı Alman General Liman Von Sanders komuta ediyordu. Bu general, görevden alındı, yerine Mustafa Kemal Paşa atandı. İngilizlere karşı Suriye cephesinde bazı başarılar kazandı, bugünkü Suriye sınırını savunmak için önlemler aldı.\n" +
                    "Galiçya, Romanya ve Makedonya Cepheleri: 1916-1917 yıllarında Avrupa cephelerinde muharebelere katılan Osmanlılar Rusya, Romanya ve Fransa’ya karşı mücadele ettiler.\n" +
                    "Çanakkale Cephesi:  İtilaf Devletlerinin bu cephedeki amacı; Rusya’ya silah yardımı yapıp Doğu Avrupa’ya yönelik saldırısını kolaylaştırma, Almanya’nın doğuya yayılmasını önlemek ve boğazlarla İstanbul’u alıp Osmanlıları savaş dışı bırakmaktı. İngiltere, Mısır’daki varlığını güvence altına alıp Ortadoğu’da bulunan zengin petrol yataklarına sahip olmak istiyordu. İtilaf Devletleri, 1915 Şubatından itibaren saldırıya geçip Çanakkale Boğazından geçmek istediler. Nusret Mayın gemisinin boğaza döktüğü mayınlar ve güçlü top atışı nedeniyle bozguna uğradılar. 18 Mart 1915’de, İtilaf Devletlerinin savaş gemilerinin bir kısmı batırıldı, bir kısmı saf dışı bırakıldı. Düşmanlar Çanakkale’yi denizden geçemeyeceğini anlayınca, 25 Nisan’da Gelibolu Yarımadası’nda Seddülbahir ve Arıburnu kıyılarına çıkarma yaptılar. Amaç Çanakkale’yi karadan geçmekti. Avusturya ve Yeni Zelandalı askerlerden oluşan Anzakların da bulunduğu İtilaf Devletleri birlikleri, Mustafa Kemal Paşa ve askerlerini buldular. Osmanlı ordusu bu cephede büyük zafer kazandı. Boğazlara ve İstanbul’a yönelik tehlike engellendi, İtilaf Devletleri amaçlarına ulaşamadı ve bu cephede kazanılan zafer sebebiyle savaş bir süre uzadı.\n" +
                    "Savaş Sonuçları:\n" +
                    "* Asya ve Avrupa’da devletlerarası dengeler bozulup; Osmanlı İmparatorluğu, Avusturya-Macaristan İmparatorluğu, Alman İmparatorluğu ve Rusya İmparatorluğu tarihe karıştı.\n" +
                    "* Yeni siyasi rejimler ortaya çıkıp; Polonya, Çekoslavakya, Litvanya, Ukrayna, Estonya-, Yugoslavya ve Macaristan gibi yeni devletler kuruldu.\n" +
                    "* Yenilen devletler ağır antlaşmalar imzalayarak, 2. Dünya Savaşı ortamı hazırladı.\n" +
                    "* Dünya siyasi haritası değişti. Sömürgecilik “mandacılık” adı altında devam etmeye başladı.\n" +
                    "* Osmanlı Devleti parçalandı, Müslüman Araplar bağımsızlık ilan etti.\n" +
                    "* ABD, Avrupa politikasına karışmaya başladı. Ayrıca Cemiyet-i Aksam, yani Milletler Cemiyeti kuruldu.\n" +
                    "* Savaştan en karlı İngiltere çıktı. Çarlık Rusya’sı yıkılıp Sovyet Rusya kuruldu.\n" +
                    " *İlk kez deniz altı, uçak, tank ve kimyasal silahlar kullanıldı.\n" +
                    "* İsrail’in temelleri bu savaştan sonra atılmaya başlandı.\n" +
                    "* Rejim değişiklikleri oldu; Rusya’da komünizm, Almanya’da Nazizim, İtalya’da Faşizm, Türkiye’de Cumhuiyet.\n" +
                    "I. Dünya Savaşı’nı Bitiren Antlaşmalar:\n" +
                    "Almanya: Versay\n" +
                    "Avusturya: Sen Jermen\n" +
                    "Macaristan: Triyanon\n" +
                    "Bulgaristan: Nöyyi\n" +
                    "Osmanlı Devleti: Sevr Antlaşması \n" +
                    "Not: Sevr Antlaşmasına karşı Anadolu'da başlatılan Türk Milli Mücadelesi başarıya ulaşmış, Osmanlı yerine kurulan Türkiye ile Lozan Antlaşması imzalanmıştır.\n", Card_Ozellikleri.IKILI_BASLIK));
            list.add(new Card_Ozellikleri("1. Dünya Savaşı Sırasında Yapılan Gizli Antlaşmalar", "İstanbul Boğazlar Antlaşması (1915)\n" +
                    "* İngiltere, Fransa ve Rusya arasında yapılmış\n" +
                    "* Rusya’ya İstanbul ve Boğazlar vaad edilmiştir.\n" +
                    "Londra Antlaşması (1915)\n" +
                    "* İngiltere, Fransa, Rusya ve İtalya arasında yapılmış\n" +
                    "* İtalya’ya savaşa girmesi karşılığında Akdeniz Bölgesinin toprakları vaad edilmiştir.\n" +
                    "Petrograt Antlaşması (1915)\n" +
                    "* İngiltere, Fransa ve Rusya arasında imzalanmış\n" +
                    "* Rusya’ya ek olarak Doğu Anadolu toprakları vaad edilmiştir.\n" +
                    "St. Jean De Mairune Antlaşması (1917)\n" +
                    "* İngiltere, Fransa ve İtalya arasında yapılmıştır.\n" +
                    "* İtalya’ya ek olarak İzmir ve çevresi vaad edilmiştir.\n" +
                    "Skys - Picot Antlaşması (1916)\n" +
                    "* İngiltere ve Fransa,Rusya arasında yapılmış\n" +
                    "* Arap toprakları ve Anadolu topraklarının bir kısmı paylaşılmıştır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Wilson İlkeleri (8 Ocak 1918)", "* ABD Başkanı Wilson tarafından I. Dünya Savaşı sırasında ilan edildi\n" +
                    "* Buna göre;\n" +
                    "- Bütün barış antlaşmaları açık olacak, bu antlaşmalardan başka milletlerarası gizli anltaşmalar yapılmayacak.\n" +
                    "- Savaş sonunda, yenenler, yenilenler toprak almayacaklar.\n" +
                    "- Devletler arasındaki anlaşmazlıkları barış yolu ile çözümleyecek milletlerarası bir teşkilat kurulacak.\n" +
                    "* Wilson İlkeleri’nden Osmanlı Devleti’ni ilgilendiren maddesi: Osmanlı Devleti’nin Türk nüfusunun yoğun olduğu bölgelerde Türklere kesin egemenlik hakkı tanınmalıdır. Türk egemenliği altında bulunanbdiğer milletlere de kendi kendine yönetme hakkı verilmelidir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri(" 1. Dünya Savaşı’nın Sonu", null, Card_Ozellikleri.UST_BASLIK));

            list.add(new Card_Ozellikleri("Mondros Ateşkes Antlaşması: (30 Ekim 1918)", "* Osmanlı Devleti ile İtilaf devletleri arasında savaş sonunda imzalanan ateşkes antlaşmasıdır.\n" +
                    "* Osmanlı adına Bahriye Nazırı Rauf Orbay ile; İtilaf devletleri adına İngiliz Amiral Calthrop imzalamıştır.\n" +
                    "* Padişah V. Mehmet Reşat ölmüş yerine VI. Mehmet Vahdettin geçmişti. İktidarda Ahmet İzzet Paşa Hükümeti bulunuyordu.\n" +
                    "* İtilaf Devletlerinin güvenlikleri tehdit edecek bir durum ortaya çıkarsa; İtilaf Devletleri herhangi bir stratejik noktayı işgal etme hakkına sahip olacaktı.\n" +
                    "* Bu madde Osmanlı Devletinin her yerini işgale açık hale getirmiştir.\n" +
                    "* Ermenilere bırakılması düşünülen doğudaki altı ilde (Erzurum, Van, Bitlis, Diyarbakır, Elazığ ve Sivas) karışıklık çıkarsa İtilaf Devletleri bu bölgeleri de işgal edebileceklerdi.\n" +
                    "* Bu madde ile doğuda bir Ermeni Devleti kurmak amaçlanmıştır\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Paris Barış Konferansı (18 Ocak 1919)", "* Konferansın gündemi Avrupa’nın durumu ve sınırların çizilmesi, sömürgelerin ve Osmanlı Devleti’nin mirasının paylaşılması idi.\n" +
                    "* Sen Jan dö Moren gizli antlaşması ile İtalya’ya verilen Batı Anadolu bölgesinde güçlü bir devlet istemeyen İngiltere, bu bölgenin Yunanistan’a verilmesini sağladı.\n" +
                    "* Yunanistan’ın İzmir’i işgal etme planı Paris Barıs Konferansı’nda alındı.\n" +
                    "İzmir’in İşgali: Yunanlılar 15 Mayıs 1919’da İzmir’e asker çıkararak işgale başladılar. Karaya çıkan Yunan askerlerine karşı ilk kurşun Hukuk-u Beşer (İnsan Hakları) Gazetesi başyazarı Hasan Tahsin tarafından sıkıldı.\n" +
                    "Amiral Bristol Raporu: Batı Anadolu’da Yunan işgalinin haksız olduğunu, bu bölgede Türk çoğunluğunun bulunduğunu ve Yunan askerlerinin geri çekilmesigerektiğini belirten ABD delegesi Amiral Bristol başkanlığındaki heyet taraffından hazırlandı. Ancak bu rapor özellikle İngiltere tarafından dikkate alınmadı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kurtuluş Savaşı", null, Card_Ozellikleri.EN_UST_BOLUM));
            list.add(new Card_Ozellikleri("Milli Varlığa Düşman Cemiyeler", null, Card_Ozellikleri.UST_BASLIK));
            list.add(new Card_Ozellikleri("Rumlar Tarafından Kurulan Cemiyetler ", "Mavri Mira Cemiyeti: İstanbul’da Fener Rum Patrikhanesi tarafından kuruldu. Bu cemiyetin amacı; Trakya, İstanbul, Marmara Bölgesive Batı Anadolu’yu Yunanistan’a bağlayarak Mogola İdea’yı yani Bizans İmparatorluğunu tekrar kurmaktı.\n" +
                    "Pontus Rum Cemiyeti: Merziifon Amerikan Kolejinin yardımıyla Merzifon’da kurulmuştur. Amacı; Doğu Karadeniz Bölgesinde Pontus Devleti kurmaktı.\n" +
                    "Etnik-i Eterya Cemiyeti: Yunanistan’ın bağımsızlığı için kurulmuştu (1813). Mondros Ateşkes Antlaşmasından sonra tekrar faaliyete geçerek Pontus Rum Cemiyeti ve Mavri Mira Cemiyeti ile işbirliği yapmıştır.\n" +
                    "Kordos Komitesi: İstanbul, Trabzon, Marmara kıyıları ve İzmir ve civarında düzeni bozma ve buralardaki çalışmaları örgtleme görevini üstlenmişti. Başlangıçta Rumlar ve Ermeniler bu dernek çatısı altında birlikte hareket etmişlerdir.\n" +
                    "Nea Zoi Cemiyeti: İstanbul’da kurulan bu cemiyetin amacı; İstanbul’u Yunanistan’a bağlanmasını ve Bizans imparatorluğunun tekrar kurulmasını sağlamaktı.\n" +
                    "Ermeniler Tarafından Kurulan Cemiyetler:\n" +
                    "Hınçak Cemiyeti: İsviçre’de kurulmuştur. Amacı; Doğu Anadolu Bölgesini Ermenistan’a katmaktı.\n" +
                    "Taşnak Cemiyeti: Anadolu’nun büyük bölümünü içine alan Büyük Ermenistan Devleti kurmak amacıyla kurulmuştur.\t\n" +
                    "Ermeni İntikam Alayı: Adana’daFransızların yardımıyla kurulan bu cemiyet Çukurova ve Doğu Anadolu Bölgesinde bağımsız bie Ermeni Devleti kurmak için çalışmıştır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Yahudiler Tarafından Kurulan Cemiyetler", "Alyans İsrailit ve Makabi Cemiyeti: İstanbul’da kurulmuştur. Filistin’de bir Yahudi devleti kurmak amacı ile faaliyette bulunmuştur.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kuva-yı Milliye’ye Karşı Olanlar Tarafından Kurulan Cemiyetler", "1.İngiliz Muhipler Cemiyeti\n" +
                    "2.Sulh ve Selameti Osmaniye Fırkası\n" +
                    "3.Kürt Teali Cemiyeti\n" +
                    "4.Teali-i İslam Cemiyeti\n" +
                    "5.Wilson Prensipleri Cemiyeti\n" +
                    "6.Hürriyet ve İtilaf Fırkası\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Milli Varlığa Dost Cemiyeler (Müdafa-i Hukuk Cemiyeti)", "1.Trakya-Paşaeli Müdafaa-i Hukuk Cemiyeti \n" +
                    "2.Doğu Anadolu (Şark Vilayetleri) Müdafaa-i Hukuk Cemiyeti\n" +
                    "3.İzmir Müdafaa-i Hukuk-u Osmaniye Cemiyeti\n" +
                    "4.İzmir Redd-i İlhak Cemiyeti\n" +
                    "5.Kilikyalılar Cemiyeti \n" +
                    "6.Trabzon Muhafaza-i Hukuk-u Milliye Cemiyeti\n" +
                    "7.Milli Kongre Cemiyeti\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Kuva-yı Milliye", "* İtilaf Devletleri’nin Mondros Ateşkes Antlaşması (7. madde) doğrultusunda Anadolu’da başlattıkları işgallere karşı Türk halkının kurduğu silahlı direniş örgütlerine “Kuva-yı Milliye” denir.\n" +
                    "* Kurulma nedenleri;\n" +
                    "- Osmanlı Devleti’nin I. Dünya Savaşı’ndan yenik çıkması,\n" +
                    "- Mondros Ateşkes Antlaşması’yla Osmanlı ordusunun büyük bir bölümünün terhis edilmesi,\n" +
                    "- Osmanlı yönetiminin işgallere kayıtsız kalması ve işgalci güçlerle işbirliği yapması, halkın can ve mal güvenliğini koruyamaması,\n" +
                    "- İtilaf Devletlerinin Mondros’un hükümlerini tek taraflı olarak uygulamaları ve Anadolu’yu yer yer işgal etmeleridir.\n" +
                    "* Düşmana karşı ilk direnme hareketi; Kara Hasan Paşa önderliğinde Güney Cephesi’nde Dört Yol adı verilen yerde Fransızlara karşı verilmiştir (19 Aralık 1918).\n" +
                    "* Güney Cephesi’ndeki Kuva-i Milliye birliklerinin çalışmaları sonucu Urfa, Antep ve Maraş düşman işgalinden kurtarılmıştır.\n" +
                    "* İkinci direnme hareketi İzmir’in işgalinden sonra Batı Anadolu’da Yunanlılara karşı olmuştur (15 Mayıs 1919).\n" +
                    "* İlk Kuva-i Milliye teşkilatı, İzmir’in işgalinden sonra Batı Anadolu’da Yunanistan’a karşı olmuştur.\n" +
                    "* Yunan işgali karşısında örgütlenmeye karar veren Ege Halkı Balıkesir ve Alaşehir kongrelerini düzenlemiştir.\n" +
                    "* Bölgedeki bütün direniş güçlerinin ortak bir cephe oluşturmasına ve Batı Anadolu’daki Kuva-yı Milliye birliklerinin insan ve malzeme yönünden desteklenmelerine karar verilen bu kongrelerin ardından Soma, Akhisar, Nazilli, Salihli kasabalarının batısından geçen ve Ayvalık kıyılarını da içine alan bir hat üzerinde Batı Cephesi kurulmuştur. Bu cephenin merkezi Balıkesir olmuştur.\n" +
                    "* Ali Fuat Paşa, Sivas Kongresi’nde Batı Anadolu’daki Kuva-i Milliye birliklerinin genel komutanlığına tayin edilmiştir.\n" +
                    "* Kuva-i Milliye’nin olumlu yönü;  Düzenli ordu kuruluncaya kadar düşmanı yıpratarak ilerleyişlerini yavaşlatmışlar ve TBMM’ye ve düzenli ordunun kurulup teşkilatlanmasına zaman kazandırmışlardır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Mustafa Kemal’in Samsun’a Çıkışı (19 Mayıs 1919) ", "Mustafa Kemal 9. Ordu Müfettişi olarak Samsun’a gönderilmiştir. Samsun’a resmî görevle gönderilmesinin sebebi; bölgedeki karışıklıklara son vermek, silahların toplanmasını ve teslimini sağlamak, sorumluluk milli amaçlı girişimlere izin vermemektir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Havza Genelgesi (29 Mayıs 1919)", "Mustafa Kemal, Havza Genelgesi ile halkın işgallere karşı tepki göstermesini ve böylece millî bilincin uyanmasını sağlamak istemiştir.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Amasya Genelgesi ve Önemi", "* Mustafa Kemal, 12 Haziran 1919'da arkadaşlarıyla birlikte Amasya'ya geldi ve meslektaşları Ali Fuad Paşa (20. kolordu komutanı), Refet Bey ve Rauf Bey ile bir bildiri hazırladı. .\n" +
                    "* Kazım Karabekir Paşa ve Mersinli Cemal Paşa da onaylarını gönderdi.\n" +
                    "* Amasya Genelgesi olarak adlandırılan bu bildiri, örgütlü ve birleşik bir direniş yolunda atılan ilk ciddi adımdır.\n" +
                    "* Amasya Genelgesi, İstanbul Hükümeti'nin bağımsızlığını kaybetme tehlikesini ve etkisizliğini tanımlamış ve milletin kararlılığına ve kararına bağlı olan bağımsızlığa giden yolu belirtmiştir.\n" +
                    "* Bu nedenle Genelge direnişi yürütmek için bir yönetim kurulu ihtiyacını belirtmiş ve Sivas'ta kongre yapılması çağrısı yapmıştır.\n" +
                    "Amasya genelgesinin maddeleri: \n" +
                    "1. Ulusun birliği ve bağımsızlığı büyük risk altındadır.\n" +
                    "2. İstanbul hükümeti aldığı sorumlulukla başa çıkamıyor, bu durum milletimizi gitmiş gibi gösteriyor.\n" +
                    "3. Ulusun bağımsızlığı ancak kararlılığı ve inancı ile kurtarılabilir.\n" +
                    "4. Ulusların amaçlarına ulaşmak ve halk haklarını savunmak için, kısıtlama ve denetimden uzak bir ulusal komiteye sahip olmalıyız.\n" +
                    "5. Her halükarda en güvenli yer olan Sivas'ta kongre yapacağız.\n" +
                    "6. Bu amaçla, Hak Savunma Cemiyeti (Müdafaa-i Hukuk) ve İlhak Reddetme (Redd-i İlhak) tarafından her ilden üç kişi temsilci olarak seçilecektir.\n" +
                    "7. Her halükarda temsilciler yolda gerçek kimliklerini kullanmamalı ve bu genelge ulusal bir sır olarak saklanmalıdır.\n" +
                    "8. Doğu yakasındaki iller için 10 Temmuz'da Erzurum'da bir kongre yapılacaktır. O tarihe kadar diğer temsilciler Sivas'a ulaşırsa doğu illerindekiler Sivas'a taşınacak.\n" +
                    "Mustafa Kemal, Amasya'dan sonra 3 Temmuz 1919'da Erzurum'a gitti ve kurulacak bir Ermeni Devleti Projesi'ne karşı Doğu vilayetleri için bölge kongresi toplandı.\n" +
                    "Amasya Genelgesinin Sonuçları:\n" +
                    "* Genelge, İstanbul (Osmanlı) Hükümeti'ni rahatsız etti ve 8 Temmuz 1919'da Mustafa Kemal Paşa geri çağrıldı.\n" +
                    "* İstanbul hükümeti, Mustafa Kemal'in padişahın emrine karşı geldiği gerekçesiyle tutuklanması için emir çıkardı. Anadolu'da kalan Osmanlı kuvvetlerini dağıtmaktan, daha sonra onu ölüme mahkum etmekten dolayı tutuklanma emri Mustafa Kemal tarafından öğrenildi.\n" +
                    "* Bunun üzerine Mustafa Kemal tüm görevlerinden ve ordudan istifa etti.\n" +
                    "* Yine de Doğu Ordusu'nun kudretli komutanı Kazım Karabekir, Türk direnişinin diğer önde gelen isimleriyle birlikte desteğini sürdürdü ve Mustafa Kemal Erzurum Kongresi'ne doğru yoluna devam etti.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Erzurum Kongresi (23 Temmuz / 7 Ağustos 1919)", "* Erzurum Kongresi öncesinde (8 Temmuz 1919) Mustafa Kemal askerli ve memuriyet görevinden istifa etmiştir.\n" +
                    "* Doğu Anadolu Müdafa-i Hukuk Cemiyeti girişimleri ile toplandı.\n" +
                    "* Mustafa Kemal Kongre Başkanı seçildi.\n" +
                    "* Toplanışı bakımından bölgesel ancak alınan kararlar bakımından milli bir kongredir.\n" +
                    "* İlk defa milli sınırlardan bahsedildi.\n" +
                    "* İlk defa manda ve himaye reddedildi.\n" +
                    "* İlk kez yeni bir devlet kurma düşüncesi ortaya çıkmıştır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sivas Kongresi (4 / 11 Eylül 1919)", "* Milli bir kongredir.\n" +
                    "* Erzurum Kongresi’nde alınan kararlar aynen kabul edildi.\n" +
                    "* İstanbul Hükümeti kongrenin toplanmasını önlemek için Mustafa Kemal’i tutuklanması emrini verdi.\n" +
                    "* Müdafa-i Hukuk Cemiyetleri Anadolu ve Rumeli Müdafa-i Hukuk Cemiyetiadı altında birleştirildi.\n" +
                    "* Manda ve himaye kesin olarak reddedildi.\n" +
                    "* Kamuoyu oluşturmak ve milli mücadelenin sesini duyurabilmek için İrade-i Milliye adıyla gazete çıkartılmaya başlandı.\n" +
                    "* Temsil Heyeti Ali Fuat Cebesoy’u Batı Anadolu Kuva-yı Milliye komutanlığına atandı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Amasya Görüşmeleri (20 / 22 Ekim 1919)", "* Ali Rıza Paşa Hükümeti Bahriye Nazırı Salih Paşa ile Temsil Heyeti arasında yapıldı.\n" +
                    "* İstanbul Hükümeti bu görüşme ile Temsil Heyetini resmen tanımış oldu.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Temsil Heyetinin Ankara’ya Gelişi (27 Aralık 1919)", "Milli Mücadelenin merkezinin Ankara’ya taşınması; Ankara’nın merkezi ve güvenlik olması, Anadolu’nun diğer bölgeleriyle haberleşme imkanının uygun olması, Batı Anadolu’da Yunanlılarla yapılacak mücadele için daha uygun bir yer olmasından dolayıdır.", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Son Osmanlı Mebusan Meclisi ve Misak-ı Milli (28 Ocak 1920)", "* 12 Ocak 1920’de İstanbul’da toplandı.\n" +
                    "* Temsil Heyeti taraftarı mebuslar tarafından Felah-ı Vatan grubu kuruldu.\n" +
                    "* 28 Ocak 1920’de Misak-ı Milli ilan edildi.\n" +
                    "* Misak-ı Milli kararları ile Erzurum ve Sivas Kongresi kararlarında belirten vatanın sınırları belirlendi.\n" +
                    "* Misak-ı Milli kararlarının yayınlanmasının ardından İtilaf Devletleri 16 Mart 1920’de İstanbul’u resmen işgal etmişler ve Mebusan Meclisini basarak tutukladıkları meclis üyelerini Malta’ya sürgüne göndermişlerdir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Türkiye Büyük Millet Meclisi’nin Açılması (23 Nisan 1920)", "* İstanbul’un işgal edilmesi ve Mebuslar Meclisi’nin dağıtılması üzerine yeniden seçim yapıldı. İstanbul’dan kaçan ve yeni saçilen milletvekilleri birlikte Ankara’da Türkiye Büyük Millet Meclisi açıldı.\n" +
                    "* İlk meclis güçler birliği ilkesine göre kuruldu. (yasama-yürütme-yargı)\n" +
                    "* Meclisin başkanı hükümetin de başkanıdır.\n" +
                    "* Egemenliğin kayıtsız şartsız milletin olduğu ve meclisin üstünde bir gücün olmadığı belirtilmiştir.\n" +
                    "* Kurucu meclistir.\n" +
                    "* Meclis hükümeti sistemi vardır.\n" +
                    "* İlk başkanı Mustafa Kemal’dir. \n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("TBMM’ye Karşı Ayaklanmalar", "* İstanbul Hükümetinin çıkarttığı ayaklanmalar: Anzavur ve Kuva-yı inzibatiye (Halife Ordusu) Ayaklanması.\n" +
                    "* İstanbul Hükümetive İtilaf Devletlerinin birlikte çıkardığı ayaklanmalar: Bolu, Düzce, Hendek, Adapazarı, Konya, Afyon, Yozgat Ayaklanmaları ve Milli Aşireti Ayaklanması.\n" +
                    "* Azınlıkların çıkarttığı ayaklanmalar: Pontus Rum ve Ermeni Ayaklanması.\n" +
                    "* Kuva-yı Milliye yanlısı olup sonradan ayaklanmalar: Çerkes Ethem ve Demirci Mehmet Efe Ayaklanması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("TBMM’nin Ayaklanmaları Önlemek İçin Aldığı Tedbirler", "* Hıyanet-i Vataniye Kanunu çıkartıldı.\n" +
                    "* İstiklal Mahkemeleri kuruldu.\n" +
                    "* İstanbul Hükümeti ile haberleşmelere son verildi.\n" +
                    "* İstanbul Hükümetinin fetvalarına karşı Ankara Müftüsü Rıfat Börekçi ve diğer din adamlarının fetvaları Anadolu’ya dağıtıldı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sevr Antlaşması (10 Ağustos 1920)", "* Sevr Antlaşmasının esasları İtalya’nın San-Remo kendinte belirlendi.\n" +
                    "* Osmanlı Saltanat Şurası tarafından onaylandı.\n" +
                    "* Damat Ferit Paşa tarafından imzalandı.\n" +
                    "* TBMM tarafından tanınmadığı için yürürlüğe girmedi.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Doğu Cephesi", "* Ermenilerle mücadele edildi.\n" +
                    "* Mondros Ateşkes Anlaşmasına uymayarak ordusunu dağıtmayan Kazım Karabekir Paşa Doğu Anadolu bölgesinde Ermenileri yenilgiye uğratmış ve 3 aralık 1920 tarihinde Ermenistan ile TBMM arasında Gümrü Antlaşması imzalanmıştır.\n" +
                    "* Gümrü Antlaşması TBMM’nin uluslararası alanda kazandığı ilk siyasi başarıdır.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Güney Cephesi", "* Bu cephede Fransızlar ve Ermenilere karşı Kuva-yı Milliye birlikleri tarafından başarılı mücadeler verildi.\n" +
                    "* Bu cephe Sakarya Savaşı sonrasında Fransızlarla yapılan Ankara Antlaşması (20 Ekim 1921) sonucunda kapandı.\n" +
                    "* Ankara Antlaşması ile Hatay dışındaki bugünkü Suriye sınırımız çizilmiştir.\n" +
                    "* Ankara Antlaşması ile İtilaf Devletleri arasında ayrılık meydana gelmiş ve yeni Türk devletini tanıyan ilk İtilaf Devleti Fransa olmuştur.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Batı Cephesi", "I. İnönü Savaşı (6-10 Ocak 1921): \n" +
                    "* Yunanlılara karşı kazanılan I. İnönü Savaşından sonra;\n" +
                    "- Sovyet Rusya ile Moskova Anlaşması yapıldı. (16 Mart 1921)\n" +
                    "- TBMM Hükümeti Londra Konferansı’na davet edildi. (21 Şubat – 12 Mart 1921)\n" +
                    "* Londra Konferansı’na davet edilen TBMM Hükümeti İtilaf Devletleri tarafından tanınmış oluyordu.\n" +
                    "* Londra Konferansı’nda İstanbul Hükümetini Tevfik Paşa, TBMM Hükümetini Bekir Sami Bey temsil etmiştir.\n" +
                    "* Düzenli ordunun ilk zaferidir.\n" +
                    "* Afganistan ile dostluk antlaşması yapıldı.\n" +
                    "* 20 Ocak 1921’de İlk Anayasa (Teskilat-ı Esasiye) ilan edildi.\n" +
                    "* 12 Mart 1921’ de İstiklal Marşı kabul edildi.\n" +
                    "I. İnönü Savaşı (6-10 Ocak 1921): \n" +
                    "* Yunanlılara karşı kazanılan I. İnönü Savaşından sonra; halkın orduya olan güveni daha da artar.\n" +
                    "* Bu zaferden sonra İtalya işgal ettiği yerlerden çekilmeye başladı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Eskişehir-Kütahya Savaşları (10 / 24 Temmuz 1921)", "* Eskişehir, Kütahya ve Afyon Yunanlıların eline geçti.\n" +
                    "* Türk ordusu Sakarya Nehri'nin doğusuna çekildi.\n" +
                    "* Mecliste huzursuzluklar yaşandı. Meclisin Kayseri'ye taşınması bile gündeme geldi.\n" +
                    "* 5 Ağustos 1921 tarihinde Mustafa Kemal meclisin tüm yetkilerini üç aylığına alarak Başkomutan olarak ilk defa ordunun başına geçti.\n" +
                    "* Sakarya Savaşı öncesi 8 Ağustos 1921 tarihinde Tekalif-i Milliye Emirleri yayınlandı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sakarya Savaşı (23 Ağustos / 12 Eylül 1921)", "* Yunalılara karşı kazanılan Sakarya Savaşı sonunda;\n" +
                    "* Mustafa Kemal'e “Gazilik” unvanı ve “Mareşallik” rütbesi verildi.\n" +
                    "* Savunmadan taarruza geçildi.\n" +
                    "* Gürcistan ve Azerbaycan ile Kars Antlaşması yapıldı (13 Ekim 1921).\n" +
                    "* Fransa ile Ankara Antlaşması imzalandı (20 Ekim 1921).\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Büyük Taarruz ve Başkomutanlık Meydan Muharebesi (26 / 30 Ağustos 1922)", "* Muharebeyi Başkomutan Mustafa Kemal yönetti.\n" +
                    "* Yunan ordusu yok edildi.\n" +
                    "* Yunan Başkumandanı Trikopis esir edildi.\n" +
                    "* Türk Ordusu 9 Eylül 1922 tarihinde İzmir'e girdi.\n" +
                    "* 15 Mayıs 1919 tarihinde başlayan Yunan işgali sona erdi.\n" +
                    "* Bu zafer sonucunda İtilaf Devletleri ile Mudanya Ateşkes Antlaşması yapıldı.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Mudanya Ateşkes Antlaşması (11 Ekim 1922)", "* Boğazlar, İstanbul ve Doğu Trakya savaşmadan kurtarıldı.\n" +
                    "* Mondros Ateşkes Antlaşması hükümsüz hale geldi.\n" +
                    "* Mücadele'nin savaş dönemi sona erdi.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Lozan Barış Antlaşması (24 Temmuz 1923)", "* Konferansa katılan devletler; Türkiye, İngiltere, Fransa, İtalya, Yunanistan, Japonya, Romanya, Yugoslavya.\n" +
                    "* Sovyet Rusya ve Bulgaristan Boğazlar sorunu görüşülürken katıldı.\n" +
                    "* ABD gözlemci olarak katıldı.\n" +
                    "* Türk heyeti başkanı İsmet İnönü'dür.\n" +
                    "* Mustafa Kemal Paşa'nın kesinlikle taviz verilmemesini istediği Kapitülasyonlar ve Misak-ı Milli’dir.\n" +
                    "* Görüşülen konular; Sınırlar (Suriye, Irak, Yunan, Adalar), Azınlıklar, Kapitülasyonlar, Osmanlı Borçları, Boğazlar, Savaş Tazminatı, Rum Patrikhanesi konuları görüşüldü.\n" +
                    "* Doğu sınır; Moskova ve Kars Anlaşmalarıyla belirlendiği şekilde kaldı.\n" +
                    "* Suriye; Hatay Misak-ı Milli dışında kaldı.\n" +
                    "* Irak; Türkiye ile İngiltere arasında çözülmesine karar verildi.\n" +
                    "* Yunanistan; Karaağaç Türkiye’e verildi.\n" +
                    "* Adalar; Bozcaada ve Gökçeada Türkiye'ye verildi. Ege Denizi'ndeki diğer adalar Yunanistan'a bırakıldı. Ancak Yunanistan bu adalarda asker bulundurmayacaktı\n" +
                    "* On İki Ada İtalya'ya bırakıldı.\n" +
                    "* Boğazlar; Her iki yakası askerden arındırılacak, başkanı Türk olan uluslar arası bir komisyon tarafından yönetilecekti. (Bu durum bağımsızlığımıza ve egemenliğimize gölge düşürmüştür.)\n" +
                    "* Dış Borçlar; Osmanlı Devleti'nden ayrılan devletler arasında paylaştırıldı.\n" +
                    "* Kapitülasyonlar ve Düyun-u Umumiye kaldırıldı.\n" +
                    "* Yabancı Okullar; Türk Devleti'nin kanunlarına tabi olacaktı.\n" +
                    "* Savaş Tazminatı; Yunanistan Karaağaç'ı savaş tazminatı olarak Türkiye'ye verdi.\n" +
                    "* Patrikhane; İdari ve hukuki yetkileri elinden alındı.\n" +
                    "* Musul, Hatay, Ege Adaları ve Boğazlar Türkiye lehine çözülemedi.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("İzmir İktisat Kongresi (17 Şubat 1923)", "* Misak-ı İktisadi (ekonomik ant) kabul edildi.\n" +
                    "* Devletçilik ilkesi benimsenmiştir.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Cumhuriyetin İlanı (29 Ekim 1923)", "* Meclis hükümeti sisteminden, kabine sistemine geçildi.\n" +
                    "* İlk Cumhurbaşkanlığına Mustafa Kemal seçildi.\n" +
                    "* Türkiye Cumhuriyetinin ilk Başbakanı İsmet İnönü, İlk Medis Başkanı da Fethi Okyar oldu.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Siyasi Alanda Yapılan İnkılaplar", "* TBMM'nin açılışı - 23 Nisan 1920\n" +
                    "* Saltanatın kaldırılması - 1 Kasım 1922\n" +
                    "* Cumhuriyetin ilanı - 29 Ekim 1923\n" +
                    "* Ankara'nın başkent yapılması - 13 Ekim 1923\n" +
                    "* Halifeliğin kaldırılması - 3 Mart 1924\n" +
                    "* Çok partili rejim denemeleri\n" +
                    "* Kadınlara siyasi hakların verilmesi (seçme ve seçilme)\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Hukuk Alanda Yapılan İnkılaplar", "* Medeni Kanun'un kabulü - 17 Şubat 1926 (İsviçre medeni kanunu esas alınarak hazırlandı).\n" +
                    "* Ceza Kanunu (İtalya'dan alındı) yürürlüğe girmesi.\n" +
                    "* Borçlar Kanunu'nun yürürlüğe girmesi.\n" +
                    "* Ticaret Kanunu'nun yürürlüğe girmesi.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Eğitim Alanda Yapılan İnkılaplar", "* Tevhid-i Tedrisat Kanunu - 3 Mart 1924\n" +
                    "* Latin harflerinin kabulü - 1 Kasım 1928\n" +
                    "* Türk Tarih Kurumu'nun kurulması - 15 Nisan 1931\n" +
                    "* Türk Dil Kurumu'nun kurulması - 12 Temmuz 1932\n" +
                    "* Ankara Hukuk Mektebinin açılması - 1925\n" +
                    "* İstanbul Üniversitesinin kurulması - 1933\n" +
                    "* Dil ve Tarih Coğrafya Fakültesi'nin kurulması - 1935.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sosyal Alanda Yapılan İnkılaplar", "* Şapka Kanunu - 25 Kasım 1925 (Mustafa Kemal Kastamonu seyahatinde şapka giymiştir.)\n" +
                    "* Tekke ve Zaviyelerin kapatılması - 30 Kasım 1925\n" +
                    "* Takvim, saat, ölçüler ve rakamlarda değişiklik (ilk olarak miladi takvim 1 Ocak 1926 tarihinde kullanılmaya başlandı.)\n" +
                    "* Soyadı Kanunu'nu kabulü-1934\n" +
                    "* Kadın Hakları (1930 belediye seçimlerine katılma, 1933 muhtarlık seçimlerine katılma, 1934 millet vekili seçme ve seçilme).\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ekonomik Alanda Yapılan İnkılaplar", "* İzmir İktisat Kongresinin toplanması.\n" +
                    "* Misak-ı İktisadi’nin kabulü.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Tarım Alanda Yapılan İnkılaplar", "* Aşar vergisinin kaldırılması - 17 Şubat 1925\n" +
                    "* Tarım Kredi Kooperatifleri'nin açılması.\n" +
                    "* Ziraat Bankası'nın çiftçilere kredi desteğini artırması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Ticaret Alanında Yapılan İnkılaplar", "* İş Bankası'nın kurulması.\n" +
                    "* Kabotaj Kanunu'nun çıkarılması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Sanayi Alanında Yapılan İnkılaplar", "* Teşvik-i Sanayi Kanunu'nun çıkarılması.\n" +
                    "* Planlı ekonomiye geçilmesi.\n" +
                    "* Beş yıllık kalkınma planının yapılması.\n" +
                    "* Etibank ve MTA'nın kurulması,\n" +
                    "* Sümerbank'ın kurulması.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Atatürk İlkeleri", "-Cumhuriyetçilik\n" +
                    "- Milliyetçilik\n" +
                    "- Halkçılık\n" +
                    "- Laikçilik\n" +
                    "- Devletçilik\n" +
                    "- İnkılapçılık\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Bütünleyici İlkeler", "- Milli Egemenlik\n" +
                    "- Milli Bağımsızlık\n" +
                    "- Milli Birlik ve Beraberlik\n" +
                    "- Bilimsellik ve Akalcılık\n" +
                    "- Çağdaşlaşma ve Batılılaşma\n" +
                    "- İnsan ve İnsanlık Sevgisi\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Mustafa Kemal Atatürk’ün Hayatı", "* 1881 yılında Selanikte doğdu. Annesi Zübeyde Hanım, Babası Ali Rıza Efendi’dir.\n" +
                    "* Kardeşler; Fatma, Ahmet, Ömer, Makbule ve Naciye'ir.\n" +
                    "* Okuduğu okullar;\n" +
                    "1. Mahalle Mektebi,\n" +
                    "2. Şemsi Efendi Okulu,\n" +
                    "3. Selanik Mülkiye Rüştiyesi,\n" +
                    "4- Selanik Askeri Rüştiyesi (Kemal adını aldı.),\n" +
                    "5- Manastır Askeri İdadisi,\n" +
                    "6- İstanbul Harp Okulu,\n" +
                    "7- Harp Akademisi.\n" +
                    "* 1905’te Harp Akademisinden kurmay yüzbaşı olarak mezun oldu.\n" +
                    "* İlk görev yer Şam’dır.\n" +
                    "* Şam'da Vatan ve Hürriyet örgütünü kurdu. Daha sonra bu örgüt İttihat ve Terakki ile birleşti.\n" +
                    "* 31 Mart Olayı’nda hareket ordusunda Kurmay Başkanı olarak görev yaptı.\n" +
                    "* Atatürk; Fransız akımı ile Ziya Gökalp ve Namık Kemal’in eserlerinden etkilenmiştir.\n" +
                    "* Görev yapıtığı yerler ve bazı görevleri; Şam (5.Ordu), Hareket Ordusu, Trablusgarp Savaşı, Balkan Savaşlar, Sofya Askeri Ataşeliği, Çanakkale Savaşı, Kafkas Cephesi, Suriye Cephesi (Yıldırım Ordular), Ordu Müfettişliği, Temsil Heyeti Başkanlığı, Sakarya Savaşı (Baş Komutan), Büyük Taarruz ve Başkomutanlık Meydan Muharebesi, İlk TBMM Başkanı, İlk Cumhurbaşkanı (1923-1938)\n" +
                    "* Eserleri; en büyük eseri Türkiye Cumhuriyetidir. Bunun yanında yazlı olarak, 1919-1977 yılları arasındaki olayları anlattığı Nutuk, Vatandaş İçin Medeni Bilgiler, Geometri Kitabı, Cumalı Ordugahı, Zabit ve Kumandan ile Hasbıhal adlı eserleri bulunmaktadır.\n" +
                    "* Atatürk’ün savaşlarda söylediği tarihe geçmiş sözler;\n" +
                    "- II. İnönü Savaşı; Siz orada yalnız düşmanı değil, Milletin makus talihini de yendiniz. (İsmet İnönü'ye çektiği telgraf)\n" +
                    "- Sakarya Savaşı; Hattı müdafaa yoktur, sathı müdafa vardır. O satıh bütün vatandır. Vatanın her karış toprağı vatandaşın kanıyla sulanmadıkça terk edilemez.\n" +
                    "- Çanakkale Savaşı (Arıburnu Muharebeleri); Ben, size taarruz emretmiyorum, ölmeyi emrediyorum. Biz ölünceye kadar geçecek zaman zarfında  yerimize başka kevvetler ve kumandanlar geçebilir.\n" +
                    "- Baş Komutanlık Meydan Muharebesi; Ordulari ilk hedefiniz Akdeniz'dir, ileri.\n", Card_Ozellikleri.IKILI_BASLIK));

            list.add(new Card_Ozellikleri("Türkiye Cumhuriyeti Cumhurbaşkanları (1922 - 2019)", "1. Mustafa Kemal Atatürk (1922 - 1938)\n" +
                    "2. İsmet İnönü (1938 - 1950)\n" +
                    "3. Celal Bayar (1950 - 1960)\n" +
                    "4. Cemal Gürsel (1960 - 1966)\n" +
                    "5. Cevdet Sunay (1966 - 1973)\n" +
                    "6. Fahri Korutürk (1973 - 1980)\n" +
                    "7. Kenan Evren (1982 - 1989)\n" +
                    "8. Turgut Özal (1989 - 1993)\n" +
                    "9. Süleyman Demirel (1993 - 2000)\n" +
                    "10. Ahmet Necdet Sezer (2000 - 2007)\n" +
                    "11. Abdullah Gül (2007 - 2014)\n" +
                    "12. Recep Tayyip Erdoğan (2014 - ...)\n", Card_Ozellikleri.IKILI_BASLIK));

        }

            return list;
        }
    }
