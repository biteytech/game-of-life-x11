// Generated by jextract

package tech.bitey.golpanama.xutil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XTextItem16 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("chars"),
        Constants$root.C_INT$LAYOUT.withName("nchars"),
        Constants$root.C_INT$LAYOUT.withName("delta"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("font")
    );
    public static MemoryLayout $LAYOUT() {
        return XTextItem16.$struct$LAYOUT;
    }
    static final VarHandle chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chars"));
    public static VarHandle chars$VH() {
        return XTextItem16.chars$VH;
    }
    public static MemoryAddress chars$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XTextItem16.chars$VH.get(seg);
    }
    public static void chars$set( MemorySegment seg, MemoryAddress x) {
        XTextItem16.chars$VH.set(seg, x);
    }
    public static MemoryAddress chars$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XTextItem16.chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chars$set(MemorySegment seg, long index, MemoryAddress x) {
        XTextItem16.chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nchars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nchars"));
    public static VarHandle nchars$VH() {
        return XTextItem16.nchars$VH;
    }
    public static int nchars$get(MemorySegment seg) {
        return (int)XTextItem16.nchars$VH.get(seg);
    }
    public static void nchars$set( MemorySegment seg, int x) {
        XTextItem16.nchars$VH.set(seg, x);
    }
    public static int nchars$get(MemorySegment seg, long index) {
        return (int)XTextItem16.nchars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nchars$set(MemorySegment seg, long index, int x) {
        XTextItem16.nchars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delta"));
    public static VarHandle delta$VH() {
        return XTextItem16.delta$VH;
    }
    public static int delta$get(MemorySegment seg) {
        return (int)XTextItem16.delta$VH.get(seg);
    }
    public static void delta$set( MemorySegment seg, int x) {
        XTextItem16.delta$VH.set(seg, x);
    }
    public static int delta$get(MemorySegment seg, long index) {
        return (int)XTextItem16.delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delta$set(MemorySegment seg, long index, int x) {
        XTextItem16.delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font"));
    public static VarHandle font$VH() {
        return XTextItem16.font$VH;
    }
    public static long font$get(MemorySegment seg) {
        return (long)XTextItem16.font$VH.get(seg);
    }
    public static void font$set( MemorySegment seg, long x) {
        XTextItem16.font$VH.set(seg, x);
    }
    public static long font$get(MemorySegment seg, long index) {
        return (long)XTextItem16.font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, long x) {
        XTextItem16.font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


