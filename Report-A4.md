# Untitled

**SENG 438 - Software Testing, Reliability, and Quality**

Lab. Report #4 – Mutation Testing and Web app testing

Group: 6

---

Jonathan

---

Dongwook (Luke)

---

Aarushi

---

Ahsan

---

# Table of Contents

[Analysis of 10 Mutants of the Range class](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.h83xygmeafhf)

[Report all the statistics and the mutation score for each test class (screenshots)](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.v0gre1eqb22e)

[Analysis drawn on the effectiveness of each of the test classes](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.pkcbifrcxb1q)

[A discussion on the effect of equivalent mutants on mutation score accuracy](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.5r92q0w5zico)

[A discussion of what could have been done to improve the mutation score of the test suites](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.90022njl4ixu)

[Why do we need mutation testing? Advantages and disadvantages of mutation testing](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.jn548vs2kaam)

[Explain your SELENIUM test case design process](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.we5m9jgtpesg)

[Explain the use of assertions and checkpoints](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.z8w4ez9qbxkb)

[How did you test each functionality with different test data](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.xxfee64qnbc1)

[Discuss advantages and disadvantages of Selenium vs. Sikulix](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.d9t04gm8d31r)

[A discussion on how the team work/effort was divided and managed](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.htvmq3jmuo70)

[Any difficulties encountered, challenges overcome, and lessons learned from performing the lab](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.xy5t7uig3bkg)

