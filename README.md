# Kişiler Uygulaması

Bu uygulama, kişilerin listesini çeken, kişi eklemeyi, silmeyi ve güncellemeyi sağlayan bir Android uygulamasıdır.
Uygulama, MVVM mimarisi kullanılarak geliştirilmiştir ve Retrofit gibi kütüphaneler kullanılarak veri alışverişi gerçekleştirilir.

## Özellikler

- Kişilerin listesini görüntüleme.
- Yeni kişi ekleme.
- Kişi bilgilerini güncelleme.
- Kişiyi silme.

## Teknolojiler

Bu uygulama aşağıdaki teknolojileri kullanır:

- Kotlin: Ana programlama dili olarak kullanılmıştır.
- MVVM (Model-View-ViewModel) Mimarisi: Uygulama mantığını ve arayüzünü ayırarak daha düzenli bir kod yapısı sağlar.
- Retrofit: HTTP istekleri göndermek ve almak için kullanılır, bu sayede bir API ile iletişim kurulur.
- Dagger 2: Bağımlılık enjeksiyonu için kullanılır, bu sayede bileşenlerin yönetimi ve bağımlılıkların çözülmesi kolaylaşır.
- Android Architecture Components: LiveData ve ViewModel gibi bileşenler, uygulama durumunun ve verilerinin yönetimini kolaylaştırır.

## Uygulama Kurulumu

Uygulamayı yerel geliştirme ortamınıza kurmak için aşağıdaki adımları izleyebilirsiniz:

1. Bu depoyu klonlayın: `git clone <https://github.com/Adl1coder/KisilerUygulamasiMvvm>`

2. Android Studio'yu açın.

3. Proje klasörünü açın ve projeyi açın.

4. Gerekli bağımlılıkları yüklemek için Gradle projenizi senkronize edin.

5. Bir Android emulator veya fiziksel bir cihaz kullanarak uygulamayı çalıştırın.

## API Bağlantısı

Bu uygulama, kişi verilerini bir API'den alır ve günceller. API bağlantısı yapabilmek için aşağıdaki adımları izleyebilirsiniz:

1. API erişim bilgilerinizi `ApiService` sınıfında güncelleyin.

2. Retrofit tarafından sağlanan yönergeleri takip ederek API isteklerini yapılandırın.

3. (http://kasimadalan.pe.hu/) kullanıldı.


## Katkıda Bulunma

Eğer bu projeye katkıda bulunmak isterseniz, lütfen aşağıdaki adımları izleyin:

1. Bu depoyu çatallayın (fork).

2. Yeni bir özellik veya düzeltme ekleyin.

3. Pull isteği (pull request) oluşturun.

4. İnceleme sürecini bekleyin ve isteğiniz onaylandığında birleştirme (merge) işlemi gerçekleşecektir.

## Lisans

Bu uygulama MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için [LİSANS](/LICENSE) dosyasına başvurun.


