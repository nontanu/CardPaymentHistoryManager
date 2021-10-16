package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.PropertyEditor;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import jp.co.niconiconi.cardapp.Interactor.UserInteractor;
import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.form.UserRegistrationForm;
import jp.co.niconiconi.cardapp.service.UserRegistrationService;

public class UserRegistrationContorollerTest {

    private final UserRegistrationContoroller userRegistContoroller;

    public UserRegistrationContorollerTest() {
        this.userRegistContoroller = new UserRegistrationContoroller(
                new UserRegistrationService(new MockUserInteractor()));
    }

    @Test
    public void testIndexReturnStr() {
        assertEquals(ReturnUrls.PAGE_USER_REGIST.getUrl(), userRegistContoroller.index());
    }

    @Test
    public void testRegist() {
        BindingResult result = new MockResult();
        Model model = new MockModel();
        UserRegistrationForm form = new UserRegistrationForm();
        assertEquals(ReturnUrls.REDIRECT_LOGIN.getUrl(), userRegistContoroller.regist(form, result, model));
    }

    private class MockResult implements BindingResult {

        @Override
        public String getObjectName() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public void setNestedPath(String nestedPath) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public String getNestedPath() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public void pushNestedPath(String subPath) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void popNestedPath() throws IllegalStateException {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void reject(String errorCode) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void reject(String errorCode, String defaultMessage) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void rejectValue(String field, String errorCode) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void rejectValue(String field, String errorCode, String defaultMessage) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void addAllErrors(Errors errors) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public boolean hasErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public int getErrorCount() {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public List<ObjectError> getAllErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean hasGlobalErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public int getGlobalErrorCount() {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public List<ObjectError> getGlobalErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public ObjectError getGlobalError() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean hasFieldErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public int getFieldErrorCount() {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public List<FieldError> getFieldErrors() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public FieldError getFieldError() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean hasFieldErrors(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public int getFieldErrorCount(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public List<FieldError> getFieldErrors(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public FieldError getFieldError(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Object getFieldValue(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Class<?> getFieldType(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Object getTarget() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Map<String, Object> getModel() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Object getRawFieldValue(String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public PropertyEditor findEditor(String field, Class<?> valueType) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public PropertyEditorRegistry getPropertyEditorRegistry() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public String[] resolveMessageCodes(String errorCode) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public String[] resolveMessageCodes(String errorCode, String field) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public void addError(ObjectError error) {
            // TODO 自動生成されたメソッド・スタブ

        }

    }

    private class MockModel implements Model {

        @Override
        public Model addAttribute(String attributeName, Object attributeValue) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Model addAttribute(Object attributeValue) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Model addAllAttributes(Collection<?> attributeValues) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Model addAllAttributes(Map<String, ?> attributes) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Model mergeAttributes(Map<String, ?> attributes) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean containsAttribute(String attributeName) {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public Object getAttribute(String attributeName) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Map<String, Object> asMap() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

    }

    private class MockUserInteractor implements UserInteractor {

        @Override
        public void registerLoginUser(String userId, String password) {
        }
    }
}
