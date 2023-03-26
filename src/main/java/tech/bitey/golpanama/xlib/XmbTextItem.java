// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     char* chars;
 *     int nchars;
 *     int delta;
 *     XFontSet font_set;
 * };
 * }
 */
public class XmbTextItem {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("chars"),
        Constants$root.C_INT$LAYOUT.withName("nchars"),
        Constants$root.C_INT$LAYOUT.withName("delta"),
        Constants$root.C_POINTER$LAYOUT.withName("font_set")
    );
    public static MemoryLayout $LAYOUT() {
        return XmbTextItem.$struct$LAYOUT;
    }
    static final VarHandle chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chars"));
    public static VarHandle chars$VH() {
        return XmbTextItem.chars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* chars;
     * }
     */
    public static MemorySegment chars$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XmbTextItem.chars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* chars;
     * }
     */
    public static void chars$set(MemorySegment seg, MemorySegment x) {
        XmbTextItem.chars$VH.set(seg, x);
    }
    public static MemorySegment chars$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XmbTextItem.chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chars$set(MemorySegment seg, long index, MemorySegment x) {
        XmbTextItem.chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nchars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nchars"));
    public static VarHandle nchars$VH() {
        return XmbTextItem.nchars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nchars;
     * }
     */
    public static int nchars$get(MemorySegment seg) {
        return (int)XmbTextItem.nchars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nchars;
     * }
     */
    public static void nchars$set(MemorySegment seg, int x) {
        XmbTextItem.nchars$VH.set(seg, x);
    }
    public static int nchars$get(MemorySegment seg, long index) {
        return (int)XmbTextItem.nchars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nchars$set(MemorySegment seg, long index, int x) {
        XmbTextItem.nchars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delta"));
    public static VarHandle delta$VH() {
        return XmbTextItem.delta$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int delta;
     * }
     */
    public static int delta$get(MemorySegment seg) {
        return (int)XmbTextItem.delta$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int delta;
     * }
     */
    public static void delta$set(MemorySegment seg, int x) {
        XmbTextItem.delta$VH.set(seg, x);
    }
    public static int delta$get(MemorySegment seg, long index) {
        return (int)XmbTextItem.delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delta$set(MemorySegment seg, long index, int x) {
        XmbTextItem.delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_set"));
    public static VarHandle font_set$VH() {
        return XmbTextItem.font_set$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XFontSet font_set;
     * }
     */
    public static MemorySegment font_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XmbTextItem.font_set$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XFontSet font_set;
     * }
     */
    public static void font_set$set(MemorySegment seg, MemorySegment x) {
        XmbTextItem.font_set$VH.set(seg, x);
    }
    public static MemorySegment font_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XmbTextItem.font_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_set$set(MemorySegment seg, long index, MemorySegment x) {
        XmbTextItem.font_set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