[Comments/feedback on the lab itself](https://docs.google.com/document/d/19z9GIxuDt7ARJTAbFTVsQ33IKqBzWuZTGtrsC8HWTZc/edit#heading=h.1jprs1r5qudn)

Introduction

In this lab we explored Mutation and GUI testing with automation tools like PiTest and Selenium. We conducted mutation testing on the JFreeChart SUT from previous labs and added new test cases to improve the mutation test scores. We conducted GUI testing with popular e-commerce websites like Amazon and wrote test scripts using Selenium.

# Analysis of 10 Mutants of the Range class

1. method = double getCentralValue()

Replaced double addition with modulus → SURVIVED

2. method = double getLength()

mutation = Negated double field upper → KILLED

3. method = boolean contains(double value)

mutation =  removed conditional - replaced comparison check with false → SURVIVED

4. method = Range combineIgnoringNaN(Range range1, Range range2)

mutation = removed call to org/jfree/data/Range::isNaNRange → KILLED

5. Method = scale(Range base, double factor)

Mutation = Substituted 0.0 with 1.0 → SURVIVED

6. Method = toString()

Mutation = → SURVIVED

7. Method = expandToInclude()

Mutation =  → KILLED

8. Method = isNaNRange()

Mutation = → KILLED

# 

# Report all the statistics and the mutation score for each test class (screenshots)

Mutation Scores from Lab 3 (old statistics)

[https://lh6.googleusercontent.com/iBxl0RufcIPSUHBt3KKF8eHU-EMk9KBOiOfAvlwsCi2tRmUIMP0O2gquaTzLHVXpo_-TxvQoq02URn664808kaOxGVIuJAwfgBKaTWqr6tljhVglmkD6GR6LHANoexb6UZEholclzXnkc2yfl5R7D0k](https://lh6.googleusercontent.com/iBxl0RufcIPSUHBt3KKF8eHU-EMk9KBOiOfAvlwsCi2tRmUIMP0O2gquaTzLHVXpo_-TxvQoq02URn664808kaOxGVIuJAwfgBKaTWqr6tljhVglmkD6GR6LHANoexb6UZEholclzXnkc2yfl5R7D0k)

[https://lh3.googleusercontent.com/nesRdStvfbH7XKVM3KpFx7T4-3faa5pLbATL3C_qZKbHaX25jlpVvGxvHyidq6T7hl10e9Z2K3cbKCSkWY81zIFx4OsqPOJDTzNUr4kdzPN12QhicM8dLaCferLwj0wntmxChBsz2G6TrPV6ZjqZqXk](https://lh3.googleusercontent.com/nesRdStvfbH7XKVM3KpFx7T4-3faa5pLbATL3C_qZKbHaX25jlpVvGxvHyidq6T7hl10e9Z2K3cbKCSkWY81zIFx4OsqPOJDTzNUr4kdzPN12QhicM8dLaCferLwj0wntmxChBsz2G6TrPV6ZjqZqXk)

[https://lh6.googleusercontent.com/wS7yIYuBVh8WRs6s_9drs8rwUso_VHGjkrGRkYA2zOQsSwAM7YBoVgAM4zghNiuC8ZcsRpBHRrSDDAFooWjA0fAuOhyjqg1oyQsJmyEocpRA7d8iSt3eZ_ZJCYK_JRxSj5yV3J9zHQaLP0jX5u3o_Lo](https://lh6.googleusercontent.com/wS7yIYuBVh8WRs6s_9drs8rwUso_VHGjkrGRkYA2zOQsSwAM7YBoVgAM4zghNiuC8ZcsRpBHRrSDDAFooWjA0fAuOhyjqg1oyQsJmyEocpRA7d8iSt3eZ_ZJCYK_JRxSj5yV3J9zHQaLP0jX5u3o_Lo)

Mutation Scores from Lab 4 (new statistics)

# Analysis drawn on the effectiveness of each of the test classes

It was a lot more effective to capture and kill mutants in the DataUtilities class compared to Range, mainly because there is less code to test and fewer methods.

# A discussion on the effect of equivalent mutants on mutation score accuracy

A mutant is a fault injected into the program and is killed by the test suite when it produces a different output while running the same tests as the original program. Otherwise the mutant survives. The mutant score provides a measure of how strong the test cases are by showing us the number of mutants killed divided by the total number of mutants injected. Equivalent mutants always have the same behavior as the original program, for example x = a+b and x = a - (-b). This means that the test suite does not actually kill the mutant. When equivalent mutants are injected and considered as part of the “kill count” they skew the mutation score by incorrectly inflating the total number of mutants killed.

# A discussion of what could have been done to improve the mutation score of the test suites

We added the following new tests to increase the mutation scores by 10%.

**Aarushi-**

I increased the mutation scores by adding new test cases for the methods I had tested in the previous labs.

Mutations for both null column/row values and null data values were surviving so I added two new tests. These cover the mutants

*“removed call to org/jfree/chart/util/ParamChecks::nullNotPermitted” for the line*

*“ParamChecks.nullNotPermitted(data, "data");”*

@Test (expected = IllegalArgumentException.class)

public void calculateRowTotal_NullValuesandCol() {

int[] col= {25};

Values2D values=null;

double result = DataUtilities.calculateRowTotal(values, 1, col);

}

@Test (expected = IllegalArgumentException.class)

public void calculatedColumnTotal_NullValuesandRows(){

Values2D values= null;

int[] rows= {25};

double result = DataUtilities.calculateColumnTotal(values, 1, rows);

}

**Jonathan-**

For the scale function, the following mutations survived.

removed call to org/jfree/chart/util/ParamChecks::nullNotPermitted → SURVIVED

For the line:

*ParamChecks.nullNotPermitted(base, "base");*

Substituted 0.0 with 1.0 → SURVIVED

Substituted 0.0 with -1.0 → SURVIVED

For the line:

*if (factor < 0) {*

Thus I created the following 3 test cases in response:

// This test verifies that the scale function works with a small positive factor

@Test

public void scale_smallPositiveFactor(){

Range range1 = new Range(-10,10);

Range range = Range.scale(range1,0.1);

assertEquals("The lower range is", -11, range.getLowerBound(), .000000001d);

assertEquals("The upper range is", 11, range.getUpperBound(), .000000001d);

}

// This test verifies that the scale function raises IllegalArgumentException if a large negative factor is given

@Test(expected=IllegalArgumentException.class)

public void scale_largeNegativeFactor(){

Range range1 = new Range(-10,10);

Range range = Range.scale(range1,-10);

}

// This test verifies that the scale function raises IllegalArgumentException if a null 'base' parameter is given

@Test(expected=IllegalArgumentException.class)

public void scale_nullParameter(){

Range range1 = null;

Range range = Range.scale(range1,-1);

}

**Luke-**

In the equal function of DataUtilities, I found that similar mutations survived related to data manipulation of my 2d array values. Here is an example of a 2d array that was used to test equality:

e = new double[3][2];

e[0][0] = 1;

e[0][1] = 2;

e[1][0] = 3;

e[1][1] = 3;

e[2][0] = 2;

e[2][1] = 2;

From just the line with e[2][1] = 2, the following mutation errors survived:

Substituted 2.0 with 3.0 → SURVIVED

Substituted 2.0 with 1.0 → SURVIVED

Substituted 2.0 with -2.0 → SURVIVED

Substituted 2.0 with -1.0 → SURVIVED

…. And more

These are all mutations associated with the value of e[2][1] being manipulated from 2.0 to something else. The reason these mutations are not killed is because we aren’t comparing equality of the e[2][1] value with any other array. This is because 2d array e had the biggest row size of 3 (hence the access index of 2) which was not being checked by any tests. I combated these mutations by creating an identical array for each array type I had and comparing equality. By taking the example we have I created f from e:

// Contains same values as e

e_dupe = new double[3][2];

e_dupe[0][0] = 1;

e_dupe[0][1] = 2;

e_dupe[1][0] = 3;

e_dupe[1][1] = 3;

e_dupe[2][0] = 2;

e_dupe[2][1] = 2;

Then I created this test case:

@Test

public void sameArraySizeAndValues() {

assertTrue("Should be equal", DataUtilities.equal(e, e_dupe));

}

This will ensure that all values remain consistent throughout the testing phase. Making sure these mutations are killed is crucial as we are dealing with a function related to equality.

By following the same procedure with all other 2d arrays I created, I was able to bring mutation coverage from 56% up to 98%!

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

We need mutation testing because coverage metrics alone cannot ensure the quality of testing (ie. how good is the test suite). We need to find out when all the tests are passing, is it because all the bugs are caught or because the test cases are poorly written? This is where mutation testing comes into play.

**Advantages of Mutation Testing:**

- Product is most stable and reliable after mutation testing
- High coverage of the source program is attained
- Program mutants are tested thoroughly
- Quality of testing can improve significantly
- Loopholes in test data can be identified

**Disadvantages of Mutation testing:**

- Complex mutations are difficult to implement
- Mutation testing is time-consuming and expensive
- Automation is necessary for mutation testing because its time consuming
- Testers need to have the programming knowledge to do mutation testing
- Mutation testing is not applicable for black-box testing as it involves a lot of source code changes
- Large mutant programs need to be tested against the original test suite

Source: [https://www.softwaretestingclass.com/mutation-testing-advantages-and-disadvantages/](https://www.softwaretestingclass.com/mutation-testing-advantages-and-disadvantages/)

# Explain your SELENIUM test case design process

**Aarushi-**

I tested the “Login” and “New Account Registration” for the Amazon Canada website. The first step was to understand how to use Selenium, manage Selenium’s interactions with a web browser, what to install etc. Then I visited Amazon's Login and Registration pages to find out which fields need to be entered by the user and what is considered valid and invalid inputs. I also used the “Inspect” function on Chrome to note down the element ID of each web element the Selenium script needs to enter input for.

**Jonathan-**

I tested the “product viewing” and “Shopping Cart” functionality for the Amazon Canada website. Starting from the homepage, the test case navigates to a specific item, views it and adds it to the shopping cart. It then verifies that the item was added to the shopping cart. I then test the quantity and delete features by increasing the item quantity, verifying it on the page, then verifying that removing all items in the shopping cart leaves it empty.

**Luke-**

I was in charge of testing the “view a product” and “payment process” on Amazon Canada. The test case flow included searching for an item (Kindle) then clicking on the item based on the unique CSS identifier. Test was validated by checking the product name of the product that’s being viewed. For the payment process, I modeled a guest checkout workflow with dummy data. This allowed me to access pages that are safeguarded initially and checked various elements such as the checkout button and final message.

**Ahsan-**

# Explain the use of assertions and checkpoints

**Aarushi-**

Login: For valid data entered the script checks that the “current url” of the website matches the “expected url” of the website. Since correct user credentials are entered the  current url should be the user’s Amazon homepage. If the current and expected urls do  not match then an error message is thrown alerting the tester. For invalid data entered  the script checks that a web element with an “id = auth-warning-message-box” is  displayed. If it is not displayed an error message is thrown alerting the tester.

New Account Registration: For valid data entered the script checks that the “current url” of the website matches the “expected url” of the website. Since valid sign up information is entered the current url should be the email verification page. If the current and expected urls do not match then an error message is thrown alerting the tester. For invalid data entered the script checks that a web element with an “id = auth-password-mismatch-alert” is displayed. If it is not displayed an error message is thrown alerting the tester.

**Jonathan-**

Shopping Cart: Asserts are used within this unit test by verifying the quantity of items in the shopping cart at any time. By checking the text value of a specific textbox through its id and xpath, I assert that it is correct.

**Luke-**For viewing an item, assertions were used to validate that the final product being accessed had the expected name. I inserted an expected product name when the user clicks the first product after searching “kindle” and logged an error if the product names were not matched.

As for the checkout process testing, due to limitations of duping payment info (although possible but tedious) I decided to assert behaviors when valid and invalid addresses are inputted as the destination. When invalid data is fed in, I asserted the error field that becomes exposed to the user to make sure the error is being thrown properly.

# How did you test each functionality with different test data

**Aarushi-**

Login: First test with valid email and valid password, for an existing Amazon account. Second test with valid email and invalid password.

New Account Registration: First test with valid format for name and email. Valid password meeting requirements (minimum 6 characters) and matching password in the “confirm password” field. Second test with invalid format for name and email. Password less than 6 characters and mismatched password in the “confirm password” field.

**Luke-**

Viewing item: First test with a search then click workflow, then test with a different path (such as looking at main deals then clicking on an item)

Payment flow: First tested with all valid user data (such as address, email) and then tested with invalid data inputted (made sure error messages were thrown properly)

# Discuss advantages and disadvantages of Selenium vs. Sikulix

**Selenium Advantages:**

- More popular tool so better documentation, help forums etc
- Can be used to automate tests to save time
- Easy to integrate with different web browsers like Google Chrome
- Supports variety of languages and more new versions of each language like C#, Java, Python, Ruby, JavaScript

**Selenium Disadvantages:**

- Only works on webpages
- Might be difficult to target a certain element on responsive web pages since coordinates cannot be used. In one test case despite attempts to target an element using multiple values it still missed.

**SikuliX Advantages:**

- Works on any GUI running on Windows, Mac or Linux, not just webpages like Selenium
- Uses image recognition
- Can be used to automate tests to save time

**SikuliX Disadvantages:**

- Limited language support, works for Python 2.7, Ruby 1.9/2.0, Javascript and some Java aware languages like Jython and JRuby.
- Saved images may match multiple elements. Might cause issues when re-running tests.

# A discussion on how the team work/effort was divided and managed

**Aarushi:** Wrote the Selenium scripts for testing Login and New Account Registration for the Amazon website. Wrote new test cases for the calculateRowTotal and calculateColumnTotal methods from DataUtilities to increase the mutation score. Contributed to all parts of the lab report.

**Ahsan:** Wrote Selenium scripts for Wishlist, select store on the Amazon Canada website. Wrote extra test cases for toString() and expandToInclude().

**Luke:** Wrote Selenium scripts with the help of Selenium IDE for viewing an item and checking it out on Amazon Canada website. I also wrote more test cases for the equal() function in DataUtilities to increase the mutation score. I also contributed to all parts of the lab report.

**Jonathan:**

# Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

**Aarushi:** I had never used PiTest or Selenium before so there was a bit of a learning curve for both tools. PiTest starts off by outputting an extraordinary number of errors to the console and takes more than 30 minutes to generate the finished mutation report. It took me a while to understand what was going on, at first I was not letting the PiTest run to completion thinking the application was frozen and the process was extremely CPU/RAM intensive. Additionally reading the mutation report was challenging due to the unfamiliar format and lack of documentation for PiTest.

**Ahsan:** I would say one of the major difficulties would be the wait time for PiTest as it took a long time to generate the final report for mutation testing. I also noticed that my mutation test would sometimes freeze.

**Luke:** PiTest was the biggest blocker of this lab, as running the tests took a lot of extra time than anticipated. In certain cases, the mutation analysis would simply freeze and not return any results after waiting a long time. As for Selenium, I had similar performance issues where I would click on an item in Amazon and the Selenium IDE would freeze before capturing the event properly.

**Jonathan:** One difficulty I encountered was running PiTest, as previously mentioned, oftentimes it seemed like it was frozen. But then after 10-20 minutes the results would show up.

# Comments/feedback on the lab itself

**Aarushi:** I enjoyed learning about Selenium in this lab. However it would be a lot more helpful if more documentation or tutorials were provided about PiTest and Selenium (most things linked on the lab manual led to 404s). Students should also be given a heads up about the errors generated when running PiTest and how long the process takes.

**Ahsan:** Overall, I found it to be quite helpful for learning mutation testing and GUI Testing. The instructions were very clear which helped a ton, I also used help from the slides for understanding core concepts, especially for mutation testing.

**Luke:** Overall the lab was very interesting, especially being able to see Selenium in action was really fun. However, the performance issues definitely created unnecessary idle time that made the lab much longer than it should’ve been.

**Jonathan:**

I really liked both tools used in this lab as it was something new and applicable to what we are learning. However, I found the surviving mutant values to be skewed by mutants which were not applicable or were duplicates.