// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XRectangle {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("x"),
        Constants$root.C_SHORT$LAYOUT.withName("y"),
        Constants$root.C_SHORT$LAYOUT.withName("width"),
        Constants$root.C_SHORT$LAYOUT.withName("height")
    );
    public static MemoryLayout $LAYOUT() {
        return XRectangle.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XRectangle.x$VH;
    }
    public static short x$get(MemorySegment seg) {
        return (short)XRectangle.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, short x) {
        XRectangle.x$VH.set(seg, x);
    }
    public static short x$get(MemorySegment seg, long index) {
        return (short)XRectangle.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, short x) {
        XRectangle.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XRectangle.y$VH;
    }
    public static short y$get(MemorySegment seg) {
        return (short)XRectangle.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, short x) {
        XRectangle.y$VH.set(seg, x);
    }
    public static short y$get(MemorySegment seg, long index) {
        return (short)XRectangle.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, short x) {
        XRectangle.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return XRectangle.width$VH;
    }
    public static short width$get(MemorySegment seg) {
        return (short)XRectangle.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, short x) {
        XRectangle.width$VH.set(seg, x);
    }
    public static short width$get(MemorySegment seg, long index) {
        return (short)XRectangle.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, short x) {
        XRectangle.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return XRectangle.height$VH;
    }
    public static short height$get(MemorySegment seg) {
        return (short)XRectangle.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, short x) {
        XRectangle.height$VH.set(seg, x);
    }
    public static short height$get(MemorySegment seg, long index) {
        return (short)XRectangle.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, short x) {
        XRectangle.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


