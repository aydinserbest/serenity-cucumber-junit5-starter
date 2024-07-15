Feature: DataTable Usage

  Scenario: where to go

    And the available destinations should be:
      | Berlin   |
      | Paris    |
      | New York |

  Scenario: List user details
    Given the following users are available:
      | name            | date of birth   |
      | Michael Jackson | August 29, 1958 |
      | Elvis Presley   | January 8, 1935 |
      | John Lennon     | October 9, 1940 |

  Scenario: check
    Then the available destinations should be Berlin, Paris, New York


  #Cucumber, feature dosyasındaki tabloyu List<Map<String, String>> türünde bir veri yapısına dönüştürür.

  #Her Satır Bir Map (Harita) Olur:
  #Anahtar: Kolon adı (name, date of birth)
  #Değer: Hücre değeri (örneğin, Michael Jackson, August 29, 1958)
  #Bu, şu şekilde bir yapı oluşturur:


 # [
 #    { "name": "Michael Jackson", "date of birth": "August 29, 1958" },
 #    { "name": "Elvis Presley", "date of birth": "January 8, 1935" },
 #    { "name": "John Lennon", "date of birth": "October 9, 1940" }
 #    ]

  #Step definition metodundaki List<Map<String, String>> users parametresi,
    # Cucumber'ın tablodaki verileri geçirdiği yerdir.

  #List: Birden fazla Map nesnesini tutan bir koleksiyon.
  #Map: Her bir satırdaki kolon adı (anahtar) ve hücre değerini (değer) tutan yapı.
  #String: Hem anahtar hem de değerler String türündedir.

  # Tablo Verilerinin Dönüştürülmesi
  # Cucumber, tabloyu şu şekilde dönüştürür:

  #İlk satır (başlık satırı) kolon adlarını belirler: name, date of birth
  # Sonraki satırlar, bu kolon adlarına karşılık gelen değerleri içerir.

  ### Adım Adım Süreç

  # 1-Feature Dosyasını Yazdınız:

  # Given the following users are available:
  # Tabloda iki kolon var: name, date of birth
   #Üç satır: Michael Jackson, Elvis Presley, John Lennon

     ### 2-Cucumber, adımı step definition metoduna bağladı:

  #@Given("the following users are available:")
  #Bu anotasyon ile the_following_users_are_available metodu çağrılır.

  ### 3- Tablo verilerini List<Map<String, String>> olarak dönüştürdü:

  #name, date of birth kolon adları belirlenir.
  #Michael Jackson, August 29, 1958 -> { "name": "Michael Jackson", "date of birth": "August 29, 1958" }
  #Elvis Presley, January 8, 1935 -> { "name": "Elvis Presley", "date of birth": "January 8, 1935" }
  #John Lennon, October 9, 1940 -> { "name": "John Lennon", "date of birth": "October 9, 1940" }
  #Bu veriler, bir liste içinde toplanır:

  # [
    # { "name": "Michael Jackson", "date of birth": "August 29, 1958" },
      # { "name": "Elvis Presley", "date of birth": "January 8, 1935" },
        # { "name": "John Lennon", "date of birth": "October 9, 1940" }]


  ### 4-Metod çalıştırıldığında bu liste parametre olarak geçti:

  #users parametresi, yukarıdaki listeye sahip oldu.

  ### 5-Metod içinde verileri işlediniz:

  #for (Map<String, String> user : users) { ... }
  #
  # Döngü ile her kullanıcı bilgisi işlendi ve ekrana yazdırıldı.


