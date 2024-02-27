import org.junit.Test;

public class Runner extends BaseTest {

    private Methods methods = new Methods();

    @Test
    public void startTest() {

        for(int i=0; i<3; i++) {

            // Not Ekleme Testi
            // ------------------------------------------------------------------
            methods.checkPage(Elements.recyclerView, "Notlar listesi");
            methods.clickElement(Elements.addNoteButton);
            methods.checkPage(Elements.addNoteText, "Not ekleme");
            methods.clickElement(Elements.titleEditText);
            methods.enterText(Elements.titleEditText, (i + 1) + ". Not Başlığı");
            methods.clickElement(Elements.contentEditText);
            methods.enterText(Elements.contentEditText, (i + 1) + ". Not İçeriği");
            methods.clickElement(Elements.saveNoteButton);
            methods.checkPage(Elements.recyclerView, "Notlar listesi");
            methods.checkDateTime(Elements.dateTime);
            // -----------------------------------------------------------------
        }

        // Not Düzenleme Testi
        // --------------------------------------------------------------------------
        methods.clickElement(Elements.noteCard);
        methods.checkPage(Elements.noteTitle, "Not detay");
        methods.clickElement(Elements.editNoteButton);
        methods.checkPage(Elements.editNoteText, "Not düzenleme");
        methods.clickElement(Elements.editNoteTitle);
        methods.enterText(Elements.editNoteTitle, "Düzenlenmiş Not Başlığı");
        methods.clickElement(Elements.editNoteContent);
        methods.enterText(Elements.editNoteContent, "Düzenlenmiş Not İçeriği");
        methods.clickElement(Elements.saveEditingNoteBtn);
        methods.checkPage(Elements.recyclerView, "Notlar listesi");
        methods.checkDateTime(Elements.dateTime);
        // --------------------------------------------------------------------------

        // Uygulama Dil Seçeneğini Değiştirme Testi
        // --------------------------------------------
        methods.clickElement(Elements.moreBtn);
        methods.clickElement(Elements.setLanguage);
        methods.clickElement(Elements.englishLanguage);
        // --------------------------------------------

        // Not Silme Testi
        // ------------------------------------------------------------------
        methods.longClickElement(Elements.noteCard);
        methods.clickElement(Elements.deleteConfirmBtn);
        methods.checkPage(Elements.recyclerView, "Notlar listesi");
        // ------------------------------------------------------------------


    }
}