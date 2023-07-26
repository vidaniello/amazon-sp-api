package com.github.vidaniello.amazon;

/**
 * Functional interface, The method returns a boolean warning whether or not to continue execution<br>
 * It is useful if, for example, in a container context, procedures are requested to stop.
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 *
 */
@FunctionalInterface
public interface AbortOperationRequest {

	public boolean isAbortRequest();
}
