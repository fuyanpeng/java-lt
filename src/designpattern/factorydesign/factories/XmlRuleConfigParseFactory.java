package designpattern.factorydesign.factories;

import designpattern.factorydesign.factories.parses.IRuleConfigParse;
import designpattern.factorydesign.factories.parses.XmlRuleConfigParse;

public class XmlRuleConfigParseFactory implements IRuleConfigParseFactory{

    @Override
    public IRuleConfigParse createParse() {
        return new XmlRuleConfigParse();
    }
}
