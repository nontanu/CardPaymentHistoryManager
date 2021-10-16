package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.PropertyEditor;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.form.CardRegistrationForm;
import jp.co.niconiconi.cardapp.service.CardRegistrationService;

public class CardRegistrationControllerTest {

    private final CardRegistrationController cardRegistController;

    public CardRegistrationControllerTest() {
        this.cardRegistController = new CardRegistrationController(new CardRegistrationService(new MockHttpSession()));
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
}
