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
 *     Pixmap background_pixmap;
 *     unsigned long background_pixel;
 *     Pixmap border_pixmap;
 *     unsigned long border_pixel;
 *     int bit_gravity;
 *     int win_gravity;
 *     int backing_store;
 *     unsigned long backing_planes;
 *     unsigned long backing_pixel;
 *     int save_under;
 *     long event_mask;
 *     long do_not_propagate_mask;
 *     int override_redirect;
 *     Colormap colormap;
 *     Cursor cursor;
 * };
 * }
 */
public class XSetWindowAttributes {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("background_pixmap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("background_pixel"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("border_pixmap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("border_pixel"),
        Constants$root.C_INT$LAYOUT.withName("bit_gravity"),
        Constants$root.C_INT$LAYOUT.withName("win_gravity"),
        Constants$root.C_INT$LAYOUT.withName("backing_store"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("backing_planes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("backing_pixel"),
        Constants$root.C_INT$LAYOUT.withName("save_under"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("event_mask"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("do_not_propagate_mask"),
        Constants$root.C_INT$LAYOUT.withName("override_redirect"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("colormap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cursor")
    );
    public static MemoryLayout $LAYOUT() {
        return XSetWindowAttributes.$struct$LAYOUT;
    }
    static final VarHandle background_pixmap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("background_pixmap"));
    public static VarHandle background_pixmap$VH() {
        return XSetWindowAttributes.background_pixmap$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Pixmap background_pixmap;
     * }
     */
    public static long background_pixmap$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.background_pixmap$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Pixmap background_pixmap;
     * }
     */
    public static void background_pixmap$set(MemorySegment seg, long x) {
        XSetWindowAttributes.background_pixmap$VH.set(seg, x);
    }
    public static long background_pixmap$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.background_pixmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void background_pixmap$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.background_pixmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle background_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("background_pixel"));
    public static VarHandle background_pixel$VH() {
        return XSetWindowAttributes.background_pixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long background_pixel;
     * }
     */
    public static long background_pixel$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.background_pixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long background_pixel;
     * }
     */
    public static void background_pixel$set(MemorySegment seg, long x) {
        XSetWindowAttributes.background_pixel$VH.set(seg, x);
    }
    public static long background_pixel$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.background_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void background_pixel$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.background_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_pixmap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("border_pixmap"));
    public static VarHandle border_pixmap$VH() {
        return XSetWindowAttributes.border_pixmap$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Pixmap border_pixmap;
     * }
     */
    public static long border_pixmap$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.border_pixmap$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Pixmap border_pixmap;
     * }
     */
    public static void border_pixmap$set(MemorySegment seg, long x) {
        XSetWindowAttributes.border_pixmap$VH.set(seg, x);
    }
    public static long border_pixmap$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.border_pixmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_pixmap$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.border_pixmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle border_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("border_pixel"));
    public static VarHandle border_pixel$VH() {
        return XSetWindowAttributes.border_pixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long border_pixel;
     * }
     */
    public static long border_pixel$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.border_pixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long border_pixel;
     * }
     */
    public static void border_pixel$set(MemorySegment seg, long x) {
        XSetWindowAttributes.border_pixel$VH.set(seg, x);
    }
    public static long border_pixel$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.border_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void border_pixel$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.border_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bit_gravity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bit_gravity"));
    public static VarHandle bit_gravity$VH() {
        return XSetWindowAttributes.bit_gravity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int bit_gravity;
     * }
     */
    public static int bit_gravity$get(MemorySegment seg) {
        return (int)XSetWindowAttributes.bit_gravity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int bit_gravity;
     * }
     */
    public static void bit_gravity$set(MemorySegment seg, int x) {
        XSetWindowAttributes.bit_gravity$VH.set(seg, x);
    }
    public static int bit_gravity$get(MemorySegment seg, long index) {
        return (int)XSetWindowAttributes.bit_gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bit_gravity$set(MemorySegment seg, long index, int x) {
        XSetWindowAttributes.bit_gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle win_gravity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("win_gravity"));
    public static VarHandle win_gravity$VH() {
        return XSetWindowAttributes.win_gravity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int win_gravity;
     * }
     */
    public static int win_gravity$get(MemorySegment seg) {
        return (int)XSetWindowAttributes.win_gravity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int win_gravity;
     * }
     */
    public static void win_gravity$set(MemorySegment seg, int x) {
        XSetWindowAttributes.win_gravity$VH.set(seg, x);
    }
    public static int win_gravity$get(MemorySegment seg, long index) {
        return (int)XSetWindowAttributes.win_gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void win_gravity$set(MemorySegment seg, long index, int x) {
        XSetWindowAttributes.win_gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_store$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("backing_store"));
    public static VarHandle backing_store$VH() {
        return XSetWindowAttributes.backing_store$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int backing_store;
     * }
     */
    public static int backing_store$get(MemorySegment seg) {
        return (int)XSetWindowAttributes.backing_store$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int backing_store;
     * }
     */
    public static void backing_store$set(MemorySegment seg, int x) {
        XSetWindowAttributes.backing_store$VH.set(seg, x);
    }
    public static int backing_store$get(MemorySegment seg, long index) {
        return (int)XSetWindowAttributes.backing_store$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_store$set(MemorySegment seg, long index, int x) {
        XSetWindowAttributes.backing_store$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_planes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("backing_planes"));
    public static VarHandle backing_planes$VH() {
        return XSetWindowAttributes.backing_planes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long backing_planes;
     * }
     */
    public static long backing_planes$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.backing_planes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long backing_planes;
     * }
     */
    public static void backing_planes$set(MemorySegment seg, long x) {
        XSetWindowAttributes.backing_planes$VH.set(seg, x);
    }
    public static long backing_planes$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.backing_planes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_planes$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.backing_planes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle backing_pixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("backing_pixel"));
    public static VarHandle backing_pixel$VH() {
        return XSetWindowAttributes.backing_pixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long backing_pixel;
     * }
     */
    public static long backing_pixel$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.backing_pixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long backing_pixel;
     * }
     */
    public static void backing_pixel$set(MemorySegment seg, long x) {
        XSetWindowAttributes.backing_pixel$VH.set(seg, x);
    }
    public static long backing_pixel$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.backing_pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backing_pixel$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.backing_pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle save_under$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("save_under"));
    public static VarHandle save_under$VH() {
        return XSetWindowAttributes.save_under$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int save_under;
     * }
     */
    public static int save_under$get(MemorySegment seg) {
        return (int)XSetWindowAttributes.save_under$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int save_under;
     * }
     */
    public static void save_under$set(MemorySegment seg, int x) {
        XSetWindowAttributes.save_under$VH.set(seg, x);
    }
    public static int save_under$get(MemorySegment seg, long index) {
        return (int)XSetWindowAttributes.save_under$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void save_under$set(MemorySegment seg, long index, int x) {
        XSetWindowAttributes.save_under$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event_mask"));
    public static VarHandle event_mask$VH() {
        return XSetWindowAttributes.event_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long event_mask;
     * }
     */
    public static long event_mask$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.event_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long event_mask;
     * }
     */
    public static void event_mask$set(MemorySegment seg, long x) {
        XSetWindowAttributes.event_mask$VH.set(seg, x);
    }
    public static long event_mask$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.event_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event_mask$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.event_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle do_not_propagate_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("do_not_propagate_mask"));
    public static VarHandle do_not_propagate_mask$VH() {
        return XSetWindowAttributes.do_not_propagate_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long do_not_propagate_mask;
     * }
     */
    public static long do_not_propagate_mask$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.do_not_propagate_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long do_not_propagate_mask;
     * }
     */
    public static void do_not_propagate_mask$set(MemorySegment seg, long x) {
        XSetWindowAttributes.do_not_propagate_mask$VH.set(seg, x);
    }
    public static long do_not_propagate_mask$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.do_not_propagate_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void do_not_propagate_mask$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.do_not_propagate_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return XSetWindowAttributes.override_redirect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int override_redirect;
     * }
     */
    public static int override_redirect$get(MemorySegment seg) {
        return (int)XSetWindowAttributes.override_redirect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int override_redirect;
     * }
     */
    public static void override_redirect$set(MemorySegment seg, int x) {
        XSetWindowAttributes.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)XSetWindowAttributes.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        XSetWindowAttributes.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colormap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colormap"));
    public static VarHandle colormap$VH() {
        return XSetWindowAttributes.colormap$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Colormap colormap;
     * }
     */
    public static long colormap$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.colormap$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Colormap colormap;
     * }
     */
    public static void colormap$set(MemorySegment seg, long x) {
        XSetWindowAttributes.colormap$VH.set(seg, x);
    }
    public static long colormap$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.colormap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colormap$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.colormap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cursor"));
    public static VarHandle cursor$VH() {
        return XSetWindowAttributes.cursor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Cursor cursor;
     * }
     */
    public static long cursor$get(MemorySegment seg) {
        return (long)XSetWindowAttributes.cursor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Cursor cursor;
     * }
     */
    public static void cursor$set(MemorySegment seg, long x) {
        XSetWindowAttributes.cursor$VH.set(seg, x);
    }
    public static long cursor$get(MemorySegment seg, long index) {
        return (long)XSetWindowAttributes.cursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cursor$set(MemorySegment seg, long index, long x) {
        XSetWindowAttributes.cursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


