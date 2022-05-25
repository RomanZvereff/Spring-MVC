// registration form validation
$('#signUpModal .btn.btn-success').prop('disabled', true);

let isFirstNameValid, isLastNameValid, isEmailValid, isPasswordValid, isPasswordsMatch;

$('#first-name-sign-up').focusout(function () {
    if ($('#first-name-sign-up').val().length < 2) {
        isFirstNameValid = false;
        if (!$('#first-name-sign-up').parent().find('.sign-warning-msg').length) {
            $('#first-name-sign-up').parent().append('<span class="sign-warning-msg">First name is too short</span>');
        }
    } else {
        isFirstNameValid = true;
        if ($('#first-name-sign-up').parent().find('.sign-warning-msg').length) {
            $('#first-name-sign-up').parent().find('.sign-warning-msg').remove();
        }
    }
    isAllFieldValid();
});

$('#last-name-sign-up').focusout(function () {
    if ($('#last-name-sign-up').val().length < 2) {
        isLastNameValid = false;
        if (!$('#last-name-sign-up').parent().find('.sign-warning-msg').length) {
            $('#last-name-sign-up').parent().append('<span class="sign-warning-msg">Last name is too short</span>');
        }
    } else {
        isLastNameValid = true;
        if ($('#last-name-sign-up').parent().find('.sign-warning-msg').length) {
            $('#last-name-sign-up').parent().find('.sign-warning-msg').remove();
        }
    }
    isAllFieldValid();
});

$('#email-address-sign-up').focusout(function () {
    let emailRegex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!emailRegex.test($('#email-address-sign-up').val())) {
        isEmailValid = false;
        if (!$('#email-address-sign-up').parent().find('.sign-warning-msg').length) {
            $('#email-address-sign-up').parent().append('<span class="sign-warning-msg">Email address is invalid</span>');
        }
    } else {
        isEmailValid = true;
        if ($('#email-address-sign-up').parent().find('.sign-warning-msg').length) {
            $('#email-address-sign-up').parent().find('.sign-warning-msg').remove();
        }
    }
    isAllFieldValid();
});

$('#password-sign-up').keyup(function () {
    let passValue = $('#password-sign-up').val();
    if (passValue.length < 8 || passValue.length > 16) {
        isPasswordValid = false;
        if (!$('#password-sign-up').parent().find('.sign-warning-msg').length) {
            $('#password-sign-up').parent().append('<span class="sign-warning-msg">Password must be from 8 to 16 characters</span>');
        }
    } else {
        isPasswordValid = true;
        if ($('#password-sign-up').parent().find('.sign-warning-msg').length) {
            $('#password-sign-up').parent().find('.sign-warning-msg').remove();
        }
    }
    isAllFieldValid();
});

$('#confirm-pass-sign-up').keyup(function () {
    if ($('#confirm-pass-sign-up').val() !== $('#password-sign-up').val()) {
        isPasswordsMatch = false;
        if (!$('#confirm-pass-sign-up').parent().find('.sign-warning-msg').length) {
            $('#confirm-pass-sign-up').parent().append('<span class="sign-warning-msg">Password doesn\'t match</span>');
        }
    } else {
        isPasswordsMatch = true;
        if ($('#confirm-pass-sign-up').parent().find('.sign-warning-msg').length) {
            $('#confirm-pass-sign-up').parent().find('.sign-warning-msg').remove();
        }
    }
    isAllFieldValid();
});

function isAllFieldValid() {
    if (isFirstNameValid && isLastNameValid && isEmailValid && isPasswordValid && isPasswordsMatch) {
        $('#signUpModal .btn.btn-success').prop('disabled', false);
    }
}

$('.sign-up-close').click(function() {
    let inputArr = $('.sign-up-form').find('.form-control');
    inputArr.each(function() {
        if ($(this).val().length === 0) {
            $(this).parent().find('.sign-warning-msg').remove();
        }
    });
});






