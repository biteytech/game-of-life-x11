// Generated by jextract

package tech.bitey.golpanama.xlib;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import tech.bitey.golpanama.xlib._XImage.funcs;

final class constants$36 {

	// Suppresses default constructor, ensuring non-instantiability.
	private constants$36() {
	}

	static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG, RuntimeHelper.POINTER, JAVA_INT,
			JAVA_INT);
	static final MethodHandle const$1 = RuntimeHelper.upcallHandle(funcs.get_pixel.class, "apply",
			constants$36.const$0);
	static final MethodHandle const$2 = RuntimeHelper.downcallHandle(constants$36.const$0);
	static final VarHandle const$3 = constants$34.const$5.varHandle(MemoryLayout.PathElement.groupElement("get_pixel"));
	static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT, RuntimeHelper.POINTER, JAVA_INT, JAVA_INT,
			JAVA_LONG);
	static final MethodHandle const$5 = RuntimeHelper.upcallHandle(funcs.put_pixel.class, "apply",
			constants$36.const$4);
}
