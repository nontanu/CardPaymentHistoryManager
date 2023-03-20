package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import jp.co.niconiconi.cardapp.Interactor.CardInteractor;
import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.data.entity.Card;
import jp.co.niconiconi.cardapp.data.repository.CardRepository;
import jp.co.niconiconi.cardapp.form.CardRegistrationForm;
import jp.co.niconiconi.cardapp.service.CardRegistrationService;

public class CardRegistrationControllerTest {

    private final CardRegistrationController cardRegistController;

    public CardRegistrationControllerTest() {
        this.cardRegistController = new CardRegistrationController(new CardRegistrationService(new MockHttpSession(), new MockCardInteractor()));
    }

    @Test
    public void testIndexReturnStr() {
        assertEquals(ReturnUrls.PAGE_CARD_REGIST.getUrl(), cardRegistController.index());
    }

    @Test
    public void testRegist() {
        BindingResult result = new MockResult();
        Model model = new MockModel();
        CardRegistrationForm form = new CardRegistrationForm();
        assertEquals(ReturnUrls.REDIRECT_CARD.getUrl(), cardRegistController.regist(form, result, model));
    }

    private class MockResult implements BindingResult {

        @Override
        public String getObjectName() {
            return null;
        }

        @Override
        public void setNestedPath(String nestedPath) {
        }

        @Override
        public String getNestedPath() {
            return null;
        }

        @Override
        public void pushNestedPath(String subPath) {
        }

        @Override
        public void popNestedPath() throws IllegalStateException {
        }

        @Override
        public void reject(String errorCode) {
        }

        @Override
        public void reject(String errorCode, String defaultMessage) {
        }

        @Override
        public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {
        }

        @Override
        public void rejectValue(String field, String errorCode) {
        }

        @Override
        public void rejectValue(String field, String errorCode, String defaultMessage) {
        }

        @Override
        public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {
        }

        @Override
        public void addAllErrors(Errors errors) {
        }

        @Override
        public boolean hasErrors() {
            return false;
        }

        @Override
        public int getErrorCount() {
            return 0;
        }

        @Override
        public List<ObjectError> getAllErrors() {
            return null;
        }

        @Override
        public boolean hasGlobalErrors() {
            return false;
        }

        @Override
        public int getGlobalErrorCount() {
            return 0;
        }

        @Override
        public List<ObjectError> getGlobalErrors() {
            return null;
        }

        @Override
        public ObjectError getGlobalError() {
            return null;
        }

        @Override
        public boolean hasFieldErrors() {
            return false;
        }

        @Override
        public int getFieldErrorCount() {
            return 0;
        }

        @Override
        public List<FieldError> getFieldErrors() {
            return null;
        }

        @Override
        public FieldError getFieldError() {
            return null;
        }

        @Override
        public boolean hasFieldErrors(String field) {
            return false;
        }

        @Override
        public int getFieldErrorCount(String field) {
            return 0;
        }

        @Override
        public List<FieldError> getFieldErrors(String field) {
            return null;
        }

        @Override
        public FieldError getFieldError(String field) {
            return null;
        }

        @Override
        public Object getFieldValue(String field) {
            return null;
        }

        @Override
        public Class<?> getFieldType(String field) {
            return null;
        }

        @Override
        public Object getTarget() {
            return null;
        }

        @Override
        public Map<String, Object> getModel() {
            return null;
        }

        @Override
        public Object getRawFieldValue(String field) {
            return null;
        }

        @Override
        public PropertyEditor findEditor(String field, Class<?> valueType) {
            return null;
        }

        @Override
        public PropertyEditorRegistry getPropertyEditorRegistry() {
            return null;
        }

        @Override
        public String[] resolveMessageCodes(String errorCode) {
            return null;
        }

        @Override
        public String[] resolveMessageCodes(String errorCode, String field) {
            return null;
        }

        @Override
        public void addError(ObjectError error) {

        }

    }

    private class MockModel implements Model {

        @Override
        public Model addAttribute(String attributeName, Object attributeValue) {
            return null;
        }

        @Override
        public Model addAttribute(Object attributeValue) {
            return null;
        }

        @Override
        public Model addAllAttributes(Collection<?> attributeValues) {
            return null;
        }

        @Override
        public Model addAllAttributes(Map<String, ?> attributes) {
            return null;
        }

        @Override
        public Model mergeAttributes(Map<String, ?> attributes) {
            return null;
        }

        @Override
        public boolean containsAttribute(String attributeName) {
            return false;
        }

        @Override
        public Object getAttribute(String attributeName) {
            return null;
        }

        @Override
        public Map<String, Object> asMap() {
            return null;
        }

    }

    private class MockCardRepository implements CardRepository {

        @Override
        public <S extends Card> S save(S entity) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public <S extends Card> Iterable<S> saveAll(Iterable<S> entities) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Optional<Card> findById(String id) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean existsById(String id) {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public Iterable<Card> findAll() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Iterable<Card> findAllById(Iterable<String> ids) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public long count() {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public void deleteById(String id) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void delete(Card entity) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void deleteAll(Iterable<? extends Card> entities) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void deleteAll() {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public List<Card> findByUserId(int userId) {
            List<Card> cardList = new ArrayList<>();
            return cardList;
        }

    }

    private class MockCardInteractor implements CardInteractor {

        @Override
        public void registerCard(Card card) {
        }

        @Override
        public Card newCard(String name, int userId, String company, String brand) {
            return null;
        }

        @Override
        public jp.co.niconiconi.cardapp.domain.model.Card newCardModel(Card card, int userId) {
            return new jp.co.niconiconi.cardapp.domain.model.Card("aabbbcccddddd", 1, "test", "testCompany", "testBrand");
        }

    }
}
