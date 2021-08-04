package designpattern.factorydesign.factories;

import designpattern.factorydesign.factories.parses.IRuleConfigParse;
import designpattern.factorydesign.factories.parses.YamlRuleConfigParse;

public class YamlRuleConfigParseFactory implements IRuleConfigParseFactory {

    @Override
    public IRuleConfigParse createParse(){
        return new YamlRuleConfigParse();
    }
}
