/**
 *
 * $Id$
 */
package no.ntnu.idi.tdt4250.sr.validation;

/**
 * A sample validator interface for {@link no.ntnu.idi.tdt4250.sr.Lecturer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LecturerValidator {
	boolean validate();

	boolean validateID(int value);
}
