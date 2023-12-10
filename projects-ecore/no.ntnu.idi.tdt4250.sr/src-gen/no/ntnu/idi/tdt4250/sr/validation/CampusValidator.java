/**
 *
 * $Id$
 */
package no.ntnu.idi.tdt4250.sr.validation;

import no.ntnu.idi.tdt4250.sr.CampusBuilding;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link no.ntnu.idi.tdt4250.sr.Campus}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CampusValidator {
	boolean validate();

	boolean validateCampusbuilding(EList<CampusBuilding> value);

	boolean validateID(int value);
}