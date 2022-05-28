Feature: LCWaikiki Favorilere ürün ekleme

  Scenario: favorilere ürün ekleme
    Given Uygulama açılır
    When Kadın tabına basılır
    When Tişört' e tıklanır.
    Then Tişört sayfasının geldiği kontrol edilir.
    When 1. siradaki üründe bulunan favorilere ekle ikonuna tıklanır.
    When Favorilerime gidilir.
    Then Urunun favorilere eklendiği kontrol edilir.
