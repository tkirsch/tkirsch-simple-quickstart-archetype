#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	private static final transient Logger LOG = LoggerFactory.getLogger(AppController.class);

	@RequestMapping(method = RequestMethod.GET, path = "/hallo/{name}")
	public String index(final String name) {
		LOG.debug("hallo {}", name);
		return "Hallo " + name;
	}
}
