// Generated by jextract

package tech.bitey.golpanama.xlib;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import tech.bitey.golpanama.xlib._XImage.funcs;

final class constants$35 {

	// Suppresses default constructor, ensuring non-instantiability.
	private constants$35() {
	}

	static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER, RuntimeHelper.POINTER,
			RuntimeHelper.POINTER, JAVA_INT, JAVA_INT, JAVA_INT, RuntimeHelper.POINTER, JAVA_INT, JAVA_INT, JAVA_INT,
			JAVA_INT);
	static final MethodHandle const$1 = RuntimeHelper.upcallHandle(funcs.create_image.class, "apply",
			constants$35.const$0);
	static final MethodHandle const$2 = RuntimeHelper.downcallHandle(constants$35.const$0);
	static final VarHandle const$3 = constants$34.const$5
			.varHandle(MemoryLayout.PathElement.groupElement("create_image"));
	static final MethodHandle const$4 = RuntimeHelper.upcallHandle(funcs.destroy_image.class, "apply",
			constants$11.const$0);
	static final VarHandle const$5 = constants$34.const$5
			.varHandle(MemoryLayout.PathElement.groupElement("destroy_image"));
}
