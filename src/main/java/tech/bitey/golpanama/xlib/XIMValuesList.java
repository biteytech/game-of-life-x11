// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XIMValuesList {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("count_values"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("supported_values")
    );
    public static MemoryLayout $LAYOUT() {
        return XIMValuesList.$struct$LAYOUT;
    }
    static final VarHandle count_values$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("count_values"));
    public static VarHandle count_values$VH() {
        return XIMValuesList.count_values$VH;
    }
    public static short count_values$get(MemorySegment seg) {
        return (short)XIMValuesList.count_values$VH.get(seg);
    }
    public static void count_values$set( MemorySegment seg, short x) {
        XIMValuesList.count_values$VH.set(seg, x);
    }
    public static short count_values$get(MemorySegment seg, long index) {
        return (short)XIMValuesList.count_values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void count_values$set(MemorySegment seg, long index, short x) {
        XIMValuesList.count_values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle supported_values$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("supported_values"));
    public static VarHandle supported_values$VH() {
        return XIMValuesList.supported_values$VH;
    }
    public static MemoryAddress supported_values$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XIMValuesList.supported_values$VH.get(seg);
    }
    public static void supported_values$set( MemorySegment seg, MemoryAddress x) {
        XIMValuesList.supported_values$VH.set(seg, x);
    }
    public static MemoryAddress supported_values$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XIMValuesList.supported_values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void supported_values$set(MemorySegment seg, long index, MemoryAddress x) {
        XIMValuesList.supported_values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


