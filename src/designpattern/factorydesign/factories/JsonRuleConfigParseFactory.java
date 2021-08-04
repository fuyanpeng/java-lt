package designpattern.factorydesign.factories;

import designpattern.factorydesign.factories.parses.IRuleConfigParse;
import designpattern.factorydesign.factories.parses.JsonRuleConfigParse;

public class JsonRuleConfigParseFactory implements IRuleConfigParseFactory{

    @Override
    public IRuleConfigParse createParse() {
        return new JsonRuleConfigParse();
    }
}
