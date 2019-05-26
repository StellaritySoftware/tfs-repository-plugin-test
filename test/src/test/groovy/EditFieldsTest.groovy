import commonpages.LoginPage
import configuration.CommonConfig
import geb.spock.GebReportingSpec

class EditFieldsTest extends GebReportingSpec
{
    def run()
    {
        when:

        def loginPage = browser.to LoginPage

        def dashboardPage = loginPage.login(CommonConfig.user, CommonConfig.password)
        
        then:
        true
    }
}
