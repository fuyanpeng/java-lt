package designpattern.factorydesign.factories;

import designpattern.factorydesign.factories.parses.IRuleConfigParse;

public interface IRuleConfigParseFactory {
    IRuleConfigParse createParse();
}

