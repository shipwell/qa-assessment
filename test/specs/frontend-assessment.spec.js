
/*
    Using the URL below, perform a basic test to verify the web page title before proceeding
*/
describe('QA interview assessment using seleniumeasy.com demo site', () => {
    it('should have the right title', async () => {
        await browser.url('https://demo.seleniumeasy.com');
     })

/*
    For the below URL:
        1. Under the section Single Input Field, set the value in the message field to "QA assessment trial #1"
        2. Click 'Show Message' button
        3. Assert that "Your Message" matches "QA assessment trial #1"
*/
    it('should have the right Single Input Field message', async () => {
        await browser.url('https://demo.seleniumeasy.com/basic-first-form-demo.html')
        // your test script goes here

    });

/*
    For the below URL:
        1. Under the section Two Input Fields, set any value in the "Enter a" field and "Enter b" fields
        2. Click 'Get Total' button
        3. Assert that the "Total a + b =" field field contains the sum of the "a" and "b" field values
*/
    it('should have the right Single Input Field message', async () => {
        await browser.url('https://demo.seleniumeasy.com/basic-first-form-demo.html')
        // your test script goes here

    });
/*
    For the below URL:
        1. Under the Multiple Checkbox Demo section, review the three bullet items describing the checkbox behavior
        2. Note the following three test cases map to the three bullet items
        3. Complete the test script for each test case to verify the behavior described in each bullet item
*/
    it('should check all checkboxes', async () => {
        await browser.url('https://demo.seleniumeasy.com/basic-checkbox-demo.html')
        // your test script goes here

    });

    it('should test button change to Uncheck All', async () => {
        await browser.url('https://demo.seleniumeasy.com/basic-checkbox-demo.html')
        // your test script goes here

    });

    it('should test button change to Check All', async () => {
        await browser.url('https://demo.seleniumeasy.com/basic-checkbox-demo.html')
        // your test script goes here

    });
});