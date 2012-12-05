/**
 * 
 */
package pagecode;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;

/**
 * @author jeffreyStern
 *
 */
public class Ontrack extends PageCodeBase {

	protected HtmlCommandButton submit;
	protected HtmlCommandButton submi;
	protected HtmlInputSecret pwc;
	protected HtmlCommandButton getSubmit() {
		if (submit == null) {
			submit = (HtmlCommandButton) findComponentInRoot("submit");
		}
		return submit;
	}

	protected HtmlCommandButton getSubmi() {
		if (submi == null) {
			submi = (HtmlCommandButton) findComponentInRoot("submi");
		}
		return submi;
	}

	protected HtmlInputSecret getPwc() {
		if (pwc == null) {
			pwc = (HtmlInputSecret) findComponentInRoot("pwc");
		}
		return pwc;
	}

}