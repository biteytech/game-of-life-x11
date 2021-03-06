// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XTextProperty {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("value"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("encoding"),
        Constants$root.C_INT$LAYOUT.withName("format"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nitems")
    );
    public static MemoryLayout $LAYOUT() {
        return XTextProperty.$struct$LAYOUT;
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return XTextProperty.value$VH;
    }
    public static MemoryAddress value$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XTextProperty.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, MemoryAddress x) {
        XTextProperty.value$VH.set(seg, x);
    }
    public static MemoryAddress value$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XTextProperty.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemoryAddress x) {
        XTextProperty.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle encoding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("encoding"));
    public static VarHandle encoding$VH() {
        return XTextProperty.encoding$VH;
    }
    public static long encoding$get(MemorySegment seg) {
        return (long)XTextProperty.encoding$VH.get(seg);
    }
    public static void encoding$set( MemorySegment seg, long x) {
        XTextProperty.encoding$VH.set(seg, x);
    }
    public static long encoding$get(MemorySegment seg, long index) {
        return (long)XTextProperty.encoding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void encoding$set(MemorySegment seg, long index, long x) {
        XTextProperty.encoding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle format$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("format"));
    public static VarHandle format$VH() {
        return XTextProperty.format$VH;
    }
    public static int format$get(MemorySegment seg) {
        return (int)XTextProperty.format$VH.get(seg);
    }
    public static void format$set( MemorySegment seg, int x) {
        XTextProperty.format$VH.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)XTextProperty.format$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        XTextProperty.format$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nitems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nitems"));
    public static VarHandle nitems$VH() {
        return XTextProperty.nitems$VH;
    }
    public static long nitems$get(MemorySegment seg) {
        return (long)XTextProperty.nitems$VH.get(seg);
    }
    public static void nitems$set( MemorySegment seg, long x) {
        XTextProperty.nitems$VH.set(seg, x);
    }
    public static long nitems$get(MemorySegment seg, long index) {
        return (long)XTextProperty.nitems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nitems$set(MemorySegment seg, long index, long x) {
        XTextProperty.nitems$VH.set(seg.asSlice(index*sizeof()), x);
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


