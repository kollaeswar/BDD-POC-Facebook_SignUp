$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fb_signup.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up functionality of Facebook",
  "description": "",
  "id": "sign-up-functionality-of-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Password validation during Sign Up for Facebook",
  "description": "",
  "id": "sign-up-functionality-of-facebook;password-validation-during-sign-up-for-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User fills all the fields by entering password with less characters",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "FirstName",
        "Lisa"
      ],
      "line": 8
    },
    {
      "cells": [
        "SurName",
        "Ray"
      ],
      "line": 9
    },
    {
      "cells": [
        "MobileNumber",
        "9909909909"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "qwe"
      ],
      "line": 11
    },
    {
      "cells": [
        "Day",
        "20"
      ],
      "line": 12
    },
    {
      "cells": [
        "Month",
        "11"
      ],
      "line": 13
    },
    {
      "cells": [
        "Year",
        "1990"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click on \u0027Sign Up\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User can see the error message for invalid password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_facebook_sign_up_page()"
});
formatter.result({
  "duration": 23267624900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_fills_all_the_fields_by_entering_password_with_less_characters(DataTable)"
});
formatter.result({
  "duration": 4701745700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Sign_Up_button()"
});
formatter.result({
  "duration": 82478900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_see_the_error_message_for_invalid_password()"
});
formatter.result({
  "duration": 27646932200,
  "status": "passed"
});
});